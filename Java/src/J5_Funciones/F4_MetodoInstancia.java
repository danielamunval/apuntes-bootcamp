package J5_Funciones;

public class F4_MetodoInstancia {
    /** Funciones no estáticas - métodos de instancia **/
    //  Son los métodos que pertenecen a instancias específicas de la clase, es decir que, se invocan a  través de una instancia particular de la clase.
    //  Se declaran sin la palabra clave ‘static’.

    /** EJEMPLO **/
    // Declaración de clase y método saludar
    public class Persona {
        private String nombre;

        public Persona(String nombre) {
            this.nombre = nombre;
        }

        public void saludar() {
            System.out.println("Hola, soy " + nombre);
        }

        public void main(String[] args) {
            Persona persona1 = new Persona("Juan");
            persona1.saludar();
        }
    }
}
