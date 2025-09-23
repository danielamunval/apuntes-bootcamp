package J7_POO.Ejercicio_POO.P1_EjercicioPOO.Models;

public class Estudiante {

    String nombre;
    String apellido;
    int matricula;
    int calificacion;
    int anio;

    //Implementar constructores
    public Estudiante(String nombre, String apellido, int matricula, int calificacion, int anio) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.matricula = matricula;
        this.calificacion = calificacion;
        this.anio = anio;
    }

    // Implementar metodo para imprimir nombre completo. Obtiene nombre completo del estudiante.
    public String obtenerNombreCompleto() {
        return nombre + " " + apellido;
    }

    //Implementar metodo para verificar si está aprobado
    public boolean estaAprobado(){
        return calificacion >=4;
    }

    //Implementar metodo para cambiar de año si está aprobado
    public void avanzarDeAnio(){
        if (estaAprobado()){
            anio++;
            System.out.println(obtenerNombreCompleto() + " ha sido promovido al año " + anio);
        }
        else {
            System.out.println(obtenerNombreCompleto() + " no está aprobado.");

        }

    }

    // Metodo para mostrar información
    public void mostrarInformacion(){

        System.out.println("Estudiante: " + obtenerNombreCompleto());
        System.out.println("Matrícula: " + matricula);
        System.out.println("Calificación: " + calificacion);
        System.out.println("Año actual: " + anio);

    }

}


