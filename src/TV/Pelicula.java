package TV;

public class Pelicula {
    String titulo;
    String cinematografia;
    int anioPublicacion;
    String genero;

    public Pelicula(String titulo, String cinematografia, int anioPublicacion, String genero) {
        this.titulo = titulo;
        this.cinematografia = cinematografia;
        this.anioPublicacion = anioPublicacion;
        this.genero = genero;
    }

    public Pelicula() {
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getCinematografia() {
        return cinematografia;
    }

    public void setCinematografia(String cinematografia) {
        this.cinematografia = cinematografia;
    }

    public int getAnioPublicacion() {
        return anioPublicacion;
    }

    public void setAnioPublicacion(int anioPublicacion) {
        this.anioPublicacion = anioPublicacion;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public void mostrarPelicula() {
        System.out.printf("Título: %s\nCinematografía: %s\nAño de Publicación: %d\nGénero: %s\n", titulo, cinematografia, anioPublicacion, genero);
    }

    public void mostrarMensaje(String titulo, String cinematografia, int anioPublicacion, String genero) {
        System.out.printf("Título: %s\nCinematografía: %s\nAño de Publicación: %d\nGénero: %s\n", titulo, cinematografia, anioPublicacion, genero);
    }
}
