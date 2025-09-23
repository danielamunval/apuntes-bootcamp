### **Instrucciones para la Parte 1 del Ejercicio "Explorando el Proyecto del Sistema de Evaluación de Clases"**

1. **Modificación del Proyecto  “Evaluador de clase” en IntelliJ IDEA:**
    - Si no tienes creado el proyecto o la clase de “Evaluador de clase”, abre IntelliJ IDEA y selecciona "File" > "New" > "Project...".
    - Selecciona "Java" como tipo de proyecto y haz clic en "Next".
    - Completa la configuración del proyecto (nombre, ubicación, etc.) y haz clic en "Finish".
2. **Creación de la Clase `Estudiante`:**
    - Crea un nuevo package llamado **`Models`**, dentro del paquete principal del proyecto(**`src`**)
    - Crea una nueva clase llamada **`Estudiante`** en el paquete **`Models`**.
    - Copia y pega el siguiente código en la clase **`Estudiante`**:
    - Implementa los métodos enlistados como comentarios.
```java
public class Estudiante {
String nombre;
String apellido;
int matricula;
int calificacion;
int año;

    // TODO: Implementar constructores

    // TODO: Implementar método para imprimir nombre completo

    // TODO: Implementar método para verificar si está aprobado

    // TODO: Implementar método para cambiar de año si está aprobado
}
```
3. **Creación de la Clase `Curso`:**
    - Crea una nueva clase llamada **`Curso`** en el paquete **`Models`**.
    - Copia y pega el siguiente código en la clase **`Curso`**:
    - Implementa los métodos enlistados como comentarios

```java

import java.util.ArrayList;

public class Curso {
    String nombreCurso;
    String nombreProfesor;
    int año;
    ArrayList<Estudiante> estudiantesInscritos;

    // TODO: Implementar constructor

    // TODO: Implementar método para inscribir a un estudiante

    // TODO: Implementar método para desinscribir a un estudiante

    // TODO: Implementar método para contar estudiantes

    // TODO: Implementar método para obtener la mejor calificación
}
```

1. **Pruebas en el Método Principal (`Main`):**
    - Dirígete a la clase principal y al método **`Main`** en el paquete principal de tu proyecto (**`src`**).
    - Copia y pega el siguiente código en la clase principal del proyecto para realizar pruebas, si ya el método **`main`** está creado, copia solamente los comentarios:

    ```java
    public static void main(String[] args) {
            // TODO: Crear instancias de Estudiante y probar métodos
    
            // TODO: Crear instancias de Curso y probar métodos
        }
    ```

    - Ejecuta el proyecto y verifica que se creen las instancias y se ejecuten los métodos.