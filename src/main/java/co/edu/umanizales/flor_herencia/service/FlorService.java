package co.edu.umanizales.flor_herencia.service;

import co.edu.umanizales.flor_herencia.model.Flor;
import co.edu.umanizales.flor_herencia.model.Girasol;
import co.edu.umanizales.flor_herencia.model.Rosa;
import co.edu.umanizales.flor_herencia.model.Tulipan;
import org.springframework.stereotype.Service;
import java.util.ArrayList;
import java.util.List;

@Service
public class FlorService {
    private List<Flor> flores;

    public FlorService() {
        flores = new ArrayList<>();
        flores.add(new Girasol("Girasol Grande", "Amarillo", 1599, 200));
        flores.add(new Girasol("Girasol Grande", "Verde", 1599, 200));
        flores.add(new Tulipan("Tulipán Holandés", "Rojo", 899, "Holanda"));
        flores.add(new Tulipan("Tulipán Aleman", "Azul", 899, "Aleman"));
        flores.add(new Rosa("Rosa Roja", "Rojo", 1299, 15));
        flores.add(new Rosa("Rosa Roja", "Azul", 1299, 15));
    }

    public List<Flor> listarTodasLasFlores() {
        return flores;
    }

    public  List<Flor> filterByColorAndPriceMayor(String color, double precio){
        List<Flor> filteredFlor= new ArrayList<>();
        for (Flor flor : flores) {
            if (flor.getColor().equals(color) && flor.getPrecio() > precio) {
                filteredFlor.add(flor);
            }

        }
        return filteredFlor;
    }



}
