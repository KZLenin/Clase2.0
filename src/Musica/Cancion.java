package Musica;

public class Cancion {
    String nombre;
    String artista;
    String genero;
    String disquera;
    double duracion;

    public Cancion(String nombre, String artista, String genero, String disquera, double duracion) {
        this.nombre = nombre;
        this.artista = artista;
        this.genero = genero;
        this.disquera = disquera;
        this.duracion = duracion;
    }

    public Cancion() {
    }

    //getters
    public String getNombre() {
        return nombre;
    }

    public String getArtista() {
        return artista;
    }

    public String getGenero() {
        return genero;
    }

    public String getDisquera() {
        return disquera;
    }
    public double getDuracion() {
        return duracion;
    }
    //setters
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public void setArtista(String artista) {
        this.artista = artista;
    }
    public void setGenero(String genero) {
        this.genero = genero;
    }
    public void setDisquera(String disquera) {
        this.disquera = disquera;
    }
    public void setDuracion(double duracion) {
        this.duracion = duracion;
    }

    public void mostrarCancion() {
        System.out.printf("Nombre: %s\nArtista: %s\nGénero: %s\nDisquera: %s\nDuración: %.2f minutos\n", nombre, artista, genero, disquera, duracion);
    }

    public void mostrarMensaje(String nombre, String artista, String genero, String disquera, double duracion) {
        System.out.printf("Nombre: %s\nArtista: %s\nGénero: %s\nDisquera: %s\nDuración: %.2f minutos\n", nombre, artista, genero, disquera, duracion);
    }
}
