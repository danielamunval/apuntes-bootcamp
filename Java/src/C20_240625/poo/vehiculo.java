package C20_240625.poo;

public class vehiculo {

    // Atributos comunes
    String tipo;
    int ruedas;
    String color;

    // Método común
    public void avanzar() {
        System.out.println("El vehículo está avanzando.");
    }
}

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

