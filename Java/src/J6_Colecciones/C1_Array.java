package J6_Colecciones;

public class C1_Array {
    public static void main(String[] args) {
        // Array == arreglos.
        // Los arreglos son estructuras de datos que almacenan elementos de forma conjunta en la memoria.
        // Declaración array es fija.
        // Un array tiene que usar corchetes.
        // Sintaxis: tipo [] nombre;
        // Se pueden declarar variables enteros o palabras; pero NO se pueden mezclar entre si.

        // Ejemplo: declaración e inicialización de un array de enteros con tamaño 5
        int[] numeros = new int[5];

        // Asignar valores a los elementos del array
        numeros[0] = 10;
        numeros[1] = 20;
        numeros[2] = 30;
        numeros[3] = 40;
        numeros[4] = 50;

        // Ver la longitud del array
        System.out.println(numeros[0]); // acá va a imprimir el valor de la varible numero en la posición [0], que en este caso sería 10.
        System.out.println(numeros.length); // acá imprime la longitud del arreglo que es 5.

        System.out.println("\nEjemplo Arreglo con For");
        int i; // i = hace referencia a index i índice.
        for (i = 0; i < numeros.length; i++) {
            System.out.println("Indice " + i + " : " + numeros[i]);
        }

        String[] frutas = {"Manzana", "Pera", "Uva"}; // Longitud 0 1 2 = 3
        System.out.println("\n** Frutas **");
        // Básicamente, se va leyendo elemento por elemento
        for (String fruta : frutas){  // Este for es especial, se llama "for each", lo que hace es imprimir elemento por elemento el arreglo que se declare arriba. Funciona como INDICE, pero es para mostrar el ELEMENTO.
            System.out.println(fruta + " "); //Este arreglo imprime todos los elementos del array, el array completo = en este caso, todas las frutas.
            // System.out.println(frutas); NO imprimir directamente el arreglo, ni siquiera dentro del for each, ya que imprimirá la ubicación; no lo que dice la variable.
        }
    }
}
