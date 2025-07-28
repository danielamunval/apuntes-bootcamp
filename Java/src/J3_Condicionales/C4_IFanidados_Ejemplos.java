package J3_Condicionales;

public class C4_IFanidados_Ejemplos {
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

        /** EJEMPLO 2 **/
        // Como se ve en este ejemplo, no es solo el if quien se puede anidar, si no que cualquiera de los condicionales.

        int edad = 20;
        double promedio = 8.5;
        boolean becado = true;

        if (edad >= 18) {
            System.out.println("Estudiante universitario");

            if (promedio >= 9.0) {
                System.out.println("Estudiante destacado");

                if (becado) {
                    System.out.println("Elegible para beca de excelencia");
                } else {
                    System.out.println("Puede aplicar para beca académica");
                }
            } else if (promedio >= 7.0) {
                System.out.println("Estudiante regular");
            } else {
                System.out.println("Estudiante en riesgo académico");
            }
        } else {
            System.out.println("Estudiante de preparatoria");
        }

    }
}
