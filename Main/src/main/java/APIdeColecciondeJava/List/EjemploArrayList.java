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
        //AGREGAR CON INDICE EN LA LISTA
        al.add(0,new Alumno("Soriano",7));
        al.add(2,new Alumno("Alex",3));
        System.out.println(al + " - size : "+al.size());

        //REMOVER POR INSTANCIA IQUALS
        al.remove(new Alumno("Jano",7));
        //al.remove(0); //REMOVER POR INDICE

        //Verificar si un elemento está contenido dentro de la lista
        boolean b = al.contains(new Alumno("Cata",6));
        System.out.println("La lista contienes a Cata : "+b);

        //Convertir un list en Arrays
        Object a[] = al.toArray();
        for (int i = 0; i < a.length; i++) {
            System.out.println("Contenido en arreglo : "+a[i]);
        }
    }
}
