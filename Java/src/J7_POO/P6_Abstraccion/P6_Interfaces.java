package J7_POO.P6_Abstraccion;

public class P6_Interfaces {

    /* INTERFACES

    -> Es una colección de métodos abstractos (sin implementación), es decir, define un conjunto de métodos que las clases que la implementan deben proporcionar, pero no contiene ninguna implementación real de esos métodos.

     * Interfaces -> nacen porque no se pueden hacer herencias de las herencias (multiherencias). Sin embargo, con las interfaces se plantea una solución con el metodo "implements".
     Si bien las multiherencias no se pueden realizar, si se pueden realizar interfaces sobre interfaces.


      * Las interfaces están en otro package, por lo tanto se pueden sobre escribir cuantas veces sea necesario.
      */

    // Interfaz Conducible
    public interface Conducible {
        void conducir();
    }

    // Interfaz Arrancable
    public interface Arrancable {
        void arrancar();
    }

    // Clase abstracta Vehiculo que implementa las interfaces Conducible y Arrancable
    public abstract class Vehiculo implements Conducible, Arrancable {
        // Puede proporcionar implementaciones por defecto para los métodos de las interfaces (Java 8 en adelante)
        @Override
        public void arrancar() {
            System.out.println("El vehículo ha arrancado.");
        }
    }

    // Subclase concreta Auto
    public class Auto extends Vehiculo {
        @Override
        public void conducir() {
            System.out.println("El auto está en movimiento.");
        }
    }

    // Subclase concreta Camion
    public class Camion extends Vehiculo {
        @Override
        public void conducir() {
            System.out.println("El camión está en movimiento.");
        }
    }

    // Subclase concreta Bicicleta
    public class Bicicleta extends Vehiculo {
        @Override
        public void conducir() {
            System.out.println("La bicicleta está en movimiento.");
        }
    }

    // Este diseño permite que las clases compartan una interfaz común(Conducible) y al mismo tiempo hereden un comportamiento compartido (Arrancable).

}
