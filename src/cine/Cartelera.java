package cine;

/** Administra un arreglo de exactamente cinco objetos Pelicula. */
public class Cartelera {
    public static final int CAPACIDAD = 5;
    private Pelicula[] peliculas;
    private int cantidad;

    public Cartelera() {
        // Requisito principal de la actividad: arreglo de objetos.
        peliculas = new Pelicula[CAPACIDAD];
        cantidad = 0;
    }

    public boolean agregarPelicula(Pelicula pelicula) {
        if (pelicula == null || cantidad >= peliculas.length) {
            return false;
        }
        peliculas[cantidad] = pelicula;
        cantidad++;
        return true;
    }

    public void mostrarListado() {
        System.out.println("\n--- CARTELERA DEL FIN DE SEMANA ---");
        for (int i = 0; i < cantidad; i++) {
            System.out.println((i + 1) + ". " + peliculas[i].obtenerResumen());
        }
    }

    public Pelicula consultarDetalle(int numero) {
        int indice = numero - 1;
        if (indice < 0 || indice >= cantidad) {
            return null;
        }
        return peliculas[indice];
    }

    public int getCantidad() {
        return cantidad;
    }
}
