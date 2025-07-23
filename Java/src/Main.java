import java.util.Scanner;

/** Primeros apuntes - Punto de partida **/

public class Main {
    // Este es el punto de entrada a mi programa Java.
    //La JVM va a buscar la clase que tiene el metodo main y de allí parte la ejecución del programa.
    public static void main(String[] args) {
        //Comentarios
        // <-- este es un comentario de línea
        /* Este es un comentario de bloque
        Se abre y se cierra, es un / y *
         */

        //Clase system y metodo print, el cual permite imprimir un mensaje en la consola.
        System.out.println("Hola mundo!");

        //Crear una instancia (una variable de nombre "teclado") del Scanner, que me permite ingresar datos por consola.
        Scanner teclado = new Scanner(System.in);

        //Indicamos al usuario que introduzca su nombre
        System.out.println("¿Cuál es tu nombre?");

        //Guardamos el nombre en una variable y luego la imprimimos.
        String nombre = teclado.nextLine();
        System.out.println("Indica tu apellido");
        String apellido = teclado.nextLine();

        //Concatenamos un "Hola" con nuestra variable nombre y apellido.
        System.out.println("Hola " + nombre + " " + apellido + ("!"));

    }
}