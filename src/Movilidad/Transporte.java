package Movilidad;

public class Transporte {
    String tipo;
    int capacidad;
    double velocidadMax;

    public Transporte(String tipo, int capacidad, double velocidadMax) {
        this.tipo = tipo;
        this.capacidad = capacidad;
        this.velocidadMax = velocidadMax;
    }

    public Transporte() {
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public int getCapacidad() {
        return capacidad;
    }

    public void setCapacidad(int capacidad) {
        this.capacidad = capacidad;
    }

    public double getVelocidadMax() {
        return velocidadMax;
    }

    public void setVelocidadMax(double velocidadMax) {
        this.velocidadMax = velocidadMax;
    }

    public void mostrarTransporte() {
        System.out.printf("Tipo: %s\nCapacidad: %d\nVelocidad Máxima: %.2f km/h\n", tipo, capacidad, velocidadMax);
    }

    public void mostrarMensaje(String titulo, int capacidad, double velocidadMax) {
        System.out.printf("Tipo: %s\nCapacidad: %d\nVelocidad Máxima: %.2f km/h\n", tipo, capacidad, velocidadMax);
    }
}
