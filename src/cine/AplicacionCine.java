package cine;

import java.util.Scanner;

/** Punto de entrada del programa de consulta de la cartelera. */
public class AplicacionCine {
    public static void main(String[] args) {
        Cartelera cartelera = crearCartelera();
        Scanner teclado = new Scanner(System.in);
        int opcion;

        do {
            mostrarMenu();
            opcion = leerEntero(teclado, "Seleccione una opcion: ");

            switch (opcion) {
                case 1:
                    cartelera.mostrarListado();
                    break;
                case 2:
                    cartelera.mostrarListado();
                    int numero = leerEntero(teclado,
                            "Numero de pelicula para ver detalles: ");
                    Pelicula pelicula = cartelera.consultarDetalle(numero);
                    if (pelicula == null) {
                        System.out.println("Error: el numero debe estar entre 1 y "
                                + cartelera.getCantidad() + ".");
                    } else {
                        System.out.println("\n--- DETALLES DE LA PELICULA ---");
                        System.out.println(pelicula.obtenerDetalles());
                    }
                    break;
                case 0:
                    System.out.println("Gracias por consultar la cartelera.");
                    break;
                default:
                    System.out.println("Error: opcion no valida.");
            }
        } while (opcion != 0);

        teclado.close();
    }

    private static void mostrarMenu() {
        System.out.println("\n=== SALA DE CINE ===");
        System.out.println("1. Consultar listado completo");
        System.out.println("2. Consultar detalles de una pelicula");
        System.out.println("0. Salir");
    }

    private static int leerEntero(Scanner teclado, String mensaje) {
        System.out.print(mensaje);
        String entrada = teclado.nextLine();
        try {
            return Integer.parseInt(entrada);
        } catch (NumberFormatException error) {
            return -1;
        }
    }

    private static Cartelera crearCartelera() {
        Cartelera cartelera = new Cartelera();

        Director director1 = new Director("Lee Unkrich", "Estados Unidos");
        Director director2 = new Director("Bong Joon-ho", "Corea del Sur");
        Director director3 = new Director("Hayao Miyazaki", "Japon");
        Director director4 = new Director("Peter Weir", "Australia");
        Director director5 = new Director("Alfonso Cuaron", "Mexico");

        // Se crean cinco objetos Pelicula y se asignan al arreglo de Cartelera.
        cartelera.agregarPelicula(new Pelicula(
                "Coco", "Animacion", 105, director1));
        cartelera.agregarPelicula(new Pelicula(
                "Parasite", "Drama y suspenso", 132, director2));
        cartelera.agregarPelicula(new Pelicula(
                "El viaje de Chihiro", "Animacion y fantasia", 125, director3));
        cartelera.agregarPelicula(new Pelicula(
                "The Truman Show", "Drama y comedia", 103, director4));
        cartelera.agregarPelicula(new Pelicula(
                "Roma", "Drama", 135, director5));

        return cartelera;
    }
}
