package APIdeColecciondeJava.Map;

import java.util.*;

public class EjemploHasMap {
    public static void main(String[] args) {

        //No permite datos repetidos solo el ultimo
        Map<String, String> persona = new HashMap<>();
        persona.put("nombre","John");
        persona.put("segundo nombre","John"); //Si se puede repetir siempre y cuando la llave sea distinta
        persona.put("apodo","Vabayaga")
        persona.put("apellido","With");
        persona.put("email","jhon.with@gmail.com");
        persona.put("edad","25");

        System.out.println("Persona : "+ persona);

        //IMPRIMIR LOS DATOS POR LA LLAVE
        String nombre = persona.get("nombre");
        System.out.println("El nombre es : "+nombre);
        String apellido = persona.get("apellido");
        System.out.println("Su apellido es : "+apellido);




    }
}
