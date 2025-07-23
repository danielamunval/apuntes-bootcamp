package C20_250625.encapsulacion;

public class Main {
    public static void main(String[] args) {

        AlumnoEjemplo alumno1 = new AlumnoEjemplo ("Lucia", 23);

        // Mostramos los valors usando ToString():
        System.out.println(alumno1);

        // Resultado sin toString
        // semana6.encapsulacion.Alumno@5f184fc6

        // Resultado con toString()
        // Alumno{nombre='Lucia', edad=23}

        // Mostramos los valores usados desde los getter
        System.out.println("Nombre: " + alumno1.getNombre());
        System.out.println("Edad " + alumno1.getEdad());


    }
}
