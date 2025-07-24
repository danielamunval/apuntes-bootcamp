package J2_Operadores;

public class Main {
    public static void main(String[] args) {
        /*** Prueba operaciones aritméticas ***/

        OperadoresAritmeticos operadores = new OperadoresAritmeticos();

        System.out.println("***** Desde acá comenzamos a probar operaciones aritméticas *****");
        System.out.println("El resultado de la suma es -> " + operadores.resultadoSuma);
        System.out.println("El resultado de la resta es -> " + operadores.resultadoResta);
        System.out.println("El resultado de la multiplicación es -> " + operadores.resultadoMultiplicacion);
        System.out.println("El resultado de la división es -> " + operadores.resultadoDivision);
        System.out.println("El resto de la división es -> " + operadores.restoDivision);
    }
}
