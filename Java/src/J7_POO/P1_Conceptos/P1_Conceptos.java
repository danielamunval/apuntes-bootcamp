package J7_POO.P1_Conceptos;

public class P1_Conceptos {

    /** PROGRAMACIÓN ORIENTADA A OBJETOS **/

    // Un objeto es una abstracción utilizada en el desarrollo de software para representar un objeto de la vida real.
    // Tiene estado y comportamiento. Los objetos de software se usan a menudo para modelar objetos del mundo real que se encuentran en la vida cotidiana.

    // Una clase es un modelo o prototipo a partir del cual se crean los objetos. Las clases básicamente modelan cómo debe verse y qué debe hacer un objeto (estado y comportamiento), con atributos y métodos.

    // Ejemplo: CLASE: VEHÍCULO --> OBJETO: auto, camioneta, camión, bus, etc.


    /** ¿Cómo se compone una clase? **/

    // Declaración de la clase: en este caso: Perro
    public class Perro {

        // Atributos que representan las características del perro.
        // Cada objeto creado a partir de la clase tiene sus propios valores.
        String nombre;
        String raza;
        int edad;

        // METODOS:
        // Son funciones o procedimientos que realizan operaciones específicas. Definen el comportamiento de la clase y describen las acciones que los objetos de esa clase pueden realizar.
        // Método para que el perro ladre
        public void ladrar() {
            System.out.println("¡Guau! ¡Guau!");
        }

        // Método para imprimir información sobre el perro
        public void imprimirInformacion() {
            System.out.println("Nombre: " + nombre);
            System.out.println("Raza: " + raza);
            System.out.println("Edad: " + edad + " años");
        }

        // CONSTRUCTOR:
        // Son métodos especiales utilizados para inicializar un objeto cuando se crea.
        // Tienen el mismo nombre que la clase y no tienen un tipo de retorno explícito.
        // También pueden ser vacíos.

        // Constructor que inicializa los campos nombre, raza y edad
        public Perro(String nombre, String raza, int edad) {
            this.nombre = nombre;
            this.raza = raza;
            this.edad = edad;
        }

        // Creamos un objeto Perro llamado "Mr. Peanutbutter", pueden crearse muchos objetos.
        Perro perro1 = new Perro("Mr. Peanutbutter", "Labrador", 3);
        Perro perro2 = new Perro("Simba", "Mestizo", 12);

    }

}
