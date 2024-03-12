package APIdeColecciondeJava.Set;

import APIdeColecciondeJava.Modelo.Alumno;
import java.util.*;

public class EjemploHashSetUnidad {
    public static void main(String[] args) {
        Set<Alumno> sa = new HashSet<>();
        sa.add(new Alumno("Pato",5));
        sa.add(new Alumno("Cata",6));
        sa.add(new Alumno("Luci",4));
        sa.add(new Alumno("Mario",7));
        sa.add(new Alumno("Andres",3));
        sa.add(new Alumno("Zeus",2));
        sa.add(new Alumno("Zeus",2));

        System.out.println(sa);

        //Iterando un Set
        System.out.println("Iterando usando forEach");
        for (Alumno a :sa) {
            System.out.println(a.getNombre());
        }
        System.out.println("Iterando usando while y iterator");
        Iterator<Alumno> it = sa.iterator();
        while(it.hasNext()){
            Alumno a = it.next();
            System.out.println(a.getNombre());
        }
        System.out.println("Iterando usando Stream foreEach");
        sa.forEach(a -> System.out.println(a.getNombre()));

        System.out.println("Programación funcional");
        sa.forEach(System.out::println);

        //CASO FUERA UN LIST
        /**Si cambiamos el  ArraysList<>() pore un LinkedList<>()
         * ESTE SI PERMITE UTILIZAR TODOS LOS ITERATOR*/
        List<Alumno> so = new ArrayList<>();
        so.add(new Alumno("Pato",5));
        so.add(new Alumno("Cata",6));
        so.add(new Alumno("Luci",4));
        so.add(new Alumno("Mario",7));
        so.add(new Alumno("Andres",3));
        so.add(new Alumno("Zeus",2));
        so.add(new Alumno("Zeus",2));

        System.out.println("Iterando Utilizando un for clasico");
        for (int i = 0; i < so.size(); i++) {
            Alumno a = so.get(i);
            System.out.println(a.getNombre());
        }
    }
}
