package J3_Condicionales;

public class C5_Switch {
    public static void main(String[] args) {
        /** SWITCH **/
        //En Java, switch sirve se utiliza para realizar selecciones múltiples basadas en el valor de una expresión.
        // Proporciona una forma más concisa de manejar múltiples casos en comparación con una serie de declaraciones if y else if.

        // Sintaxis explicada en un ejemplo:
        int dia = 3;
        String nombreDia;

        switch (dia) { // (dia) -> expresion: Es la expresión cuyo valor se compara con los diferentes casos.
            // case valorX: Cada case es una etiqueta que representa un valor específico que se compara con la expresión. Si la expresión coincide con el valor de algún case, se ejecutará el bloque de código asociado.
            case 1:
                nombreDia = "Lunes";
                break; // break: Se utiliza para salir del switch después de ejecutar el bloque de código correspondiente.
            case 2:
                nombreDia = "Martes";
                break;
            case 3:
                nombreDia = "Miércoles";
                break;

            default: // default: Es un caso opcional que se ejecuta si ninguno de los casos anteriores coincide
                nombreDia = "No definido";
                break;
        }

        /** ¿Cuándo es mejor utilizar If y cuándo utilizar Switch? **/
        //Si bien, ambas estructuras permiten ejecutar código según la condición, elegir una de las dos, va a depender del contexto o problema a resolver. Así pues, **`if-else`** es más **general** y versátil, permitiendo manejar **condiciones más complejas**, mientras que **`switch-case`** es más **específico** y adecuado para **comparaciones de igualdad** en expresiones concretas.
    }
}
