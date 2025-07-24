package J2_Operadores;

import java.util.Scanner;

public class OperadoresLogicos {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.println("Indica la primera palabra: ");
        String palabraUno = teclado.nextLine();
        System.out.println("Ahora indica la segunda palabra: ");
        String palabraDos = teclado.nextLine();

        System.out.println("Indica el primer número");
        int numeroUno = teclado.nextInt();
        System.out.println("Indica el segundo número");
        int numeroDos = teclado.nextInt();
        teclado.nextLine();

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
