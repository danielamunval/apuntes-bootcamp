package C20_120625;

import javax.swing.*;
import java.util.Scanner;

public class OperadoresComparacion {
    public static void main(String[] args) {
        //Los operadores de comparación tienen como resultado un boolean: true or false.
        /*
        ==  -> igual que
        >   -> mayor que
        >=  -> mayor o igual que
        <   -> menor que
        <=  -> menor o igual que
        !=  -> es distinto de

         */

        //Variables a través de consola
        Scanner teclado = new Scanner(System.in);

        // 1. Definimos nuestras variables para comparar a través del input por consola.
        System.out.println("Indica el primer número");
        int numeroUno = teclado.nextInt();
        System.out.println(numeroUno);
        System.out.println("Indica el segundo número");
        int numeroDos = teclado.nextInt();
        System.out.println(numeroDos);
        teclado.nextLine(); //me va a permitir detectar la siguiente linea de consola. Nextline -> salto de línea.
        // En caso de querer agregar más saltos de linea se agrega ("\n") al sout.


        System.out.println("Ahora indica la primera palabra");
        //otra opción es abrir un cuadro de texto por medio de: String palabraUno = JOptionPane.showInputDialog(null, "Ahora indica la primera palabra");
        /** String palabraUno = JOptionPane.showInputDialog(null, "Ahora indica la primera palabra"); **/
        String palabraUno = teclado.nextLine();
        System.out.println("Ahora indica la segunda palabra");
        String palabraDos = teclado.nextLine();

        System.out.println(numeroUno + " - " + numeroDos + " - " + palabraUno + " - " + palabraDos);
        System.out.println("\n");

        // 2. Generamos expresiones de comparación para obtener un boolean , utilizando los operadores.
        // Expresiones para comparar números.
        System.out.println("¿numeroUno es igual a numeroDos? = " + (numeroUno == numeroDos)); // Expresión se evalúa primero y el resultado se concatena.
        System.out.println("¿numeroUno es mayor a numeroDos? = " + (numeroUno > numeroDos));
        System.out.println("¿numeroUno es mayor o igual a numeroDos? = " + (numeroUno >= numeroDos));
        System.out.println("¿numeroUno es menor a numeroDos? = " + (numeroUno < numeroDos));
        System.out.println("¿numeroUno es menor o igual a numeroDos? = " + (numeroUno <= numeroDos));
        System.out.println("¿numeroUno es distinto a numeroDos? = " + (numeroUno != numeroDos) + "\n");

        //Expresiones para comparar palabras.
        System.out.println("¿palabraUno es igual a palabraDos?, comparando ambas variables String con el operador de igualdad = " + (palabraUno == palabraDos));
        //Dará como resultado false ya que se están comparando dos variables distintas de tipo string, aunque el contenido sea el mismo. Ningún objeto es igual a otro, le asigna un espacio en memoria de ubicación única. No se comparan de la misma forma que las variables int. Se debe ocupar métodos de la clase String, como se muestra abajo:
        System.out.println("comparamos ambas variables String con el método de la clase String .equals() y obtenemos = " + palabraUno.equals(palabraDos) + "\n");

        /** Operadores lógicos **/
        // Estos operadores nos permiten combinar más de una expresión y evaluarlo en conjunto.
        /*
        && (y lógico) -> permite evaluar ambas condiciones de manera inclusiva.
        || (o lógico) -> permite evaluar si una de las dos condiciones es verdadera, para que la expresión sea verdadera.
        ! (not o negación) -> permite cambiar el valor de una expresión o un valor boolean.

         */

        boolean combinacionDeComparacionesNumericas = ((numeroUno <= numeroDos && numeroUno == numeroDos));
        System.out.println("El resultado de combinar ambas evaluaciones es: " + combinacionDeComparacionesNumericas);

        //prueba con palabras en lugar de números, el .equalsIgnoreCase es para comparar sin discriminar mayúsculas o minúsculas
        boolean combinacionDeComparacionesDePalabras = (palabraUno.equals(palabraDos) && palabraUno.equalsIgnoreCase(palabraDos));
        System.out.println("El resultado de combinar ambas comparaciones en Strings es: " + combinacionDeComparacionesDePalabras);

        //prueba
        boolean combinacionDePosibilidades = (palabraUno.equalsIgnoreCase("hola") || palabraDos.equals("Mundo"));
        System.out.println("El resultado de combinar ambas posibilidades es: " + combinacionDePosibilidades);

        System.out.println("El resultado de negar a través del operador not (!) es el siguiente: " + !combinacionDePosibilidades);

    }
}
