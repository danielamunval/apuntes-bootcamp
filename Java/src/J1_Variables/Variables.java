package J1_Variables;

public class Variables {
    //En esta clase vamos a analizar los distintos tipos de dato en Java.
    //Una variable equivale a una cajita para almacenar información. Es un contenedor con un nombre asociado, que guarda información, según el tipo de variable y dato que incluya.

    /** Tipos de datos en JAVA **/
    /* DATOS PRIMITVOS -> palabras reservadas que forman parte del lenguaje java. Se comportan distinto a los objetos. Siempre se escriben en minúscula:
        byte - Rango: -128 a 127
        short - Rango: -32,768 a 32,767
        int - Rango: -2^31 a 2^31-1
        long - Rango: -2^63 a 2^63-1
        float - Punto flotante de precisión simple (32 bits)
        double - Punto flotante de precisión doble (64 bits)
        char - Almacena un solo carácter
        boolean - Puede ser true o false

     */

    //Cuando declaramos una varible en Java, primero declaramos el tipo de dato.
    //Luego, indicamos el nombre de la variable.

    byte numeroPequeno = 127;
    //ejemplo: tipo de dato + nombre de la variable.

    //Creamos una variable de cada tipo numérico. Java trata los datos de tipo numérico como int.
    byte edad = 20;
    short anioNacimiento = 2005;
    int balanceCuenta = 1000000;
    long poblacionMundial = 8005176000L; //Casteo: es convertir un tipo de dato a uno de mayor tamaño.

    //Java trata a los tipos de dato decimales como double.
    float estatura = 1.80F;
    double pi = 3.14159265;

    //Char para caracteres, trabaja con UNICODE no ASCII
    char inicialNombre = '$'; //OJO siempre va en comilla simple.

    //Boolean, almacena valores de verdadero o falso: true - false.
    boolean esMayorDeEdad = false;

    /*** DATOS DE TIPO OBJETO O WRAPPER ***/
    //Es una clase de dato que encierra a otros. Ocupan más espacio que los primitivos. Se escriben con la primera letra en mayúscula para diferenciarse de los primitivos.
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

    //null -> Ausencia de un valor. Se puede aplicar a varias variables.
    String valorNulo = null;
    Integer numeroNulo = null;

    /*** CONSTANTES EN JAVA ***/
    //final -> palabra reservada que indica que es una constante.
    //Son valores que no cambian.
    final int constanteEntero = 20;

    /** VARIABLE DE CLASE O ESTÁTICA **/
    //Se agrega previamente la declaración static.
    static String saludo = "Hola, ¿cómo estás?";


}
