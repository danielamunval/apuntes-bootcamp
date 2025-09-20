package J5_Funciones;

public class F6_API {
    /** API de JAVA **/
    // Se refiere al conjunto de clases, interfaces, métodos y otros componentes que Java proporciona para el desarrollo de aplicaciones.
    // En otras palabras, es un conjunto de librerías que los programadores pueden utilizar para construir aplicaciones en el lenguaje de programación Java.
    // La API está organizada en distintos paquetes, algunos ejemplos que se usan a menudo son:

    /** Para la manipulación de String(”java.lang”) **/

    // String: Clase para manipular cadenas de texto.
    public static void main(String[] args) {
        String texto = "Hola Mundo";

        System.out.println("Longitud: " + texto.length()); // longitud de la cadena
        System.out.println("Primer carácter: " + texto.charAt(0)); // muestra el primer carácter, en ubicación 0
        System.out.println("Último carácter: " + texto.charAt(texto.length() -1)); // Menciona el último carácter, la última letra.
        System.out.println("Texto sin espacios: "+ texto.trim()); // elimina espacios al inicio y al final.
        System.out.println("Subcadena (0 a 4): " + texto.substring(0, 4)); // busca el contenido entre el parámetro de ubicación indicado.
        System.out.println("¿Contiene 'Mundo'? " + texto.indexOf("Mundo")); // busca el contenido dentro de la cadena, busca la ubicación donde comienza el contenido.
        System.out.println("¿Contiene 'Mundo'?" + texto.contains("Mundo")); // busca el contenido en la cadena de texto.
        System.out.println("Concatenado: " + texto.concat(" desde Java")); // concatena = une.
        System.out.println("¿Es igual a 'hola mundo'? " + texto.equals("hola mundo")); //comparación.
        System.out.println("Mayúsculas: " + texto.toUpperCase()); //lo convierte TODO a mayúsculas
        System.out.println("Minúsculas: " + texto.toLowerCase()); //lo convierte TODO a minúsculas
    }


    // Math: Clase para realizar operaciones matemáticas.

    public static void main1(String[] args) {
        int a = 5, b = 9;

        System.out.println("Máximo: " + Math.max(a, b));
        System.out.println("Mínimo: " + Math.min(a, b));
        System.out.println("Potencia (2^3): " + Math.pow(2, 3));
        System.out.println("Redondear 4.6: " + Math.round(4.6));
        System.out.println("Piso de 4.9: " + Math.floor(4.9));
        System.out.println("Techo de 4.1: " + Math.ceil(4.1));
    }

    /** Para la estructuras de datos(”java.util”) **/

    // Se verán con más detalle en el package "J6_Colecciones"

    // ArrayList: Implementación de una lista dinámica basada en arrays.
    // Métodos destacados: add(), get(), remove(), size(), isEmpty().

    // HashMap: Implementación de un mapa basado en tablas hash.
    // Métodos destacados: put(), get(), remove(), containsKey(), keySet().

}
