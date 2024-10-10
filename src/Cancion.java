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
    public void mostrarCancion() {
        System.out.println("Nombre: " + nombre);
        System.out.println("Artista: " + artista);
        System.out.println("Genero: " + genero);
        System.out.println("Disquera: " + disquera);
        System.out.println("Duracion: " + duracion + " minutos");
        System.out.println("------------------------");
    }
}
