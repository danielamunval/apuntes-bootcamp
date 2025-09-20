package J6_Colecciones;

import java.util.HashSet;
import java.util.Set;

public class C3_Set_HashSet {
    /** CONJUNTOS - SET **/
    // Es una interfaz que modela una colección sin duplicados.
    // No garantizan orden específico de los elementos.
    // HASH SET -> clase que implementa la interfaz Set.


    public static void main(String[] args) {
        // Declaramos un Set.
        Set<String> paises = new HashSet<>();

        //Agregar
        paises.add("Chile");
        paises.add("Peru");
        //paises.add("Chile"); // Duplicado, pasará en la lista, pero se imprimirá solo uno en la consola, lo omite.
        paises.add("Argentina");

        System.out.println("Paises en el set:");
        for (String pais : paises) {
            System.out.println("- " + pais);
        }

        //El resto de los métodos son iguales:

        // Verificar si un elemento está presente
        boolean contienePais = paises.contains("Chile");
        System.out.println("¿Contiene a Chile? " + contienePais);

        // Eliminar un elemento
        paises.remove("Peru");
        System.out.println("HashSet después de eliminar Peru: " + paises);

        // Tamaño del HashSet
        int tamanoHashSet = paises.size();
        System.out.println("Tamaño del HashSet: " + tamanoHashSet);

        System.out.println("Tamaño HashSet: " + paises.size()); //forma "resumida" de escribir.

        // Limpiar el HashSet
        paises.clear();
        System.out.println("HashSet después de limpiar: " + paises);

    }
}
