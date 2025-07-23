package C20_230625;

import java.util.HashSet;
import java.util.Set;

public class EjemploSet {
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

        //El resto de los métodos son iguales.
        //Tamaño.
        System.out.println("Tamaño Set: " + paises.size()); //forma "resumida"


    }

}
