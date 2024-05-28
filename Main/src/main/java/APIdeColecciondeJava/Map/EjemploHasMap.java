package APIdeColecciondeJava.Map;

import java.util.*;

public class EjemploHasMap {
    public static void main(String[] args) {

        //No permite datos repetidos solo el ultimo
        Map<String, String> persona = new HashMap<>();
        System.out.println("Contiene elementos : "+!persona.isEmpty());
        System.out.println();

        //INGRESAR O AGREGAR ELEMENTOS CON SU RESPECTIVA LLAVE
        persona.put("nombre","John");
        persona.put("segundo nombre","John"); //Si se puede repetir siempre y cuando la llave sea distinta
        persona.put("apodo","Vabayaga");
        persona.put("apellido","With");
        persona.put("email","jhon.with@gmail.com");
        persona.put("edad","25");

        System.out.println("Persona : "+ persona);

        //IMPRIMIR LOS DATOS POR LA LLAVE
        String nombre = persona.get("nombre");
        System.out.println("El nombre es : "+nombre);
        String apellido = persona.get("apellido");
        System.out.println("Su apellido es : "+apellido);

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
        Collection<String> valores = persona.values();
        for (String valor : valores) {
            System.out.println(valor);
        }
        System.out.println();

        //RECORRER CON SET RECORRE LOS VALORES DE LA LLAVES
        Set<String> llaves = persona.keySet();
        for (String k : llaves) {
            System.out.println("Llave K : "+k);
        }
        System.out.println();

        //RECORRER LOS PARES Y VALORES O LLAVES Y DATOS
        for (Map.Entry<String, String> par : persona.entrySet()) {
            System.out.println(par.getKey()+" => "+par.getValue());
        }
        System.out.println();

        //OTRA FORMA
        for (String llave : persona.keySet()) {
            String valor = persona.get(llave);
            System.out.println(llave + " => "+valor);
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
