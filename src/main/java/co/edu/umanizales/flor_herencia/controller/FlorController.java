package co.edu.umanizales.flor_herencia.controller;

import co.edu.umanizales.flor_herencia.model.Flor;
import co.edu.umanizales.flor_herencia.service.FlorService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/flores")
public class FlorController {

    @Autowired
    private FlorService florService;

    @GetMapping
    public List<Flor> obtenerTodasLasFlores() {
        return florService.listarTodasLasFlores();
    }

    @GetMapping("/filterflowers")
    public List<Flor> FilterFlowersByColorAndPrice(@RequestParam String color, @RequestParam double precio) {
        return florService.filterByColorAndPriceMayor(color,precio);

    }

}
