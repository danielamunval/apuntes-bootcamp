package J7_POO.P3_Encapsulamiento;

public class P3_Encapsulamiento {
    /* ENCAPSULAMIENTO */

    // -> Es la ocultación de los detalles internos de un objeto y la restricción del acceso directo a sus atributos.
    // -> En Java, se logra a través del uso de modificadores de acceso (private, protected, public) y métodos de acceso (getters y setters).

    /* Modificadores de acceso */
    // Recordar -> Estos modificadores determinan la visibilidad y accesibilidad de los campos y métodos en una clase.

    public class Ejemplo {
        private int edad;

        // Resto del código de la clase
    }

    // Los atributos de una clase generalmente se definen como privados ("private") para restringir el acceso directo desde fuera de la clase.

    /* Accesadores y mutadores (Getters y Setters) */

    // Los métodos de acceso, también conocidos como getters y setters, proporcionan un medio controlado para acceder y modificar los atributos privados.
    // Los getters: devuelven el valor del atributo.
    // Los setters: establecen o modifican el valor del atributo.

    public class Ejemplo1 {
        private int edad;

        // Getter
        public int getEdad() {
            return edad;
        }

        // Setter
        public void setEdad(int nuevaEdad) {
            if (nuevaEdad > 0) {
                edad = nuevaEdad;
            }
        }
    }
}
