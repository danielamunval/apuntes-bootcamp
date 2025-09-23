package J6_Colecciones.Ejercicio.models; // Define el paquete donde se encuentra esta clase

// Clase que representa a un estudiante
public class Estudiantes {
    private String nombre;    // Nombre del estudiante
    private int matricula;    // Número de matrícula del estudiante

    public Estudiantes(String nombre, int matricula) {
        this.nombre = nombre;
        this.matricula = matricula;
    }

    // Getter para obtener el nombre del estudiante
    public String getNombre() {
        return nombre;
    }

    // Getter para obtener la matrícula del estudiante
    public int getMatricula() {
        return matricula;
    }

    // Metodo toString para mostrar información del estudiante en texto
    @Override
    public String toString() {
        return "Estudiantes{" +
                "nombre='" + nombre + '\'' +
                ", matricula=" + matricula +
                '}';
    }
}