package C20_160625;

public class EjemploIFanidados {
    public static void main(String[] args) {

        boolean usuario = true;
        boolean password = true;
        boolean activo = false;

        //al ir modificando una de las variables, van a ir variando los resultados porque "toma un camino distinto".
        if (activo) {
            if (password) {
                if (activo) {
                    System.out.println("Bienvenido");
                } else {
                    System.out.println("Cuenta Inactiva");
                }
            } else {
                System.out.println("Password correcta");
            }
        } else {
            System.out.println("Ingrese correctamente");
        }

        /** EJEMPLO 2 - hay que revisarlo bien por las llaves, me confundí en alguna parte**/

        int edad = 20;
        double promedio = 8.5;
        boolean becado = true;

        if (edad >= 18) {
            System.out.println("Estudiante Universitario");

            if (promedio >= 8.0) {
                System.out.println("Super Destacado");

                if (becado) {
                    System.out.println("Becado");
                } else {
                    System.out.println("No Becado");
                }

            } else if (promedio >= 6.0) {
                System.out.println("Destacado");
            } else {
                System.out.println("No tan destacado");
            }

        } else {
            System.out.println("No cumple con el requisito");
        }
    }
}
