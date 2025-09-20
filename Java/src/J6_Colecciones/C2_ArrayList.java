package J6_Colecciones;

import java.util.List;

public class C2_ArrayList {
    // Interfaz -> forma en que el usuario interactúa con el sistema. Es una secuencia ordenada de elementos.
    // Declaración de Listas en Java.
    // Se utiliza la "interfaz list" para declarar e implementar ArrayList.
    // Esto es por flexibilidad. Las listas permiten elementos duplicados y proporcionan acceso a los elementos por un índices numéricos.
    // ARRAY LIST -> estructura de datos dinámica, puede cambiar su tamaño según sea necesario.


    /** EJEMPLO **/
    public static void main(String[] args) {
        List<String> frutas = new java.util.ArrayList<>();

        frutas.add("Manzana"); // ubicación 0
        frutas.add("Pera");    // ubicación 1
        frutas.add("Manzana"); // ubicación 2
        // acá se agrega con el índice .add ; las listas permiten duplicidad!!

        System.out.println("Lista de frutas: ");
        for (String fruta : frutas) { //Recordar que el ForEach recorre todo el arreglo, en este caso la lista, elemento por elemento.
            System.out.println("- " + fruta);
        }

        //Obtenemos la posición de la lista considerando siempre que comienzan en 0.
        //Por ejemplo el Acceder con Get(), obtenemos el valor, en este caso "Pera".
        System.out.println("\nFruta en posición 1: " + frutas.get(1) + "\n");

        // Set permite modificar un elemento, en este caso, se cambia "Pera" por "Uva".
        frutas.set(1, "Uva");
        System.out.println("Modificación 1: " + frutas.get(1) + "\n");

        //Verificar si un elemento está presente
        boolean contieneManzana = frutas.contains("Manzana");
        System.out.println("¿Contiene Manzana? " + contieneManzana + "\n");

        //Un metodo para Borrar o Eliminar.
        frutas.remove(0);
        System.out.println("Eliminar un índice 0: " + frutas.get(0) + "\n");

        //El Clear limpia la lista
        frutas.clear();
        System.out.println("Limpiar la lista: " + frutas.isEmpty() + "\n");

        //Tamaño de la lista
        frutas.size();
        System.out.println("Tamaño de la lista: " + frutas.size());

    }
}



