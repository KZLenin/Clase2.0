package Otros;

public class Videojuego {
    String nombre;
    String desarrolladora;
    String genero;
    String plataforma;
    int anio;

    public Videojuego(String nombre, String desarrolladora, String genero, String plataforma, int anio) {
        this.nombre = nombre;
        this.desarrolladora = desarrolladora;
        this.genero = genero;
        this.plataforma = plataforma;
        this.anio = anio;
    }

    public Videojuego() {
    }

    //getters
    public String getNombre() {
        return nombre;
    }
    public String getDesarrolladora() {
        return desarrolladora;
    }
    public String getGenero() {
        return genero;
    }
    public String getPlataforma() {
        return plataforma;
    }
    public int getAnio() {
        return anio;
    }
    //setters
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public void setDesarrolladora(String desarrolladora) {
        this.desarrolladora = desarrolladora;
    }
    public void setGenero(String genero) {
        this.genero = genero;
    }
    public void setPlataforma(String plataforma) {
        this.plataforma = plataforma;
    }
    public void setAnio(int anio) {
        this.anio = anio;
    }

    public void mostrarVideojuego() {
        System.out.printf("Nombre: %s\nDesarrolladora: %s\nGenero: %s\nPlataforma: %s\nAño: %d\n", nombre, desarrolladora, genero, plataforma, anio );
    }

    public void mostrarMensaje(String nombre, String desarrolladora, String genero, String plataforma, int anio) {
        System.out.printf("Nombre: %s\nDesarrolladora: %s\nGenero: %s\nPlataforma: %s\nAño: %d\n", nombre, desarrolladora, genero, plataforma, anio );
    }
}
