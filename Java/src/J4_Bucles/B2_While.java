package J4_Bucles;

public class B2_While {
    /** BUCLE WHILE **/
    // Permite ejecutar repetidamente un bloque de código mientras una condición específica sea verdadera.

    /** Sintaxis

     while (condicion) {
     // Bloque de código a repetir mientras la condición sea verdadera
     }

     - Condicion: expresión booleana que se evalúa antes de cada iteración. Si la condición es verdadera, se ejecuta el bloque de código.
     - Bloque de código:cEs el conjunto de declaraciones que se ejecutan mientras la condición sea verdadera.
     **/

    /** ¿Cuándo termina el bucle? **/
    // El bucle while no maneja la condición de finalización dentro de su estructura así que hay que crear esta lógica de manera manual.

    public class EjemploWhile {
        public static void main(String[] args) {
            int i = 1; //condición i <= 5 se cumple inicialmente.

            while (i <= 5) { //el bucle se repetirá hasta que la condición sea falsa (cuando i sea 6).
                System.out.println(i);
                i++;  // Incrementar la variable
            }
        }
    }

    public class BucleInfinito { //ejemplo Bucle infinito
        public static void main(String[] args) {
            int i = 1; //a menos que hagamos algún cambio en la variable

            while (i <= 5) { //la condición (i < 5) siempre será verdadera
                System.out.println(i); // el bucle continuará ejecutándose indefinidamente.
            }
        }
    }

}
