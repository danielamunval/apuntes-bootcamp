package J4_Bucles;

import java.util.Scanner;

public class While_ejemplos {
    public static void main(String[] args) {
        System.out.println("Validación de entrada");
        Scanner teclado = new Scanner(System.in);

        int numero = -1;
        System.out.println("Ingrese un número: ");
        teclado.nextInt();

        //si el numero es menor que 1
        //|| significa o que cumple 1 o de las 2 condiciones
        // si el número es mayor que 100

        while (numero < 1 || numero > 100) {
            System.out.println("Número del 1 al 100 ");
            if (teclado.hasNextInt()) {
                numero = teclado.nextInt();
                if (numero > 1 || numero < 100) {
                    System.out.println("OK");

                }
            } else {
                System.out.println("Error, ingrese un número");
                teclado.next();
            }

        } //fin del bucle

        //mensaje final
        System.out.println("El número ingresado es: " + numero);
        teclado.close();


        System.out.println("---------------------------------------------------" + "\n");

        /** Ejemplo 2 **/ //REVISAR ESTE EJEMPLO, ACÁ TB ME PERDI

        int intento = 0;
        boolean adivinar = false;
        int numeroSecreto = (int) (Math.random() * 10);

        System.out.println("*** Adivina el número entre 1 y 10 ***");

        while (!adivinar && intento < 3) {
            System.out.println("Ingresa el número: ");
            int adivinanzaUsuario = teclado.nextInt();
            intento++;

            if (adivinanzaUsuario == numeroSecreto) {
                adivinar = true;
                System.out.println("Correcto! Adivinaste el número en: " + intento + "intento(s).");
            } else if (adivinanzaUsuario < numeroSecreto) {
                System.out.println("El número es mayor");
            } else {
                System.out.println("El número es menor");
            }

            if (!adivinar) {
                System.out.println("Ya utilizaste todos los intentos. El número es: " + numeroSecreto);
            }
            teclado.close();

        }

        System.out.println("---------------------------------------------------" + "\n");

        /** Ejemplo 3 **/

        double saldo = 1000.0;
        int dia = 1;
        while (saldo > 0 && dia <= 30) {
            double gastoDelDia = Math.random() * 100; // Aleatorio hasta 100
            saldo = saldo - gastoDelDia;
            System.out.println("Dia " + dia + ": Ganaste $" + String.format("%.4f", gastoDelDia) + ", Saldo: $" + String.format("%.2f", saldo));

        }

    }

}


