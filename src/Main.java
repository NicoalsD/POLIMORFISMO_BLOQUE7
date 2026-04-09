import java.util.Scanner;

public class Main{
    public static void main(String[] args) {

        String titulo;
        double precio;
        int anioPublicacion;
        int numeroPaginas;

        Scanner input = new Scanner(System.in);

        System.out.println("Bienvenido a la editorial");
        System.out.println("vamos a creaar un libro");
        System.out.println("cual es el titulo del libro?");
        titulo = input.nextLine();
        System.out.println("cual es el precio del libro?");
        precio = input.nextDouble();
        System.out.println("cual es el año del libro?");
        anioPublicacion = input.nextInt();
        System.out.println("cual es el numero de paginas del libro?");
        numeroPaginas = input.nextInt();

        Libro miLibro=new Libro(titulo,precio,anioPublicacion,numeroPaginas);
        System.out.println(miLibro);

        input.close();

    }
}
