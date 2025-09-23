package J7_POO.P5_Polimorfismo;

public class P5_Polimorfismo {
    /* POLIMORFISMO */
    // -> Es la capacidad de un objeto de tomar muchas formas.
    // -> El polimorfismo se manifiesta principalmente a través de dos maneras: la sobrecarga y la sobreescritura de métodos.

    /* Sobrecarga de métodos */
    // Permite que una clase proporcione múltiples métodos con el mismo nombre pero con diferente número o tipo de parámetros.

    class Calculadora { // la clase 'Calcauladora' tiene dos métodos llamados 'sumar', uno para enteros, y otro para números decimales.
        int sumar(int a, int b) {
            return a + b;
        }

        double sumar(double a, double b) {
            return a + b;
        }
    }


    /* Sobrescritura */
    // Permite que una subclase proporcione una implementación específica para un método que ya está definido en su superclase.

    // Superclase
    class Animal {
        void hacerSonido() {
            System.out.println("Animal hace un sonido");
        }
    }

    // Subclase que sobrescribe el método 'hacerSonido'
    class Perro extends Animal {
        @Override // la subclase Perro sobrescribe el método hacerSonido de la superclase Animal.
        void hacerSonido() {
            System.out.println("El perro ladra");
        }
    }
}
