package C20_230625;

import java.util.List;

public class EjemploArrayList {
    //Interfaz -> forma en que el usuario interactúa con el sistema.
    // Declaración de Listas en Java.
    // Se utiliza la "interfaz list" para declarar e implementar ArrayList.
    // Esto es por flexibilidad.

    public static void main(String[] args) {
        List<String> frutas = new java.util.ArrayList<>();

        frutas.add("Manzana"); // ubicación 0
        frutas.add("Pera");     // ubicación 1
        frutas.add("Manzana"); // ubicación 2
        // acá se agrega con el índice .add ; las listas permiten duplicidad!!

        System.out.println("Lista de frutas: ");
        for (String fruta : frutas) { //Recordar que el ForEach recorre todo el arreglo, en este caso la lista, elemento por elemento.
            System.out.println("- " + fruta);
        }

        //Por ejemplo el Acceder con Get(), obtenemos el valor, en este caso "Pera".
        //Obtenemos la posición de la lista considerando siempre que comienzan en 0.
        System.out.println("\nFruta en posición 1: " + frutas.get(1) + "\n");

        frutas.set(1, "Uva");
        System.out.println("Modificación 1: " + frutas.get(1) + "\n");

        //Un metodo para Borrar o Eliminar.
        frutas.remove(0);
        System.out.println("Eliminar un índice 0: " + frutas.get(0) + "\n");

        //El Clear limpia la lista
        frutas.clear();
        System.out.println("Limpiar la lista: " + frutas.isEmpty() + "\n");

        //Tamaño de la lista
        frutas.size();
        System.out.println("Tamaño de la lista: " + frutas.size());

        //



    }


}



