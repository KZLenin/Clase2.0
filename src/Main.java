import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        //para declarar el objeto
        //para instanciar una clase
        Scanner scstring = new Scanner(System.in);
        Scanner scint = new Scanner(System.in);
        Scanner scdob = new Scanner(System.in);

        ///////////////////////////////////////Libros////////////////////////////////////
        Book libro1=new Book("El resplandor", "Stephen King", "De Bolsillo", 600);
        Book libro2=new Book("El crimen casi perfecto", "Roberto Arit", "Ojoreja", 216);
        Book libro3=new Book();
        System.out.println("Ingrese el titulo de su libro: ");
        String tituloLibro3=scstring.nextLine();
        System.out.println("Ingrese el autor de su libro: ");
        String autorLibro3=scstring.nextLine();
        System.out.println("Ingrese la editorial de su libro: ");
        String editorialLibro3=scstring.nextLine();
        System.out.println("Ingrese las paginas de su libro: ");
        int paginasLibro3=scint.nextInt();

        ////////////////////////////////////////Videojuegos///////////////////////////////////
        Videojuego juego1=new Videojuego("Fortnite", "EpicGames", "Shooter", "Multiplataforma", 2018);
        Videojuego juego2=new Videojuego("Uncharted", "NaugthyDogs", "Aventura", "PS4", 2016 );
        Videojuego juego3=new Videojuego();
        System.out.println("Ingrese el nombre del videojuego: ");
        String nombreVideojuego3 = scstring.nextLine();
        System.out.println("Ingrese la desarrolladora del videojuego: ");
        String desarrolladoraVideojuego3 = scstring.nextLine();
        System.out.println("Ingrese el género del videojuego: ");
        String generoVideojuego3 = scstring.nextLine();
        System.out.println("Ingrese la plataforma del videojuego: ");
        String plataformaVideojuego3 = scstring.nextLine();
        System.out.println("Ingrese el año de lanzamiento: ");
        int anioVideojuego3 = scint.nextInt();

        ///////////////////////////////Canciones////////////////////////////
        Cancion cancion1 = new Cancion("Shape of You", "Ed Sheeran", "Pop", "Atlantic", 2.35);
        Cancion cancion2 = new Cancion("Bohemian Rhapsody", "Queen", "Rock", "EMI", 3.54);
        Cancion cancion3 = new Cancion();
        System.out.println("Ingrese el nombre de la canción: ");
        String nombreCancion3 = scstring.nextLine();
        System.out.println("Ingrese el artista: ");
        String artistaCancion3 = scstring.nextLine();
        System.out.println("Ingrese el género: ");
        String generoCancion3 = scstring.nextLine();
        System.out.println("Ingrese la disquera: ");
        String disqueraCancion3 = scstring.nextLine();
        System.out.println("Ingrese la duración en minutos: ");
        double duracionCancion3 = scdob.nextDouble();

        ///////////////////////////////////Series/////////////////////////////////////////////
        Serie serie1 = new Serie("Elite", "Netflix", 2019);
        Serie serie2 = new Serie("Stranger Things", "Netflix", 2016);
        Serie serie3 = new Serie();
        System.out.println("Ingrese el nombre de la serie: ");
        String nombreSerie3 = scstring.nextLine();
        System.out.println("Ingrese la plataforma: ");
        String plataformaSerie3 = scstring.nextLine();
        System.out.println("Ingrese el año de lanzamiento: ");
        int anioSerie3 = scint.nextInt();

        //////////////////////////////////Personas/////////////////////////////////////////
        Persona persona1 = new Persona("Lenin","Taco", 20, 1755855671);
        Persona persona2 = new Persona("Ana", "González", 25, 1754589200);
        Persona persona3 = new Persona();
        System.out.println("Ingrese el nombre: ");
        String nombrePersona3 = scstring.nextLine();
        System.out.println("Ingrese el apellido: ");
        String apellidoPersona3 = scstring.nextLine();
        System.out.println("Ingrese la edad: ");
        int edadPersona3 = scint.nextInt();
        System.out.println("Ingrese el ID: ");
        int idPersona3 = scint.nextInt();

        /////////////////////////////////Autos////////////////////////////////////////////
        Auto auto1 = new Auto("Chevrolet", "Spark", "Negro","");
        Auto auto2 = new Auto("Toyota", "Corolla", "Blanco", "");
        Auto auto3 = new Auto();
        System.out.println("Ingrese la marca del auto: ");
        String marcaAuto3 = scstring.nextLine();
        System.out.println("Ingrese el modelo: ");
        String modeloAuto3 = scstring.nextLine();
        System.out.println("Ingrese el color: ");
        String colorAuto3 = scstring.nextLine();
        System.out.println("Ingrese la placa: ");
        String placaAuto3 = scstring.nextLine();

        ////////////////////////////////Transporte///////////////////////////////////
        Transporte transporte1 = new Transporte("Autobus", 50, 45.5);
        Transporte transporte2 = new Transporte("Camión", 2, 80.0);
        Transporte transporte3 = new Transporte();
        System.out.println("Ingrese el tipo de transporte: ");
        String tipoTransporte3 = scstring.nextLine();
        System.out.println("Ingrese la capacidad: ");
        int capacidadTransporte3 = scint.nextInt();
        System.out.println("Ingrese la velocidad máxima: ");
        double velocidadMaxTransporte3 = scdob.nextDouble();

        /////////////////////////////////Materias////////////////////////////////////////
        Materia materia1 = new Materia("Programacion Orientada a Objetos", "TDSPOO24", 5);
        Materia materia2 = new Materia("Estructuras de Datos", "TDS102", 4);
        Materia materia3 = new Materia();
        System.out.println("Ingrese el nombre de la materia: ");
        String nombreMateria3 = scstring.nextLine();
        System.out.println("Ingrese el código de la materia: ");
        String codigoMateria3 = scstring.nextLine();
        System.out.println("Ingrese los créditos de la materia: ");
        int creditosMateria3 = scint.nextInt();

        ///////////////////////////////////Zapatos////////////////////////////////////////
        Zapato zapato1 = new Zapato("Nike", "Deportivo", "Blanco", 40);
        Zapato zapato2 = new Zapato("Adidas", "Casual", "Azul", 42);
        Zapato zapato3 = new Zapato();
        System.out.println("Ingrese la marca del zapato: ");
        String marcaZapato3 = scstring.nextLine();
        System.out.println("Ingrese el tipo de zapato: ");
        String tipoZapato3 = scstring.nextLine();
        System.out.println("Ingrese el color del zapato: ");
        String colorZapato3 = scstring.nextLine();
        System.out.println("Ingrese la talla del zapato: ");
        int tallaZapato3 = scint.nextInt();

        ////////////////////////////////////InstrumentosMusicales///////////////////////////////
        InstrumentoMusical instrumentoMusical1 = new InstrumentoMusical("Tambor", "Percusion", "Yamaha");
        InstrumentoMusical instrumentoMusical2 = new InstrumentoMusical("Guitarra", "Cuerda", "Fender");
        InstrumentoMusical instrumentoMusical3 = new InstrumentoMusical();
        System.out.println("Ingrese el nombre del instrumento musical: ");
        String nombreInstrumentoMusical3 = scstring.nextLine();
        System.out.println("Ingrese el tipo de instrumento: ");
        String tipoInstrumentoMusical3 = scstring.nextLine();
        System.out.println("Ingrese la marca del instrumento: ");
        String marcaInstrumentoMusical3 = scstring.nextLine();

        /////////////////////////////////////Peliculas//////////////////////////////////
        Pelicula pelicula1 = new Pelicula("Avengers End Game", "Marvel", 2022, "Accion");
        Pelicula pelicula2 = new Pelicula("Interstellar", "Paramount", 2014, "Ciencia Ficción");
        Pelicula pelicula3 = new Pelicula();
        System.out.println("Ingrese el título de la película: ");
        String tituloPelicula3 = scstring.nextLine();
        System.out.println("Ingrese la productora: ");
        String cinematografia3 = scstring.nextLine();
        System.out.println("Ingrese el año de publicación: ");
        int anioPublicacion3 = scint.nextInt();
        System.out.println("Ingrese el género de la película: ");
        String generoPelicula3 = scstring.nextLine();

        ///////////////////////////////////////Mostrar objetos//////////////////////////////////////////
        libro1.mostrarLibro();
        libro2.mostrarLibro();
        libro3.mostrarMensaje(tituloLibro3, autorLibro3, editorialLibro3, paginasLibro3);

        juego1.mostrarVideojuego();
        juego2.mostrarVideojuego();
        juego3.mostrarMensaje(nombreVideojuego3, desarrolladoraVideojuego3, generoVideojuego3, plataformaVideojuego3, anioVideojuego3);

        cancion1.mostrarCancion();
        cancion2.mostrarCancion();
        cancion3.mostrarMensaje(nombreCancion3, artistaCancion3, generoCancion3, disqueraCancion3, duracionCancion3);

        serie1.mostrarSerie();
        serie2.mostrarSerie();
        serie3.mostrarMensaje(nombreSerie3, plataformaSerie3, anioSerie3);

        persona1.mostrarPersona();
        persona2.mostrarPersona();
        persona3.mostrarMensaje(nombrePersona3, apellidoPersona3, edadPersona3, idPersona3);

        auto1.mostrarAuto();
        auto2.mostrarAuto();
        auto3.mostrarMensaje(marcaAuto3, modeloAuto3, colorAuto3, placaAuto3);

        transporte1.mostrarTransporte();
        transporte2.mostrarTransporte();
        transporte3.mostrarMensaje(tipoTransporte3, capacidadTransporte3, velocidadMaxTransporte3);

        materia1.mostrarMateria();
        materia2.mostrarMateria();
        materia3.mostrarMensaje(nombreMateria3, codigoMateria3, creditosMateria3);

        zapato1.mostrarZapato();
        zapato2.mostrarZapato();
        zapato3.mostrarMensaje(marcaZapato3, tipoZapato3, colorZapato3, tallaZapato3);

        instrumentoMusical1.mostrarInstrumento();
        instrumentoMusical2.mostrarInstrumento();
        instrumentoMusical3.mostrarMensaje(nombreInstrumentoMusical3, tipoInstrumentoMusical3, marcaInstrumentoMusical3);

        pelicula1.mostrarPelicula();
        pelicula2.mostrarPelicula();
        pelicula3.mostrarMensaje(tituloPelicula3, cinematografia3, anioPublicacion3, generoPelicula3);
    }
}