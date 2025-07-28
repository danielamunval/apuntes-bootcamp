package J3_Condicionales;

public class C3_ELSEIF_ejemplos {
    public static void main(String[] args) {
        int temperatura = 20;

        if (temperatura >= 10) {
            System.out.println("Hace Calor");
        }
        else {
            System.out.println("Hace frío");
            }


        /** Ejemplo 2 **/
        //También podrían ser muchos if, pero no está bien visto hacer eso; en realidad un ejemplo así debería ser con switch, pero se explicará en otro ejemplo.
        int calificacion = 65;

        if (calificacion >= 70){
            System.out.println("Aprobado");
        }
        else if (calificacion >= 60){
            System.out.println("Sobresaliente");
        }
        else if (calificacion >= 50) {
            System.out.println("Bien");
        }
        else {
            System.out.println("Reprobado");
        }

        /** Ejemplo 3 **/

        String user = "admin";
        String password = "<PASSWORD>";

        // && == AND -> deben cumplirse ambas condiciones para que se ejecute la condición.

        if (user.equals("admin") && password.equals(123)){
            System.out.println("Bienvenido");
        }
        else {
            System.out.println("Ingrese correctamente");
        }
        //En este caso, dará error "ingrese correctamente" porque no coincide 123 con "<Password>"


        /** Ejemplo 3.2 **/

        String user1 = "admin";
        String password1 = "<PASSWORD>";

        // || == OR -> debe cumplirse una o la otra condicion

        if (user1.equals("admin") || password1.equals(123)){
            System.out.println("Bienvenido");
        }
        else {
            System.out.println("Ingrese correctamente");
        }
        //acá dará "bienvenido", ya que se cumple una de las dos condiciones.


    }

}
