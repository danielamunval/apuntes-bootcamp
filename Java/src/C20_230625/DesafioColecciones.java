package C20_230625;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.HashMap;

public class DesafioColecciones {
    public static void main(String[] args) {

        System.out.println("**Condiciones Iniciales**\n");

        // 1. ArrayList para almacenar nombres de personajes
        ArrayList<String> personajes = new ArrayList<>();
        personajes.add("Eleven");
        personajes.add("Mike");
        personajes.add("Dustin");
        personajes.add("Lucas");
        personajes.add("Max");

        // 2. HashSet para almacenar habilidades únicas
        HashSet<String> habilidades = new HashSet<>();
        habilidades.add("Telequinesis");
        habilidades.add("Liderazgo");
        habilidades.add("Inteligencia");
        habilidades.add("Habilidad con la honda");
        habilidades.add("Patinaje");

        // 3. HashMap para asociar personajes con su habilidad principal
        HashMap<String, String> personajeHabilidad = new HashMap<>();
        personajeHabilidad.put("Eleven", "Telequinesis");
        personajeHabilidad.put("Mike", "Liderazgo");
        personajeHabilidad.put("Dustin", "Inteligencia");
        personajeHabilidad.put("Lucas", "Habilidad con la honda");
        personajeHabilidad.put("Max", "Patinaje");

        // Mostrar información inicial
        System.out.println("Personajes: " + personajes);
        System.out.println("Habilidades únicas: " + habilidades);
        System.out.println("Personajes con sus habilidades: " + personajeHabilidad);

        /*** Operaciones ***/
        System.out.println("\n*** OPERACIONES SOLICITADAS ***");
        //Agregar un nuevo personaje al ArrayList y al HashMap
        personajes.add("NuevoPersonaje");
        habilidades.add("Teletransporte");
        personajeHabilidad.put("NuevoPersonaje", "Teletransporte");

        //Eliminar a Dustin del ArrayList y del HashMap
        personajes.remove("Dustin");
        personajeHabilidad.remove("Dustin");

        // Mostrar información modificada
        System.out.println("Personajes: " + personajes);
        System.out.println("Habilidades únicas: " + habilidades);
        System.out.println("Personajes con sus habilidades: " + personajeHabilidad);

        //Buscar la habilidad de Max
        System.out.println("\nLa habilidad de Max es: " + personajeHabilidad.get("Max"));

        //Verificar si una habilidad existe en el HashSet
        System.out.println("\n¿Está la habilidad 'Teletransporte'? " + habilidades.contains("Teletransporte"));

    }

}
