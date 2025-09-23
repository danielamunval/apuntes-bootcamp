package J6_Colecciones.Ejercicio.models;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

    public class GestorCursos {
        // Mapa donde la clave es el nombre del curso y el valor es una lista de estudiantes
        private Map<String, ArrayList<Estudiantes>>cursos;

        // Constructor
        public GestorCursos() {
            cursos = new HashMap<>();
        }

        // Metodo para agregar un estudiante a un curso
        public void agregarEstudianteACurso(String curso, Estudiantes estudiante) {
            cursos.putIfAbsent(curso, new ArrayList<>());
            cursos.get(curso).add(estudiante);
        }

        // Metodo para mostrar los estudiantes de un curso
        public void mostrarEstudiantesDeCurso(String curso) {
            if (cursos.containsKey(curso)) {
                System.out.println("Estudiantes del curso " + curso + ":");

                // Obtenemos la lista de estudiantes del curso
                ArrayList<Estudiantes> lista = cursos.get(curso);

                // Verificamos si está vacía
                if (lista.isEmpty()) {
                    System.out.println("No hay estudiantes inscritos en este curso.");
                } else {
                    for (Estudiantes est : lista) {
                        System.out.println(est);
                    }
                }
            } else {
                System.out.println("El curso '" + curso + "' no existe.");
            }
        }

        // Metodo para remover a un estudiante del curso usando su matrícula
        public void removerEstudianteDeCurso(String curso, int matricula) {
            if (cursos.containsKey(curso)) {
                cursos.get(curso).removeIf(est -> est.getMatricula() == matricula);
            } else {
                System.out.println("El curso '" + curso + "' no existe.");
            }
        }
    }