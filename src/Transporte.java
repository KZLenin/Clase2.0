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
}
