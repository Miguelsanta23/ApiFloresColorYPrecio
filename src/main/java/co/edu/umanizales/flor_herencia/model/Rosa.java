package co.edu.umanizales.flor_herencia.model;

public class Rosa extends Flor {
    private int numeroEspinas;

    public Rosa(String nombre, String color, double precio, int numeroEspinas) {
        super(nombre, color, precio);
        this.numeroEspinas = numeroEspinas;
    }

    public int getNumeroEspinas() {
        return numeroEspinas;
    }

    public void setNumeroEspinas(int numeroEspinas) {
        this.numeroEspinas = numeroEspinas;
    }
}
