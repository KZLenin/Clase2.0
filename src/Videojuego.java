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

    /*
    public void mostrarVideojuego() {
        System.out.println("Nombre: " + nombre);
        System.out.println("Desarrolladora: " + desarrolladora);
        System.out.println("Genero: " + genero);
        System.out.println("Plataforma: " + plataforma);
        System.out.println("Año: " + anio);
        System.out.println("-------------------------");
    }*/
}
