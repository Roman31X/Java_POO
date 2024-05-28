package APIdeColecciondeJava.Map;

import java.util.*;

public class EjemploTreeMapTipoObjet {
    public static void main(String[] args) {

        //Map<String, Object> persona = new TreeMap<>((a, b) -> b.compareTo(a));
        //Map<String, Object> persona = new TreeMap<>(Comparator.reverseOrder()); //Otra forma de invertir
        Map<String, Object> persona = new TreeMap<>(Comparator.comparing(String::length).reversed()); //Otra forma de invertir por el largo del String

        System.out.println("Contiene elementos : "+!persona.isEmpty());
        System.out.println();

        //INGRESAR O AGREGAR ELEMENTOS CON SU RESPECTIVA LLAVE
        persona.put("nombre","John");
        //persona.put(null,"John"); //no puede ordenar si la llave es null
        persona.put("apodo","Vabayaga");
        persona.put("apellido","With");
        persona.put("email","jhon.with@gmail.com");
        persona.put("edad","25");

        //ANIDANDO MAP DENTRO DE OTRO MAP
        Map<String, String> direccion = new TreeMap<>();
        direccion.put("pais","USA");
        direccion.put("estado","California");
        direccion.put("ciudad","Santa Barbara");
        direccion.put("calle","One Street");
        direccion.put("numero","120");

        persona.put("direccion",direccion);
        System.out.println("Persona : "+persona);

    }
}
