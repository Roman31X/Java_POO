package APIdeColecciondeJava.EjemplosSet;

import java.util.*;

public class EjemploHashSetAgregar {
    public static void main(String[] args) {
        Set<String> numeros = new HashSet<>();

        numeros.add("Uno");
        numeros.add("Dos");
        numeros.add("Tres");
        numeros.add("Cuatro");
        numeros.add("Cinco");
        System.out.println(numeros);

        //A partir de un Set podremos crear un ArrayList<>();
        List<String> listaOrdenada = new ArrayList<>(numeros);
        Collections.sort(listaOrdenada);
        System.out.println("Lista ordenada alfabéticamente");
        System.out.println(listaOrdenada);

        //el SET no permite repetido Ejemplo:
        boolean permite = numeros.add("Tres");
        System.out.println("SET permite datos duplicados : "+permite);
        System.out.println(numeros);

    }
}
