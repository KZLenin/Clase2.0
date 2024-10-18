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
        Serie serie2 = new Serie("Stranger Things", "Netflix", 2016);

        //////////////////////////////////Personas/////////////////////////////////////////
        Persona persona1 = new Persona("Lenin","Taco", 20, 1755855671);
        Persona persona2 = new Persona("Ana", "González", 25, 1754589200);

        /////////////////////////////////Autos////////////////////////////////////////////
        Auto auto1 = new Auto("Chevrolet", "Spark", "Negro","");
        Auto auto2 = new Auto("Toyota", "Corolla", "Blanco", "");

        ////////////////////////////////Transporte///////////////////////////////////
        Transporte transporte1 = new Transporte("Autobus", 50, 45.5);
        Transporte transporte2 = new Transporte("Camión", 2, 80.0);

        /////////////////////////////////Materias////////////////////////////////////////
        Materia materia1 = new Materia("Programacion Orientada a Objetos", "TDSPOO24", 5);
        Materia materia2 = new Materia("Estructuras de Datos", "TDS102", 4);

        ///////////////////////////////////Zapatos////////////////////////////////////////
        Zapato zapato1 = new Zapato("Nike", "Deportivo", "Blanco", 40);
        Zapato zapato2 = new Zapato("Adidas", "Casual", "Azul", 42);

        ////////////////////////////////////InstrumentosMusicales///////////////////////////////
        InstrumentoMusical instrumentoMusical1 = new InstrumentoMusical("Tambor", "Percusion", "Yamaha");
        InstrumentoMusical instrumentoMusical2 = new InstrumentoMusical("Guitarra", "Cuerda", "Fender");

        /////////////////////////////////////Peliculas//////////////////////////////////
        Pelicula pelicula1 = new Pelicula("Avengers End Game", "Marvel", 2022, "Accion");
        Pelicula pelicula2 = new Pelicula("Interstellar", "Paramount", 2014, "Ciencia Ficción");

        ///////////////////////////////////////Mostrar objetos//////////////////////////////////////////
        libro1.mostrarLibro();
        libro2.mostrarLibro();

        juego1.mostrarVideojuego();
        juego2.mostrarVideojuego();

        cancion1.mostrarCancion();
        cancion2.mostrarCancion();

        serie1.mostrarSerie();
        serie2.mostrarSerie();

        persona1.mostrarPersona();
        persona2.mostrarPersona();

        auto1.mostrarAuto();
        auto2.mostrarAuto();

        transporte1.mostrarTransporte();
        transporte2.mostrarTransporte();

        materia1.mostrarMateria();
        materia2.mostrarMateria();

        zapato1.mostrarZapato();
        zapato2.mostrarZapato();

        instrumentoMusical1.mostrarInstrumento();
        instrumentoMusical2.mostrarInstrumento();

        pelicula1.mostrarPelicula();
        pelicula2.mostrarPelicula();
    }
}