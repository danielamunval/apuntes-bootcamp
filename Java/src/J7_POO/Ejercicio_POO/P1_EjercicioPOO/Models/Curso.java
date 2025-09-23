package J7_POO.Ejercicio_POO.P1_EjercicioPOO.Models;

import java.util.ArrayList;

public class Curso {
    String nombreCurso;
    String nombreProfesor;
    int anio;
    ArrayList<Estudiante> estudiantesInscritos;

    // Implementar constructor
    public Curso(String nombreCurso, String nombreProfesor, int anio) {
        this.nombreCurso = nombreCurso;
        this.nombreProfesor = nombreProfesor;
        this.anio = anio;
        this.estudiantesInscritos = new ArrayList<>();
    }

    // Implementar metodo para inscribir a un estudiante
    public void inscribirEstudiante(Estudiante estudiante){
        estudiantesInscritos.add(estudiante);
        System.out.println(estudiante.obtenerNombreCompleto() + " ha sido inscrito en el curso " + nombreCurso);
    }

    // Implementar metodo para desinscribir a un estudiante
    public void desinscribirEstudiante(Estudiante estudiante){
        if (estudiantesInscritos.remove(estudiante)){
            System.out.println(estudiante.obtenerNombreCompleto() + " ha sido desinscrito del curso " + nombreCurso);
        }
        else {
            System.out.println("El estudiante no está inscrito en el curso.");
        }

    }

    // Implementar metodo para contar estudiantes
    public int contarEstudiantes(){
        return estudiantesInscritos.size();
    }

    // Implementar metodo para obtener la mejor calificación
    public int obtenerMejorCalificacion () {
        int mayor = 0;
        for (Estudiante estudiante : estudiantesInscritos){
            if (estudiante.calificacion > mayor){
                mayor = estudiante.calificacion;
            }
        }
        return mayor;
    }


}


