package APIdeColecciondeJava.Set;

import APIdeColecciondeJava.Modelo.Alumno;
import java.util.*;

public class EjemploTreeSetComparable {
    public static void main(String[] args) {
        Set<Alumno> sa = new TreeSet<>((a ,b) -> b.getNombre().compareTo(a.getNombre()));
        sa.add(new Alumno("Pato",5));
        sa.add(new Alumno("Cata",6));
        sa.add(new Alumno("Luci",4));
        sa.add(new Alumno("Mario",7));
        sa.add(new Alumno("Andres",3));
        sa.add(new Alumno("Zeus",2));
        sa.add(new Alumno("Lucas",2));

        sa.forEach(System.out::println);

    }
}
