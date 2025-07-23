package C20_180625;

public class Funciones {
    public static int sumar(int num1, int num2) { //Definición de la función "sumar" con dos argumentos.
        int resultado = num1 + num2; //Cuerpo de la función
        return resultado; // La función devuelve un valor de tipo int.
    }

    //Metodo principal (main); donde se llama a la función
    public static void main(String[] args) {
        // Llamada a la función "sumar" con argumentos 5 y 3
        int resultadoSuma = sumar(5, 3);
        // Imprimir el resultado en la consola
        System.out.println("La suma es: " + resultadoSuma);
    }


}

