package Otros;

public class Zapato {
    String marca;
    String tipo;
    String color;
    int talla;

    public Zapato(String marca, String tipo, String color, int talla) {
        this.marca = marca;
        this.tipo = tipo;
        this.color = color;
        this.talla = talla;
    }

    public Zapato() {
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getTalla() {
        return talla;
    }

    public void setTalla(int talla) {
        this.talla = talla;
    }

    public void mostrarZapato() {
        System.out.printf("Marca: %s\nTipo: %s\nColor: %s\nTalla: %d\n", marca, tipo, color, talla);
    }

    public void mostrarMensaje(String marca,String tipo,String color, int talla) {
        System.out.printf("Marca: %s\nTipo: %s\nColor: %s\nTalla: %d\n", marca, tipo, color, talla);
    }
}
