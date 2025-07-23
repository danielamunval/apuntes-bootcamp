import java.util.Scanner;

/** Primeros apuntes - Punto de partida **/

public class InicioApuntes {
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

        //Guardamos el nombre ingresado por el usuario en una variable tipo String (cadena), llamada "nombre". Luego, solicitamos el apellido del usuario y se guarda en una variable tipo String llamada "apellido".
        String nombre = teclado.nextLine();
        System.out.println("Indica tu apellido");
        String apellido = teclado.nextLine();

        //Concatenamos (unimos, sumamos) un mensaje impreso en consola "Hola" con nuestra variable nombre y apellido. Con un ! al final del mensaje impreso.
        System.out.println("Hola " + nombre + " " + apellido + ("!"));

        /** OBSERVACIONES **/
        /* Metodo print posee tres variaciones: print, println, printf:
            print: solo imprime un mensaje en la consola.
            println: imprime el mensaje en consola y agrega un salto de línea.
            printf: permite imprimir el mensaje en la consola con algunos atajos, según las especificaciones de formato.
         */

        teclado.close(); //se cierra la variable teclado de la clase Scanner, como buena práctica. Libera los recursos de sistema y memoria.
    }
}