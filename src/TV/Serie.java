package TV;

public class Serie {
    String nombre;
    String plataforma;
    int anio;

    public Serie(String nombre, String plataforma, int anio) {
        this.nombre = nombre;
        this.plataforma = plataforma;
        this.anio = anio;
    }

    public Serie() {

    }

    //Getters y setters
    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public String getPlataforma() {
        return plataforma;
    }
    public void setPlataforma(String plataforma) {
        this.plataforma = plataforma;
    }
    public int getAnio() {
        return anio;
    }
    public void setAnio(int anio) {
        this.anio = anio;
    }

    public void mostrarSerie() {
        System.out.printf("Nombre: %s\nPlataforma: %s\nAño: %d\n", nombre, plataforma, anio);
    }

    public void mostrarMensaje(String nombre, String plataforma, int anio) {
        System.out.printf("Nombre: %s\nPlataforma: %s\nAño: %d\n", nombre, plataforma, anio);
    }
}

