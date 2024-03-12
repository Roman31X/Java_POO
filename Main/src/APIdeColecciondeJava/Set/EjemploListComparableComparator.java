package APIdeColecciondeJava.Set;
import APIdeColecciondeJava.Modelo.Alumno;

import java.util.*;
public class EjemploListComparableComparator {
    public static void main(String[] args) {
        List<Alumno> so = new ArrayList<>();
        so.add(new Alumno("Pato",5));
        so.add(new Alumno("Cata",6));
        so.add(new Alumno("Luci",4));
        so.add(new Alumno("Mario",7));
        so.add(new Alumno("Andres",3));
        so.add(new Alumno("Zeus2",2));
        so.add(new Alumno("Zeus",2));
        so.add(new Alumno("Lucas",2));
        so.add(new Alumno("Lucas",3));

        //ORDENAR
        //Collections.sort(so, (a, b) -> b.getNota().compareTo(a.getNota()));
        //so.sort((a, b) -> a.getNota().compareTo(b.getNota()));
        System.out.println("Notas Ascendente");
        so.sort(Comparator.comparing(Alumno::getNota));
        System.out.println(so);
        //DESCENDENTE
        System.out.println("Notas Descendente");
        so.sort(Comparator.comparing(Alumno::getNota).reversed());
        System.out.println(so);

        System.out.println("Iterando usando Stream ForEach");
        so.forEach(System.out::println);
    }
}
