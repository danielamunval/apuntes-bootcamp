package J3_Condicionales;

import java.util.Scanner;

public class C1_IF_ELSE {
    public static void main(String[] args) {
        /** CONDICION IF **/
        // permite ejecutar un bloque de código si una condición es verdadera o se cumple.

        boolean condicion = true;
        if (condicion) {
            // Bloque de código a ejecutar si la condición es verdadera
        }

        //Si la condición entre paréntesis es verdadera, el bloque de código dentro del if se ejecutará. Si la condición es falsa, el bloque se omitirá y el programa continuará con la siguiente instrucción después del if.

        /** CONDICIÓN ELSE **/
        //proporciona un bloque de código que se ejecutará si ninguna de las condiciones anteriores es verdadera.
        //Si la condición dentro del if es falsa, el bloque dentro del else se ejecutará. Si la condición es verdadera, el bloque dentro del else se omite:

        if (condicion) {
            // Bloque de código a ejecutar si la condición es verdadera
        } else {
            // Bloque de código a ejecutar si la condición es falsa
        }

        /** Ejemplo IF y ELSE: **/
        // Crear una instancia de Scanner para la entrada de usuario
        Scanner scanner = new Scanner(System.in);

        // Solicitar al usuario que ingrese su edad
        System.out.print("Ingrese su edad: ");
        int edad = scanner.nextInt();

        // Utilizar una declaración if para determinar si el usuario es mayor de edad
        if (edad >= 18) {
            System.out.println("Eres mayor de edad. Puedes votar y realizar otras actividades.");
        } else {
            System.out.println("Eres menor de edad. Algunas actividades pueden estar restringidas.");
        }

        /** Ejemplo 2 **/

        int nota = 30;
        boolean asistencia = true;

        if (nota >= 70 && asistencia){
            System.out.println("Aprobado 1");
        }
        else {
            System.out.println("Reprobado");
        }

        //cumplir ambas condiciones, el && o and es cuando se cumplean ambas condiciones.
        // acá tenemos dos condiciones
        // condición 1 = verdadera
        // condición 2 = verdadero
        // verdadero + verdadero = verdadero.

        if (nota >= 40 && asistencia){
            System.out.println("Aprobado 2");
        }

        // Cerrar el objeto Scanner
        scanner.close();
    }
}
