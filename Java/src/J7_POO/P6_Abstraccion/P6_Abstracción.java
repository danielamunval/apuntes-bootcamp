package J7_POO.P6_Abstraccion;

public class P6_Abstracción {
    /* ABSTRACCIÓN */
    // -> Es el proceso de simplificar y modelar la realidad, centrándose en las características más importantes y omitiendo los detalles innecesarios.
    // -> Representa los aspectos esenciales de un objeto del mundo real sin preocuparse por los detalles específicos que no son relevantes para el propósito del programa.
    // -> En Java, logramos la abstracción a través de clases abstractas, métodos abstractos e interfaces.

    /* Clases abstractas y métodos abstractos */
    // Una clase abstracta es una clase que no puede ser instanciada directamente y que a menudo se utiliza como una superclase para otras clases concretas.
    // Una clase abstracta puede contener métodos abstractos (métodos sin implementación) y métodos concretos (métodos con implementación).

    // Clase abstracta Vehiculo
    public abstract class Vehiculo { // se usa para declarar la clase abstracta 'abstract'.
        // Método concreto
        void arrancar() { // metodo concreto, puede ser heredado.
            System.out.println("El vehículo ha arrancado.");
        }

        // Método abstracto que debe ser implementado por las subclases
        abstract void conducir(); // metodo abstracto deben implementar el metodo.
    }

    // Subclase concreta Auto, extiende de vehículo, la cual extiende la interfaz conducir
    public class Auto extends Vehiculo {
        @Override
        void conducir() {
            System.out.println("El auto está en movimiento.");
        }
    }

    // Subclase concreta Camion, extiende de vehículo, la cual extiende la interfaz conducir
    public class Camion extends Vehiculo {
        @Override
        void conducir() {
            System.out.println("El camión está en movimiento.");
        }
    }

    // Subclase concreta Bicicleta, extiende de vehículo, la cual extiende la interfaz conducir
    public class Bicicleta extends Vehiculo {
        @Override
        void conducir() {
            System.out.println("La bicicleta está en movimiento.");
        }
    }
}
