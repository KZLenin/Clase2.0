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

    public Book() {
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public String getEditora() {
        return editora;
    }

    public void setEditora(String editora) {
        this.editora = editora;
    }

    public int getPaginas() {
        return paginas;
    }

    public void setPaginas(int paginas) {
        this.paginas = paginas;
    }

    public void mostrarLibro() {
        System.out.printf("El título es: %s\nEl autor es: %s\nLa editorial es: %s\nEl número de páginas es: %d", titulo, autor, editora, paginas);
    }
    public void mostrarMensaje(String titulo, String autor, String editora, int paginas) {
        System.out.printf("El título es: %s\nEl autor es: %s\nLa editorial es: %s\nEl número de páginas es: %d", titulo, autor, editora, paginas);
    }
}
