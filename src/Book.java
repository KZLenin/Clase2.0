public class Book {
    //Atributos
    String titulo;
    String autor;
    String editora;
    int paginas;

    //Metodos
    //Constructor
    public Book(String titulo, String autor, String editora, int paginas) {
        this.titulo = titulo;
        this.autor = autor;
        this.editora = editora;
        this.paginas = paginas;
    }
    public void imprimir() {
        System.out.println("El titulo es: " + this.titulo);
        System.out.println("El autor es: " +this.autor);
        System.out.println("La editorial es: " + this.editora);
        System.out.println("El numero de paginas es: " +this.paginas);
        System.out.println("-----------------------------");
    }
    public int imprimirCubierta() {
        return this.paginas+5;
    }
}
