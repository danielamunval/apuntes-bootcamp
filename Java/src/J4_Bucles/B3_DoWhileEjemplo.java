package J4_Bucles;

import java.util.Scanner;

public class B3_DoWhileEjemplo {
    public static void main(String[] args) {
        int i = 1;

        do {
            System.out.println(i);
            i++;  // Incrementar la variable de control
        } while (i <= 5);


        /** EJEMPLO: validación respuestas **/
        System.out.println("EJEMPLO: Validación de Respuesta");
        Scanner scanner = new Scanner(System.in);
        String respuesta;

        // Pregunta con validación estricta
        do {
            System.out.print("¿Quieres continuar? (sí/no): ");
            respuesta = scanner.nextLine().toLowerCase().trim();

            if (!respuesta.equals("sí") && !respuesta.equals("si") &&
                    !respuesta.equals("no") && !respuesta.equals("sí")) {
                System.out.println("❌ Por favor, responde solo 'sí' o 'no'");
            }

        } while (!respuesta.equals("sí") && !respuesta.equals("si") && !respuesta.equals("no"));
    }
}
