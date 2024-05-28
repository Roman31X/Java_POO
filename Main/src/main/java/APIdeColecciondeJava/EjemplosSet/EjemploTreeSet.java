package APIdeColecciondeJava.EjemplosSet;
import java.util.*;
public class EjemploTreeSet {
    public static void main(String[] args) {
        Set<String> elemento = new TreeSet<>((a,b) -> b.compareTo(a));
        elemento.add("Uno");
        elemento.add("Dos");
        elemento.add("Tres");
        elemento.add("Tres");
        elemento.add("Cuatro");
        elemento.add("Cinco");
        elemento.add("Seis");
        System.out.println("Test de elemento: "+elemento);

        //Ejemplo con números
        Set<Integer> numeros = new TreeSet<>(Comparator.reverseOrder());

        numeros.add(1);
        numeros.add(5);
        numeros.add(4);
        numeros.add(2);
        numeros.add(3);
        numeros.add(1);//este elemento se repite pero no se muestra
        numeros.add(10);
        System.out.println("numeros = " + numeros);
        
                
    }
}
