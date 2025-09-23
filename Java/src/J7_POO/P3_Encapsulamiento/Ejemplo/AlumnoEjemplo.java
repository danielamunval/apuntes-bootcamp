package J7_POO.P3_Encapsulamiento.Ejemplo;

public class AlumnoEjemplo {

    // Encapsulación --> métodos como getter y setter, cuando un atributo esté oculto.

    // Atributos privados:
    private String nombre;
    private int edad;

    // Constructor: se llama automáticamente al crear un objeto nuevo.
    public AlumnoEjemplo (String nombre, int edad) {
        // 'this' se refiere al atributo de la clase.
        this.nombre = nombre; // asignamos parámetro del atributo.
        this.edad = edad;
    }

    // Getter : permite leer o obtener el valor de forma controlada
    public String getNombre() {
        return nombre;
    }

    public int getEdad() {
        return edad;
    }

    // Setter : permite leer o cambiar el valor si lo necesitamos
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    @Override
    public String toString() {
        return "Alumno{" +
                "nombre='" + nombre + '\'' +
                ", edad=" + edad +
                '}';
    }

}

