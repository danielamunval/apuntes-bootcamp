package C20_160625;

public class ELSEIF {
    public static void main(String[] args) {
        int nota = 30;

        boolean asistencia = true;

        if (nota >= 70 && asistencia){
            System.out.println("Aprobado 1");
        }
        else {
            System.out.println("Reprobado");
        }

        //cumplir ambas condiciones, el y o and es cuando se cumplean ambas condiciones.
            // acá tenemos dos condiciones
            // condición 1 = verdadera
            // condición 2 = verdadero
            // verdadero + verdadero = verdadero.

        if (nota >= 40 && asistencia){
            System.out.println("Aprobado 2");
        }
    }
}
