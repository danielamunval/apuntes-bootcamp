package J7_POO.Ejemplos_POO.modelo;

import J7_POO.Ejemplos_POO.modelo.animales.Animales;
import J7_POO.Ejemplos_POO.modelo.animales.Gato;
import J7_POO.Ejemplos_POO.modelo.animales.Perro;


public class Main {
    public static void main(String[] args) {
        // Instanciar
        Animales animales = new Animales("Michi", "Gato", 3);
        animales.mostrarInformacion();
        animales.hacerSonido();

        System.out.println(" =========================");

        // Instancia
        Perro perro = new Perro ("Rocky", "Labrador", 4);
        perro.mostrarInformacion();
        perro.hacerSonido();

        System.out.println(" =========================");

        Gato gato = new Gato("Lucia", "Gato", 5);
        gato.mostrarInformacion();
        gato.hacerSonido();

        System.out.println(" =========================");

        System.out.println("¿" + perro.getNombre() + " está entrenado " + " ? " + perro.isEntrenado());
        perro.entrenar();

        System.out.println("¿" + perro.getNombre() + " está entrenado ahora ? " + perro.isEntrenado());

        System.out.println();
        perro.saludar();

        System.out.println(" =========================");

        System.out.println("¿" + gato.getNombre() + " es cazador? " + gato.esCazador());
        gato.setCazador(false);
        System.out.println("¿" + gato.getNombre() + " es cazador? ahora " + gato.esCazador());


    }


}
