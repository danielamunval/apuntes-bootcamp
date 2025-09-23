package J7_POO.P2_Principios.Ejemplo;

class Auto {
    public static void main(String[] args) {
        vehiculo miAuto = new vehiculo(); // Creamos un objeto

        miAuto.tipo = "Auto";
        miAuto.ruedas = 4;
        miAuto.color = "Rojo";

        System.out.println("Tipo: " + miAuto.tipo);
        System.out.println("Ruedas: " + miAuto.ruedas);
        System.out.println("Color: " + miAuto.color);

        miAuto.avanzar(); // Usamos el método
    }
}
