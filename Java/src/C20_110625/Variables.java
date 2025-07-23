package C20_110625;

public class Variables {
    //En esta clase vamos a analizar los distintos tipos de dato en Java.
    //Una variable equivale a una cajita para almacenar información.

    /** Tipos de datos en JAVA **/
    /* DATOS PRIMITVOS -> palabras reservadas que forman parte del lenguaje java. Se comportan distinto a los objetos
    - byte
    - short
    - int
    - long
    - float
    - double
    - char
    - boolean
     */

    //Cuando declaramos una varible en Java, primero declaramos el tipo de dato.
    //Luego, indicamos el nombre de la variable.

    byte numeroPequeno = 127;
    //tipo de dato + nombre de la variable.

    //Creamos una variable de cada tipo numérico. Java trata los datos de tipo numérico como int.
    byte edad = 20;
    short anioNacimiento = 2005;
    int balanceCuenta = 1000000;
    long poblacionMundial = 8005176000L; //Casteo es convertir un tipo de dato a uno de mayor tamaño.

    //Java trata a los tipos de dato decimales como double.
    float estatura = 1.80F;
    double pi = 3.14159265;

    //Char para caracteres, trabaja con UNICODE no ASCII
    char inicialNombre = '$'; //OJO siempre va en comilla simple.

    //Boolean, almacena valores de verdadero o falso,
    boolean esMayorDeEdad = false;

    /*** DATOS DE TIPO OBJETO O WRAPPER ***/
    //Es una clase de dato que encierra a otros. Ocupan más espacio que los primitivos.
    Integer enteroDeTipoObjeto = 400;
    String cadenaDeTexto = "Hola mundo";

    Byte miEdad = 29;
    Short anioActual = 2025;
    Long population = 8005176000L;

    Float height = 1.80F;
    Double pI = 3.14159265;

    /*** TIPOS DE DATOS ESPECIALES EN JAVA ***/
    //Enum -> define un conjunto de constantes.
    enum DiasDeLaSemana {
        LUNES,
        MARTES,
        MIERCOLES,
        JUEVES,
        VIERNES,
    }

    // Arrays estático -> arreglos que definen un conjunto de valores
    char[] arregloDeCaracteres = {'H', 'O', 'L', 'A'};

    //null -> Ausencia de un valor.
    String valorNulo = null;

    /*** CONSTANTES EN JAVA ***/
    //final -> palabra reservada que indica que es una constante.
    final int constanteEntero = 20;

    /** VARIABLE DE CLASE O ESTÁTICA **/
    static String saludo = "Hola, ¿cómo estás?";


}
