package Musica;

public class InstrumentoMusical {
    String nombre;
    String tipo;
    String marca;

    public InstrumentoMusical(String nombre, String tipo, String marca) {
        this.nombre = nombre;
        this.tipo = tipo;
        this.marca = marca;
    }

    public InstrumentoMusical() {
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public void mostrarInstrumento() {
        System.out.printf("Nombre: %s\nTipo: %s\nMarca: %s\n",nombre, tipo, marca);
    }

    public void mostrarMensaje(String nombre, String tipo, String marca) {
        System.out.printf("Nombre: %s\nTipo: %s\nMarca: %s\n",nombre, tipo, marca);
    }
}
