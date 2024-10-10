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

    public void mostrarVideojuego() {
        System.out.println("Nombre: " + nombre);
        System.out.println("Desarrolladora: " + desarrolladora);
        System.out.println("Genero: " + genero);
        System.out.println("Plataforma: " + plataforma);
        System.out.println("Año: " + anio);
        System.out.println("-------------------------");
    }
}
