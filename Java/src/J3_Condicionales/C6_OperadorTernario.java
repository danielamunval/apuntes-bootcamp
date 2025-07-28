package J3_Condicionales;

public class C6_OperadorTernario {
    public static void main(String[] args) {
        /** OPERADOR TERNARIO **/

        //Es un operador condicional en Java que proporciona una forma compacta de expresar asignaciones condicionales.
        //Es una forma abreviada de agregar un if, se llama "operador ternario". Acá se declara, se forma la condición toda en una sola línea.
        //Al usarlo el código se vuelve más corto y conciso. Sin embargo, no siempre será lo más óptimo, sobretodo cuando se deban evaluar múltiples condiciones.
        //La recomendación es utilizarlo siempre que se tengan condiciciones simples y claras.
        // Cuando se deba evaluar múltiples condiciones, mejor utilizar if y else, para mantener la legibilidad.

        // La sintaxis básica del operador ternario es la siguiente:

        /** variable = (condicion) ? expresion_si_verdadero : expresion_si_falso; **/
        // condicion: expresión booleana true or false.
        // expresion_si_verdadero: el valor asignado a la variable si la condicion es true.
        // expresion_si_falso: el valor asignado a la variable si la condición es false.

        /** Diferencia entre if y operador ternario **/
        //If
        int edadConIf = 17;
        String estadoConIf;

        if (edadConIf == 18) {
            estadoConIf = "Es mayor de edad";
        } else {
            estadoConIf = "No es mayor de edad";
        }

        //Operador ternario:
        int edadConOperadorTernario = 17;
        String estadoConOperadorTernario = (edadConOperadorTernario >= 18) ? "Es mayor de edad" : "No es mayor de edad";
        //El ? es una forma distinta de expresar un if, siempre y cuando se vea acompañado de dos "" separados por un :

    }
}
