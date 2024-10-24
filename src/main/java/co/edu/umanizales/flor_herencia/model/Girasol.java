package co.edu.umanizales.flor_herencia.model;

public class Girasol extends Flor {
    private int alturaMaxima;  // en centímetros

    public Girasol(String nombre, String color, double precio, int alturaMaxima) {
        super(nombre, color, precio);
        this.alturaMaxima = alturaMaxima;
    }

    public int getAlturaMaxima() { return alturaMaxima; }
    public void setAlturaMaxima(int alturaMaxima) { this.alturaMaxima = alturaMaxima; }
}