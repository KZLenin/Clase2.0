public class Main {
    public static void main(String[] args) {
        //para declarar el objeto
        //para instanciar una clase
        ///////////////////////////////////////Libros////////////////////////////////////
        Book libro1=new Book("El resplandor", "Stephen King", "De Bolsillo", 600);
        Book libro2=new Book("El crimen casi perfecto", "Roberto Arit", "Ojoreja", 216);

        ////////////////////////////////////////Videojuegos///////////////////////////////////
        Videojuego juego1=new Videojuego("Fortnite", "EpicGames", "Shooter", "Multiplataforma", 2018);
        Videojuego juego2=new Videojuego("Uncharted", "NaugthyDogs", "Aventura", "PS4", 2016 );

        ///////////////////////////////Canciones////////////////////////////
        Cancion cancion1 = new Cancion("Shape of You", "Ed Sheeran", "Pop", "Atlantic", 2.35);
        Cancion cancion2 = new Cancion("Bohemian Rhapsody", "Queen", "Rock", "EMI", 3.54);

        ///////////////////////////////////Series/////////////////////////////////////////////
        Serie serie1 = new Serie("Elite", "Netflix", 2019);

        //////////////////////////////////Personas/////////////////////////////////////////
        Persona persona1 = new Persona("Lenin","Taco", 20, 1755855671);

        /////////////////////////////////Autos////////////////////////////////////////////
        Auto auto1 = new Auto("Chevrolet", "Spark", "Negro","");

        ////////////////////////////////Transporte///////////////////////////////////
        Transporte transporte1 = new Transporte("Autobus", 50, 45.5);

        /////////////////////////////////Materias////////////////////////////////////////
        Materia Materia1 = new Materia("Programacion Orientada a Objetos", "TDSPOO24", 5);

        ///////////////////////////////////Zapatos////////////////////////////////////////
        Zapato zapato1 = new Zapato("Nike", "Deportivo", "Blanco", 40);

        ////////////////////////////////////InstrumentosMusicales///////////////////////////////
        InstrumentoMusical instrumentoMusical1 = new InstrumentoMusical("Tambor", "Percusion", "Yamaha");

        /////////////////////////////////////Peliculas//////////////////////////////////
        Pelicula pelicula1 = new Pelicula("Avengers End Game", "Marvel", 2022, "Accion");
    }
}