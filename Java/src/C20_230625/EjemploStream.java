package C20_230625;

import java.util.List;
import java.util.stream.Collectors;

public class EjemploStream {
    public static void main(String[] args) {

        //Declaración de Stream
        List<String> nombres = List.of("Ana", "Luis", "Pedro", "Andrea", "Lucia");

        //Usamos Stream para Filtrar, transformar y recolectar.
        List<String> resultado = nombres.stream()
                .filter(n -> n.startsWith("A")) // Filtrar
                .map(String::toUpperCase) // Convierte a mayúscula.
                .sorted() //Ordena de manera alfabética
                .collect(Collectors.toUnmodifiableList()); // Recortar en nueva lista.

        System.out.println("Nombres filtrados: ");
        resultado.forEach(System.out::println); //el forEach va simplificado, porque ya sabemos que recorrerá elemento por elemento.


    }


}

