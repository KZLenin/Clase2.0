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
    public void mostrarLibro() {
        System.out.printf("El título es: %s\nEl autor es: %s\nLa editorial es: %s\nEl número de páginas es: %d", titulo, autor, editora, paginas);
    }
}
