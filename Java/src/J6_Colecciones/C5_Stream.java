package J6_Colecciones;

import java.util.List;
import java.util.stream.Collectors;

public class C5_Stream {
    // Stream -> filtran, mapean, reducen de forma sencilla y concisa.
    // Es una secuencia de elementos que soporta diferentes tipos de operaciones para procesar datos.

    // Operaciones intermedias -> transforman un stream en otro stream. No se ejecutan hasta que no se ejecute una operación terminal. Ejemplos: filter(), map(), sorted().
    // Operaciones terminales -> producen un resultado o efecto secundario y terminan el stream. Ejemplos: collect(), forEach(), reduce().

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

