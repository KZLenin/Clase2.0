public class Persona {
    String nombre;
    String apellido;
    int edad;
    int id;

    public Persona(String nombre, String apellido, int edad, int id) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.edad = edad;
        this.id = id;
    }

    public Persona() {

    }

    //Getters y Setters

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void mostrarPersona() {
        System.out.printf("Nombre: %s\nApellido: %s\nEdad: %d\nID: %d\n", nombre, apellido, edad, id);
    }

    public void mostrarMensaje(String nombre, String apellido, int edad, int id) {
        System.out.printf("Nombre: %s\nApellido: %s\nEdad: %d\nID: %d\n", nombre, apellido, edad, id);
    }
}
