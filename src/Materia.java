public class Materia {
    String nombre;
    String codigo;
    int creditos;

    public Materia(String nombre, String codigo, int creditos) {
        this.nombre = nombre;
        this.codigo = codigo;
        this.creditos = creditos;
    }

    public Materia() {
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public int getCreditos() {
        return creditos;
    }

    public void setCreditos(int creditos) {
        this.creditos = creditos;
    }

    public void mostrarMateria() {
        System.out.printf("Nombre: %s\nCodigo: %s\nCreditos: %d\n", nombre, codigo, creditos);
    }

    public void mostrarMensaje(String nombre, String codigo, int creditos) {
        System.out.printf("Nombre: %s\nCodigo: %s\nCreditos: %d\n", nombre, codigo, creditos);
    }
}


