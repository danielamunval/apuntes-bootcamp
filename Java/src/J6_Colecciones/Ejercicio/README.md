# Ejercicio: Estudiantes Agrupados por Curso

## Objetivo
Crear una clase `GestorCursos` que utilice un `Map<String, ArrayList<Estudiante>>` para agrupar estudiantes por nombre de curso.

## Requisitos:
- Crea la clase `GestorCursos` dentro del paquete `Models`.
- Dentro de esta clase, implementa un `Map<String, ArrayList<Estudiante>>` llamado `cursos`.

## Métodos a implementar:
- `void agregarEstudianteACurso(String curso, Estudiante estudiante)`: Agrega un estudiante a la lista correspondiente al curso.
- `void mostrarEstudiantesDeCurso(String curso)`: Muestra todos los estudiantes inscritos en ese curso.
- `void removerEstudianteDeCurso(String curso, int matricula)`: Elimina al estudiante con esa matrícula del curso especificado.

## Prueba esperada (en clase `Main`):
```java
public static void main(String[] args) {
    // TODO: Crear instancia de GestorCursos
    // TODO: Crear estudiantes y agregarlos a cursos
    // TODO: Mostrar estudiantes del curso
    // TODO: Remover estudiante del curso y volver a mostrar
}
```