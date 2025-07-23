package C20_250625.models;

// Clase principal que prueba el funcionamiento del gestor de cursos
public class Main {
    public static void main(String[] args) {
        // Se crea una instancia del gestor de cursos
        GestorCursos gestor = new GestorCursos();

        // Se crean 4 estudiantes con nombre y matrícula
        Estudiantes estudiante1 = new Estudiantes("Daniela", 1001);
        Estudiantes estudiante2 = new Estudiantes("Marce", 1002);
        Estudiantes estudiante3 = new Estudiantes("Rodrigo", 1003);
        Estudiantes estudiante4 = new Estudiantes("Tais", 1004);

        // Se agregan estudiantes a distintos cursos
        gestor.agregarEstudianteACurso("Ciencias", estudiante1);
        gestor.agregarEstudianteACurso("Matemáticas", estudiante2);
        gestor.agregarEstudianteACurso("Lenguaje", estudiante3);
        gestor.agregarEstudianteACurso("Historia", estudiante4);

        // Se muestran los estudiantes inscritos en el curso de Matemáticas
        gestor.mostrarEstudiantesDeCurso("Matemáticas");

        // Se elimina a Marce del curso de Matemáticas (por matrícula)
        gestor.removerEstudianteDeCurso("Matemáticas", 1002);

        // Se muestra nuevamente la lista de estudiantes del curso para confirmar que fue removido
        System.out.println("\nDespués de remover:");
        gestor.mostrarEstudiantesDeCurso("Matemáticas");
    }
}