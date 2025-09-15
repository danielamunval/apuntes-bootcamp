package J5_Funciones.Ejemplo;

public class Main {
    public static void main(String[] args) {
        // Métodos estáticos de la clase Calculadora
        int resultadoSuma = Calculadora.sumar(5, 3);  // 8
        int resultadoMultiplicacion = Calculadora.multiplicar(4, 2); // 8
        int resultadoDivision = Calculadora.division(10,2);
        int resultadoResta = Calculadora.restar(10, 5);

        System.out.println("Resultado de la Suma es: " + resultadoSuma);
        System.out.println("Resultado de la Multiplicación es: " + resultadoMultiplicacion);
        System.out.println("Resultado de la Division es: " + resultadoDivision);
        System.out.println("Resultado de la Resta es: " + resultadoResta + "\n");

        // Métodos no estáticos de la clase Usuario
        Usuario usuario1 = new Usuario("El Profesor");
        usuario1.saludar();

    }
}