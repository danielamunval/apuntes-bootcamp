package J6_Colecciones;

import java.util.HashMap;
import java.util.Map;

public class C4_Map {
    /** MAPAS - MAP - HASHMAP **/
    // Colección de pares clave - valor.
    // Cada clave está asociada a un único valor.

    public static void main(String[] args) {

        //Declaración Map
        Map<String, Integer> inventario = new HashMap<>();

        //Agregar pares *clave y valor* ---> MUY IMPORTANTE.
        //Ejemplo clave = nombre
        //Ejemplo valor = "Alumno"

        //PUT = De ahora en adelante será "modificar".
        inventario.put("Lapiz", 10); // queda anulado
        inventario.put("Cuaderno", 5);
        inventario.put("Lapiz", 20); // se sobre-escribe al primero, por lo tanto se ve reflejado en la consola solo el valor de acá.

        //Acceder al valor
        System.out.println("La cantidad de lápices es: " + inventario.get("Lapiz"));

        //Recorrer un map
        System.out.println("Inventario Completo");
        for (Map.Entry<String, Integer> entry : inventario.entrySet()) { //Se debe registrar si o si el entry para poder entrar.
            System.out.println(entry.getKey() + " " + entry.getValue());
        }

        //Verifica si EXISTE
        //Devuelve un booleano, si lo encuentra true o false.
        System.out.println("¿Existe el lápiz?" + inventario.containsKey("Lapiz")); //si se ingresa uno que no está, simplemente dirá false.

    }

}
