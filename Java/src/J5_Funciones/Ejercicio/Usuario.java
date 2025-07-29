package J5_Funciones.Ejercicio;

public class Usuario {
    private String nombre;
    public Usuario(String nombre) {
        this.nombre = nombre;
        }
        public void saludar() {
            System.out.println("Hola, soy " + nombre);
        }
}
