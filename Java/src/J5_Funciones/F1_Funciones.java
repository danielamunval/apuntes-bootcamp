package J5_Funciones;

public class F1_Funciones {
    /** FUNCIONES **/
    // Es un bloque de código que realiza una tarea específica y puede ser invocado o llamado desde otro lugar en el programa.
    // En java se conocen con el concepto de MÉTODOS!
    // Los métodos en Java se utilizan para modularizar el código, facilitar la reutilización, y hacer que el código sea más organizado y mantenible.

    /** Sintaxis básica

     tipo_retorno nombreDelMetodo(parametros) {
     // Cuerpo del método
     // ...
     return valor; // opcional (si el método tiene un tipo de retorno)
     }

     Componentes:
     - tipo_retorno: Es el tipo de dato que el método devuelve. Puede ser void (vacío) si el método no devuelve ningún valor.
     - nombreDelMetodo: Es el nombre que se asigna al método para identificarlo y llamarlo desde otras partes del programa.
     - parametros: Son los valores que se pueden pasar al método cuando se llama.
     - Cuerpo del método: Es el bl  oque de código que se ejecuta cuando el método es invocado.
     - return: Devuelve un valor desde el método al lugar donde fue llamado. La palabra clave return no es necesaria si el método tiene un tipo de retorno void.
     **/


    /**
     * EJEMPLO
     **/
    public static int sumar(int num1, int num2) { //Definición de la función "sumar" con dos argumentos. Modificador de acceso public, con palabra clave static para indicar que la función pertenece a la clase y no a una instancia específica.
        int resultado = num1 + num2; //Cuerpo de la función
        return resultado; // La función devuelve un valor de tipo int.
    }

    //Metodo principal (main); donde se llama a la función
    public static void main(String[] args) {
        // Llamada a la función "sumar" con argumentos (5 y 3)
        int resultadoSuma = sumar(5, 3);
        // Imprimir el resultado en la consola
        System.out.println("La suma es: " + resultadoSuma);
    }

}


