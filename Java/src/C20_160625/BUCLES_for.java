package C20_160625;

public class BUCLES_for {
    public static void main(String[] args) {

        System.out.println("Contador básico");
        System.out.println("Contando del 1 al 10");

        for (int i = 1; i <= 10; i ++) { //
            System.out.println(i + " "); // si pongo println cuenta como salto de linea , si está solo print ejecutará hacia el lado
        }

        for (int i = 1; i < 100; i = i + 5); {
            int i = 1;
            System.out.println(i + " ");
        }


        /** Ejemplo 2 **/

        System.out.println("Tablas de multiplicar");
        int numeroDeTablas = 4;

        for (int i = 0; i <=10; i++) {
            int resultado = i * numeroDeTablas;
            System.out.printf("%d x %d = %d%n", numeroDeTablas, i, resultado);
        }

        /** Ejemplo 3 **/

        System.out.println("Otro tipo de tablas");
        System.out.println(" ");

        for (int i = 0; i <= 5; i++){
            System.out.printf("%4d",i);
        }

        System.out.println("\n");

        /** Ejemplo 4 **/ //REVISAR ESTE EJEMPLO PQ NO LO ENTENDI BIEN
        System.out.println("Sumar números de pares");
        int limite = 20;
        int suma = 0;
        int contador = 0;

        System.out.println("Números de pares del 1 al " + limite + " : ");
        for (int i = 1; i <= 20; i++){

            System.out.println("Este es el número por vuelta" + i + " ");

            if (i % 2 == 0){
                System.out.print(i + "Este es el número par que vamos a sumar " + i);
                // System.out.println(i + " ");
                suma += i; // suma = suma + i
                contador++;

            }
        }

        /** Ejemplo 5 **/
        System.out.println("Incremento");
        int suma1 = 0;
        int contador1 = 0;
        int limite1 = 10;

        for (int i = 2; i <= limite1; i +=2){
            System.out.println("i" + i);
            suma1 += i;
            contador1 ++;
        }
        System.out.println("Suma total " + suma1);
        System.out.println("-".repeat(20) + "\n");


    }
}
