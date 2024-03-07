package APIdeColecciondeJava.EjemplosSet;

import java.util.HashSet;
import java.util.Set;

public class EjemploHashSetAgregar {
    public static void main(String[] args) {
        Set<String> numeros = new HashSet<>();

        numeros.add("Uno");
        numeros.add("Dos");
        numeros.add("Tres");
        numeros.add("Cuatro");
        numeros.add("Cinco");
        System.out.println(numeros);

        //el SET no permite repetidos Ejemplo:

        boolean permite = numeros.add("Tres");
        System.out.println("SET permite datos duplicados : "+permite);
        System.out.println(numeros);

    }
}
