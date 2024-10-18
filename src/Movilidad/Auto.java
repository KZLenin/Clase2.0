package Movilidad;

public class Auto {
    String marca;
    String modelo;
    String color;
    String placa;

    public Auto(String marca, String modelo, String color, String placa) {
        this.marca = marca;
        this.modelo = modelo;
        this.color = color;
        this.placa = placa;
    }

    public Auto() {
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public void mostrarAuto(){
        System.out.printf("Marca: %s\nModelo: %s\nPlaca: %s", marca, modelo, placa);
    }

    public void mostrarMensaje(String marca, String modelo, String color, String placa){
        System.out.printf("Marca: %s\nModelo: %s\nPlaca: %s", marca, modelo, placa);
    }
}
