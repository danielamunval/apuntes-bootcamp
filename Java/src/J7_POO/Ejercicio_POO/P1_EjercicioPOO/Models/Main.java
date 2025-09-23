package J7_POO.Ejercicio_POO.P1_EjercicioPOO.Models;

public class Main {
    public static void main(String[] args) {

        // Crear instancias de Estudiante y probar métodos
        System.out.println("** Creando Estudiantes **");
        Estudiante estudiante1 = new Estudiante("Juan", "Perez", 101, 7, 5);
        Estudiante estudiante2 = new Estudiante("Carlos", "Gutierrez", 102, 4, 6);
        Estudiante estudiante3 = new Estudiante("Camila", "Rojas", 103, 3, 3);

        // Mostrar información de cada estudiante
        estudiante1.mostrarInformacion();
        System.out.println();
        estudiante2.mostrarInformacion();
        System.out.println();
        estudiante3.mostrarInformacion();
        System.out.println();

        // Comprobación de aprobación y paso de año
        System.out.println("\n** Comprobación promociones ** ");
        estudiante1.avanzarDeAnio();
        estudiante2.avanzarDeAnio();
        estudiante3.avanzarDeAnio();

        // Crear instancias de Curso y probar métodos
        System.out.println("\n== Crear un curso ==\n");

        //Curso
        Curso cursoJava = new Curso("Curso de Java", "El Profe", 2024);

        //Inscribir Estudiantes
        cursoJava.inscribirEstudiante(estudiante1);
        cursoJava.inscribirEstudiante(estudiante2);
        cursoJava.inscribirEstudiante(estudiante3);

        //Mostrar cantidad de estudiantes
        System.out.println("Total de estudiantes inscritos " + cursoJava.contarEstudiantes() + "\n");

        // Mostrar mejor calificación
        System.out.println("Mejor calificación del curso " + cursoJava.obtenerMejorCalificacion() + "\n");

        // Desinscribir a un estudiante
        System.out.println("\n== Desinscripción ==\n");
        cursoJava.desinscribirEstudiante(estudiante1);

        //Mostrar cantidad de estudiantes
        System.out.println("Total de estudiantes inscritos " + cursoJava.contarEstudiantes() + "\n");

        System.out.println("\n == FIN == ");

    }
}


