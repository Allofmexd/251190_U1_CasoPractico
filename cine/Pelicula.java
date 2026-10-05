package cine;

/** Contiene la informacion que se muestra de cada pelicula. */
public class Pelicula {
    private String titulo;
    private String genero;
    private int duracionMinutos;
    private Director director;

    public Pelicula(String titulo, String genero, int duracionMinutos,
                    Director director) {
        this.titulo = titulo;
        this.genero = genero;
        this.duracionMinutos = duracionMinutos;
        this.director = director;
    }

    public String getTitulo() {
        return titulo;
    }

    public String getGenero() {
        return genero;
    }

    public int getDuracionMinutos() {
        return duracionMinutos;
    }

    public Director getDirector() {
        return director;
    }

    public String obtenerResumen() {
        return titulo + " | " + genero + " | " + duracionMinutos + " min";
    }

    public String obtenerDetalles() {
        return "Titulo: " + titulo
                + "\nGenero: " + genero
                + "\nDuracion: " + duracionMinutos + " minutos"
                + "\nDirector: " + director.getNombre()
                + "\nPais de origen: " + director.getPaisOrigen();
    }
}
