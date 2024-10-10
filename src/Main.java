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

        ////////////////////////////////////////Videojuegos///////////////////////////////////
        Videojuego juego1=new Videojuego("Fortnite", "EpicGames", "Shooter", "Multiplataforma", 2018);
        Videojuego juego2=new Videojuego("Uncharted", "NaugthyDogs", "Aventura", "PS4", 2016 );
        Videojuego juego3 = new Videojuego("The Legend of Zelda: Breath of the Wild", "Nintendo", "Aventura", "Switch", 2017);
        Videojuego juego4 = new Videojuego("Minecraft", "Mojang", "Mundo abierto", "Multiplataforma", 2011);
        Videojuego juego5 = new Videojuego("God of War", "Santa Monica Studio", "Acción/Aventura", "PS4", 2018);
        juego1.mostrarVideojuego();
        juego2.mostrarVideojuego();
        juego3.mostrarVideojuego();
        juego4.mostrarVideojuego();
        juego5.mostrarVideojuego();

        ///////////////////////////////Canciones////////////////////////////
        Cancion cancion1 = new Cancion("Shape of You", "Ed Sheeran", "Pop", "Atlantic", 2.35);
        Cancion cancion2 = new Cancion("Bohemian Rhapsody", "Queen", "Rock", "EMI", 3.54);
        Cancion cancion3 = new Cancion("Billie Jean", "Michael Jackson", "Pop", "Epic", 2.94);
        Cancion cancion4 = new Cancion("Smells Like Teen Spirit", "Nirvana", "Grunge", "DGC", 3.01);
        Cancion cancion5 = new Cancion("Rolling in the Deep", "Adele", "Soul", "XL", 2.28);
        cancion1.mostrarCancion();
        cancion2.mostrarCancion();
        cancion3.mostrarCancion();
        cancion4.mostrarCancion();
        cancion5.mostrarCancion();
    }
}