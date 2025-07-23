package C20_160625;

public class EjemploOperadorTernario {
    public static void main(String[] args) {
        int edad = 17;
        String estado = (edad >= 18) ? "Es mayor de edad" : "No es mayor de edad";
        //es una forma abreviada de agregar un if, se llama "operador ternario". Acá se declara, se forma la condición todo en una sola línea.
        //El ? es una forma distinta de expresar un if, siempre y cuando se vea acompañado de dos "" separados por un :
        System.out.println(estado);




    }
}
