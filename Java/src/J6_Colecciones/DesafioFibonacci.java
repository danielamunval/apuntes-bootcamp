package J6_Colecciones;

import java.util.Scanner;

public class DesafioFibonacci {
    //Secuencia fibonacci: es aquella donde se van sumando los dos últimos números.
    //Lo importante es entender el uso de los condicionales y el movimiento de las variables.


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("*** DESAFIO SECUENCIA FIBONACCI ***");
        System.out.print("Ingrese la cantidad de números: ");
        int numero = scanner.nextInt();

        int primero = 0, segundo = 1;
        System.out.println("Secuencia Fibonacci:");

        for (int i = 1; i <= numero; i++) {
            System.out.print(primero + " ");
            int siguiente = primero + segundo;
            primero = segundo;
            segundo = siguiente;
        }

        scanner.close();
    }
}
