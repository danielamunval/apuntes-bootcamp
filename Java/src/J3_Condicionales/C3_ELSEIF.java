package J3_Condicionales;

public class C3_ELSEIF {
    public static void main(String[] args) {
        /** CONDICION ELSE IF **/
        // permite evaluar múltiples condiciones en secuencia y ejecutar el bloque de código asociado a la primera condición verdadera.
        // Se evalúan las condiciones en orden. Si condicion1 es verdadera, se ejecuta el primer bloque. Si no lo es, se evalúa condicion2. El bloque asociado a la primera condición verdadera se ejecuta, y si ninguna condición es verdadera, se ejecuta el bloque dentro del else.

        // sintaxis básica:
        boolean condicion1 = true;
        boolean condicion2 = true;

        if (condicion1) {
            // Bloque de código a ejecutar si la condicion1 es verdadera
        } else if (condicion2) {
            // Bloque de código a ejecutar si la condicion2 es verdadera
        } else {
            // Bloque de código a ejecutar si ninguna condición es verdadera
        }


    }
}
