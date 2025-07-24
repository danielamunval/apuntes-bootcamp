package J2_Operadores;

import java.util.Scanner;

public class OperadoresAsignacion {
    //Main va a ser el punto de entrada a este programa.
    public static void main(String[] args) { // Acá se define un scope local o de función. No olvidar que un scope es lo que se encuentra contenido entre llaves {}.

        //** Operadores de asignación **//
        /*
        = -> asignación
        += -> suma el valor y asigna el resultado
        -= -> resta el valor y asigna el resultado
        *= -> multiplica por el valor y asigna el resultado.
        /= -> divide entre otro valor y asigna el resultado.
        ++ -> incremento, suma +1 al valor actual de la variable
        -- -> decremento, resta -1 al valor actual de la variable.
         */

        //Variables a través de la consola.
        Scanner teclado = new Scanner(System.in);

        //1. Pedimos el primer número
        System.out.println("Indica el primer número");
        int numeroUno = teclado.nextInt();
        System.out.println(numeroUno);

        //2. Pedimos el segundo número
        System.out.println("Indica el segundo número");
        int numeroDos = teclado.nextInt();
        System.out.println(numeroDos);

        //3. Imprimimos ambos números para mostrarlos al usuario.
        System.out.println("El primer número es: " + numeroUno + " y " + "el segundo número es: " + numeroDos);

        //4. Realizamos las distintas asignaciones
        System.out.println(numeroUno += numeroDos); //numeroUno se convierte en la suma, en el resultado.
        System.out.println(numeroUno -= numeroDos); //acá numeroUno se convierte en el resultado de la operación anterior.
        System.out.println(numeroUno *= numeroDos); //la variable queda en gris cuando no se vuelve a llamar.
        System.out.println(numeroUno /= numeroDos);

        System.out.println("Ahora el primer número equivale a " + numeroUno);

        /** Incremento y Decremento **/
        System.out.println("Al realizar un preincremento, numeroUno equivale a " + ++numeroUno);
        System.out.println("Al realizar un postincremento, numeroUno equivale a " + numeroUno++);
        //acá se le sumará un número más después de imprimir el número, se muestra 6 pero realmente es 7 (ejemplo)
        System.out.println("Ahora el primer número equivale a: " + numeroUno++);

        //Decremento
        System.out.println("Al realizar un predecremento, numeroDos equivale a " + --numeroDos);
        System.out.println("Al realizar un postdecremento, numeroDos equivale a " + numeroDos--);
        //acá se le restará un número menor después de imprimir el número, se mostrará 6, pero realmente es 5 (ejemplo)
        System.out.println("Ahora el segundo número equivale a: " + numeroDos--);
        //si no se quiere volver a llamar a las variables, se les agrega nuevamente -- o ++ al final.

    }
}
