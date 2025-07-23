package C20_240625;

public class POO_Persona {

    private String nombre;
    private int edad;
    private String profesion;

    //Se llama al Constructor (Botón derecho -> Generate -> Contructor).
    public POO_Persona(String profesion, int edad, String nombre) {
        this.profesion = profesion;
        this.edad = edad;
        this.nombre = nombre;
    }

    //Acá llamamos a Getter y Setter (Botón derecho -> Generate -> Getter and Setter).
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getProfesion() {
        return profesion;
    }

    public void setProfesion(String profesion) {
        this.profesion = profesion;
    }

    @Override
    public String toString() {
        return "POO_Persona{" +
                "nombre='" + nombre + '\'' +
                ", edad=" + edad +
                ", profesion='" + profesion + '\'' +
                '}';
    }
}
