package J3_Condicionales;

public class C4_IF_Anidados {
    public static void main(String[] args) {

        /** ¿Puedo tener bloques if dentro de otros? Si --> If anidados **/

        //Al proceso de colocar una estructura if dentro de otra se le conoce como **anidación**.
        // Esto permite realizar evaluaciones condicionales más complejas y específicas al incluir múltiples niveles de condiciones.

        // La sintaxis básica de un bloque if anidado se ve así:
        boolean condicion1 = true;
        boolean condicion2 = true;
        boolean condicion3 = false;
        if (condicion1) {
            // Bloque de código si condicion1 es verdadera

            if (condicion2) {
                // Bloque de código si condicion2 es verdadera

                if (condicion3) {
                    // Bloque de código si condicion3 es verdadera
                } else {
                    // Bloque de código si condicion3 es falsa
                }

            } else {
                // Bloque de código si condicion2 es falsa
            }

        } else {
            // Bloque de código si condicion1 es falsa
        }
    }
}
