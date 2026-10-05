package cine;

/** Representa al director de una pelicula. */
public class Director {
    private String nombre;
    private String paisOrigen;

    public Director(String nombre, String paisOrigen) {
        this.nombre = nombre;
        this.paisOrigen = paisOrigen;
    }

    public String getNombre() {
        return nombre;
    }

    public String getPaisOrigen() {
        return paisOrigen;
    }
}
