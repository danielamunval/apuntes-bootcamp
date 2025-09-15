package J5_Funciones;

public class F3_MetodoStatic {
/** Funciones estáticas - métodos estáticos **/
    // Pertenecen a la clase, no al objeto ni a instancias específicas de la clase.
    // Se pueden llamar directamente usando el nombre de la clase sin necesidad de crear una instancia (objeto).
    // Se usan para utilidades generales, cálculos u operaciones que no dependan de datos específicos de un objeto.
    // Estos métodos se declaran con la palabra clave ‘static’.

    /** EJEMPLO **/
    public static int cuadrado(int x) {
    return x * x;
    }

        public static void main(String[] args) {
        // Puedo llamarlo así sin crear objeto.
        }

        /** EJEMPLO 2 **/
        // Declaración del método suma
        public class Ejemplo {
            public static int suma(int a, int b) {
                return a + b;
            }
        }

        // Uso del método
            int resultado = Ejemplo.suma(5, 3);
}
