package J5_Funciones;

public class F5_Void {
    /** VOID **/
    // Se refiere a cuando el método no devuelve valores.
    // Un método void se usa cuando la tarea que realiza el método no requiere devolver información.

    /** EJEMPLO **/

    public class EjemploMetodoVoid {

        // Método que no devuelve ningún valor (void)
        public static void saludar(String nombre) {
            System.out.println("Hola, " + nombre + "!");
        }

        // Método principal (main) donde se llama al método void
        public static void main(String[] args) {
            // Llamada al método void "saludar" con el argumento "Juan"
            saludar("Juan");

            // No se espera un valor de retorno, ya que el método es void.
        }
    }


}
