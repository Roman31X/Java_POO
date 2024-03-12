package APIdeColecciondeJava.List;
import APIdeColecciondeJava.Modelo.Alumno;

import java.util.*;
public class EjemploArrayList {
    public static void main(String[] args) {
        List<Alumno> al = new ArrayList<>();
        System.out.println(al + " - size : "+al.size());
        System.out.println("Esta vacía : "+al.isEmpty());

        al.add(new Alumno("Pato",5));
        al.add(new Alumno("Cata",6));
        al.add(new Alumno("Luci",4));
        al.add(new Alumno("Mario",7));
        al.add(new Alumno("Andres",3));
        System.out.println(al + " - size : "+al.size());

    }
}
