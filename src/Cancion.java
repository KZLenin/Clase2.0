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

    /*
    public void mostrarCancion() {
        System.out.println("Nombre: " + nombre);
        System.out.println("Artista: " + artista);
        System.out.println("Genero: " + genero);
        System.out.println("Disquera: " + disquera);
        System.out.println("Duracion: " + duracion + " minutos");
        System.out.println("------------------------");
    }*/
}
