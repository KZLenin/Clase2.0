public class Main {
    public static void main(String[] args) {
        System.out.printf("Hola a todos");
        //para declarar el objeto
        //para instanciar una clase
        Book libro1=new Book("El resplandor", "Stephen King", "De Bolsillo", 600);
        Book libro2=new Book("El crimen casi perfecto", "Roberto Arit", "Ojoreja", 216);
        Book libro3=new Book("Cien años de soledad", "Gabriel García Márquez", "Editorial Sudamericana", 500);
        Book libro4=new Book("1984", "George Orwell", "Penguin", 328);
        Book libro5=new Book("La casa de los espíritus", "Isabel Allende", "Plaza & Janés", 400);
        libro1.imprimir();
        System.out.println(libro1.imprimirCubierta());
        libro2.imprimir();
        System.out.println(libro2.imprimirCubierta());
        libro3.imprimir();
        System.out.println(libro3.imprimirCubierta());
        libro4.imprimir();
        System.out.println(libro4.imprimirCubierta());
        libro5.imprimir();
        System.out.println(libro5.imprimirCubierta());
    }
}