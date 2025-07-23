package J1_Variables;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

    //Creamos una instancia de la clase Variables -> Esta instancia ahora ocupa un espacio en memoria. Permite poder ejecutar en la clase main variables que se encuentren en la clase "Variables".
    Variables variables = new Variables();
    Scanner miScanner = new Scanner(System.in); //Este es otro tipo de instancia, donde se llama a la clase Scanner para que se pueda interactuar con el usuario por medio de la consola.

    //Instanciar un objeto equivale a asignarle un espacio en memoria.
    //Esto sucede al crear una variable a partir de una clase.

    //Accedemos a las variables que creamos anteriormente.
    //Variables de instancia -> Necesitan que se cree una variable con el tipo de dato para ser accesibles.

    System.out.println("Hola, mi edad es " + variables.edad);

    //Variables de clase -> no necesitan que se cree una variable, necesitan que se indique la palabra static.
    System.out.println(Variables.saludo);

    //Variable llamada desde el tipo enum
    System.out.println("Hoy es " + Variables.DiasDeLaSemana.MIERCOLES);


    miScanner.close();
    }
}
