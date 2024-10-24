package co.edu.umanizales.flor_herencia.model;

public class Tulipan extends Flor {
    private String paisOrigen;

    public Tulipan(String nombre, String color, double precio, String paisOrigen) {
        super(nombre, color, precio);
        this.paisOrigen = paisOrigen;
    }

    public String getPaisOrigen() {
        return paisOrigen;
    }

    public void setPaisOrigen(String paisOrigen) {
        this.paisOrigen = paisOrigen;
    }
}
