package J3_Condicionales;

public class C5_EjemploSwitch {
    public static void main(String[] args) {
        int dia = 3;
        String nombreDia;

        switch (dia) {
            case 1: nombreDia = "Lunes"; return; // acá se puede poner return o break, return es más común
            case 2: nombreDia = "Martes"; break;
            case 3: nombreDia = "Miércoles"; break;

            default: nombreDia = "No definido"; break;
        }
        System.out.println("Hoy es: " + nombreDia);


        /** Ejemplo 2 **/

        String mes = "enero";

        int diasDelmes;

        switch (mes.toLowerCase()){
            case "enero":
                System.out.println("Es enero");
                break;
            case "marzo":
                break;
            default:
                diasDelmes = 0;
                System.out.println("mes no válido");
        }


        /** Ejemplo 3 **/

        char letra = 'a';

        switch (letra) {
            case 'a':
                System.out.println("Letra A");
                break;
            case 'b':
                System.out.println("Letra B");
                break;
            case 'c':
                System.out.println("Letra C");
                break;
            default:
                System.out.println("No es una letra válida");
                break;

        }

    }
}
