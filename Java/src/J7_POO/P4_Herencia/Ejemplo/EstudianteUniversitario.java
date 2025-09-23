package J7_POO.P4_Herencia.Ejemplo;

public class EstudianteUniversitario extends Estudiante {

    private String carrera;
    private int creditos;

    public EstudianteUniversitario(String nombre, int edad, String carrera, int creditos) {
        super(nombre, edad);
        this.carrera = carrera;
        this.creditos = creditos;
    }

    @Override
    public void estudiar() {
        System.out.println("Estudiante " + nombre + " esta estudiando en " + carrera + " con " + creditos + " creditos");
    }
}
