package APIdeColecciondeJava.Map;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class EjemploHasMapTipoObjet {
    public static void main(String[] args) {

        //No permite datos repetidos solo el ultimo
        Map<String, Object> persona = new HashMap<>();
        System.out.println("Contiene elementos : "+!persona.isEmpty());
        System.out.println();

        //INGRESAR O AGREGAR ELEMENTOS CON SU RESPECTIVA LLAVE
        persona.put("nombre","John");
        persona.put("segundo nombre","John"); //Si se puede repetir siempre y cuando la llave sea distinta
        persona.put("apodo","Vabayaga");
        persona.put("apellido","With");
        persona.put("email","jhon.with@gmail.com");
        persona.put("edad","25");

        //ANIDANDO MAP DENTRO DE OTRO MAP
        Map<String, String> direccion = new HashMap<>();
        direccion.put("pais","USA");
        direccion.put("estado","California");
        direccion.put("ciudad","Santa Barbara");
        direccion.put("calle","One Street");
        direccion.put("numero","120");

        persona.put("direccion",direccion);

        System.out.println("Persona : "+ persona);

        //IMPRIMIR LOS DATOS POR LA LLAVE
        String nombre = (String) persona.get("nombre");
        System.out.println("El nombre es : "+nombre);
        String apellido = (String) persona.get("apellido");
        System.out.println("Su apellido es : "+apellido);
        System.out.println();

        //IMPRIMIR UN MAP DEL MAP PERSONA EXTRAYENDO POR SU LLAVE
        Map<String, String> direccionPersona = (Map<String, String>) persona.get("direccion");
        String pais = direccionPersona.get("pais");
        String ciudad = direccionPersona.get("ciudad");
        String barrio = direccionPersona.getOrDefault("barrio","la playa"); //este nos permite en caso no contengan esta llave dentro del map
        System.out.println("La persona es del pais : "+pais);
        System.out.println("Pertenece a la ciudad de : "+ciudad);
        System.out.println("Pertenece al barrio de : "+barrio);
        System.out.println();

        //String segundoNombre = persona.remove("segundo nombre");
        boolean b = persona.remove("segundo nombre","John");
        System.out.println("segundo nombre eliminado : "+ b);
        System.out.println("Datos persona : "+ persona);

        //VERIFICAR SI CONTIENE POR LLAVE
        boolean b2 = persona.containsKey("nombre");
        System.out.println("Contiene su nombre de John : "+b2);

        //VERIFICAR SI CONTIENE POR DATO
        boolean b3 = persona.containsValue("John");
        System.out.println("Contiene el primer nombre John : "+b3);
        System.out.println();

        //RECORRER CON COLLECTION RECORRE LOS VALORES DE DATOS
        System.out.println("+++++++Implementando VALUES()+++++++");
        Collection<Object> valores = persona.values();
        for (Object valor : valores) {
            System.out.println(valor);
        }
        System.out.println();

        //RECORRER CON SET RECORRE LOS VALORES DE LA LLAVES
        System.out.println("+++++++Implementando KeySet()+++++++");
        Set<String> llaves = persona.keySet();
        for (String k : llaves) {
            System.out.println("Llave K : "+k);
        }
        System.out.println();

        //RECORRER LOS PARES Y VALORES O LLAVES Y DATOS
        System.out.println("+++++++Implementando entrySet()+++++++");
        for (Map.Entry<String, Object> par : persona.entrySet()) {
            Object valor = par.getValue();
            if (valor instanceof Map) {
                String nom = (String) persona.get("nombre");
                Map<String, String> direccionMap = (Map<String, String>) valor;
                for (Map.Entry<String, String > parDir : direccionMap.entrySet()) {
                    System.out.println(parDir.getKey() + " => "+parDir.getValue());
                }
            } else {
                System.out.println(par.getKey() + " => " + par.getValue());
            }
        }
        System.out.println();

        //OTRA FORMA
        for (String llave : persona.keySet()) {
            Object valor = persona.get(llave);
            if( valor instanceof Map){
                String nom = (String) persona.get("nombre");
                Map<String, String> direccionMap = (Map<String, String>) valor;
                System.out.println("El pais de : "+nom+ " es : "+ direccionMap.get("pais"));
                System.out.println("La ciudad de :"+nom+ " es : "+direccionMap.get("ciudad"));
                System.out.println("La calle de :"+nom+" es : "+direccionMap.get("calle"));
            }else{
                System.out.println(llave + " => "+valor);
            }
        }
        System.out.println("=========RECORRIDO LAMBDA==========");

        //IMPRIMIR CON LAMBDA
        persona.forEach((llave,valor) -> {
            System.out.println(llave + " => "+valor);
        });
        System.out.println();

        System.out.println("Total : "+persona.size());
        System.out.println("Contiene elementos : "+!persona.isEmpty());

        //REEMPLAZAR UN VALOR CON SU LLAVE
        persona.replace("nombre","John","Johnatan");
        System.out.println("Persona se llama : "+persona.get("nombre"));

    }
}
