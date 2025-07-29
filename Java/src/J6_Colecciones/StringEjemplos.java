package J6_Colecciones;

public class StringEjemplos {
    public static void main(String[] args) {
        //Vamos a hacer referencia a los textos de java.lang
        String text = "Hola Mundo";

        System.out.println("Longitud " + text.length()); //Mide literal la longitud, es decir, cuántas letras y espacios tiene la frase.
        System.out.println("Primer carácter: " + text.charAt(0)); //Menciona el primer carácter, la primera letra.
        System.out.println("Último carácter: " + text.charAt(text.length() -1)); //Menciona el último carácter, la última letra.
        System.out.println("Texto en mayúsculas: " + text.toUpperCase());
        System.out.println("Texto en minusculas: " + text.toLowerCase());
        System.out.println("Texto sin espacios: "+ text.trim());
        System.out.println("Texto sin espacios y en minúsculas: " + text.trim().toLowerCase());
        System.out.println("Texto sin espacios y en mayúsculas: " + text.trim().toUpperCase());
        System.out.println("Concatenando: " + text.concat("!!!"));
        System.out.println("Subcadena: " + text.substring(0, 5)); //Muestra solo una parte, en este caso del carácter 0 a 5 -> "hola "
        System.out.println("¿Contiene 'Mundo'?" + text.contains("Mundo"));
        System.out.println("¿Contiene 'MUNDO'?" + text.indexOf("Mundo"));

    }
}
