import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        String titulo;
        double precio;
        int anioPublicacion;
        int numeroPaginas;
        float duracionMinutos;
        float duracionHoras;
        int opcionIdioma;
        Idioma idioma;

        Scanner input = new Scanner(System.in);

        System.out.println("Bienvenido a la editorial");
        System.out.println("Vamos a crear un libro");
        System.out.println("Cual es el titulo del libro?");
        titulo = input.nextLine();
        System.out.println("Cual es el precio del libro?");
        precio = input.nextDouble();
        System.out.println("Cual es el año del libro?");
        anioPublicacion = input.nextInt();
        System.out.println("Cual es el numero de paginas del libro?");
        numeroPaginas = input.nextInt();

        Libro miLibro = new Libro(titulo, precio, anioPublicacion, numeroPaginas);
        System.out.println(miLibro);

        input.nextLine();
        System.out.println("Vamos a crear un disco");
        System.out.println("Cual es el titulo del disco?");
        titulo = input.nextLine();
        System.out.println("Cual es el precio del disco?");
        precio = input.nextDouble();
        System.out.println("Cual es la duracion en minutos del disco?");
        duracionMinutos = input.nextFloat();

        Disco miDisco = new Disco(titulo, precio, duracionMinutos);
        System.out.println(miDisco);

        input.nextLine();
        System.out.println("Vamos a crear un video");
        System.out.println("Cual es el titulo del video?");
        titulo = input.nextLine();
        System.out.println("Cual es el precio del video?");
        precio = input.nextDouble();
        System.out.println("Cual es la duracion en horas del video?");
        duracionHoras = input.nextFloat();
        System.out.println("Seleccione el idioma del video:");
        System.out.println("1. Español");
        System.out.println("2. Inglés");
        System.out.println("3. Portugués");
        opcionIdioma = input.nextInt();

        if (opcionIdioma == 1) {
            idioma = Idioma.ESPAÑOL;
        } else if (opcionIdioma == 2) {
            idioma = Idioma.INGLES;
        } else if (opcionIdioma == 3) {
            idioma = Idioma.PORTUGUES;
        } else {
            System.out.println("Opcion no valida, se asignara Español por defecto.");
            idioma = Idioma.ESPAÑOL;
        }

        Video miVideo = new Video(titulo, precio, idioma, duracionHoras);
        System.out.println(miVideo);

        input.close();
    }
}
