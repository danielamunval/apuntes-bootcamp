package J7_POO.P4_Herencia;

public class P4_Herencia {
    /* HERENCIA */
    // -> Permite la creación de una nueva clase basada en una clase existente, aprovechando sus propiedades y comportamientos.
    // -> La clase existente se llama "clase base" o "clase padre", y la nueva clase se llama "clase derivada" o "clase hija". Es así que literalmente "hereda" sus propiedades y comportamientos.

    /* Superclase */
    // Es la clase principal de la cual se deriva otra clase, también se conoce como clase base o clase padre.
    // Contiene atributos y métodos comunes que pueden ser heredados por las subclases, es decir, representa un nivel más general o abstracto en la jerarquía de clases.

    // Superclase = clase base = clase padre.
    class Animal {
        void comer() {
            System.out.println("El animal come");
        }
    }

    /* Subclase */
    // La subclase es la clase que se deriva de otra clase (superclase), también se conoce como clase derivada o clase hija.
    // Hereda los atributos y métodos de la superclase y puede tener sus propios atributos y métodos adicionales, es decir, representa un nivel más específico o especializado en la jerarquía de clases.

    // Subclase = clase derivada = clase hija.
    class Perro extends Animal {
        void ladrar() {
            System.out.println("El perro ladra");
        }
    }

    /* Palabra clave 'extends' */
    // En Java, se usa 'extends' se utiliza para establecer la relación de herencia entre una subclase (clase derivada) y una superclase (clase base o padre).

    class Superclase {
        // Cuerpo de la superclase = clase padre.
    }

    class Subclase extends Superclase {
        // Cuerpo de la subclase = clase hija.
    }

}
