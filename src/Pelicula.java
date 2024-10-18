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
}
