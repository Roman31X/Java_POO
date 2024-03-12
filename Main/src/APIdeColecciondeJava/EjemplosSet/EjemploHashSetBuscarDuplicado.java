package APIdeColecciondeJava.EjemplosSet;

import java.util.*;

public class EjemploHashSetBuscarDuplicado {
    public static void main(String[] args) {
        String[] peces = {"Corvina","Lenguado","Corvina","Pejerrey","Robalo","Atún","Lenguado"};
        Set<String> unico = new HashSet<>();
        Set<String> duplicados = new HashSet<>();
        for (String pez: peces){
            if (!unico.add(pez)){
                duplicados.add(pez);
                //System.out.println("Elemento Duplicado : "+pez);
            }
        }
        //Removemos los duplicados
        unico.removeAll(duplicados);
        System.out.println(duplicados.size() + " Elementos duplicados: "+ duplicados);

        System.out.println(unico.size() + " Elementos no duplicados: "+ unico);
    }
}
