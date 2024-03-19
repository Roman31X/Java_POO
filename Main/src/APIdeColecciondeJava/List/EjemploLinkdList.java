package APIdeColecciondeJava.List;

import APIdeColecciondeJava.Modelo.Alumno;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;

public class EjemploLinkdList {
    public static void main(String[] args) {
        LinkedList<Alumno> enlazada = new LinkedList<>();
        System.out.println(enlazada + " - size : "+enlazada.size());
        System.out.println("Esta vacía : "+enlazada.isEmpty());

        enlazada.add(new Alumno("Pato",5));
        enlazada.add(new Alumno("Cata",6));
        enlazada.add(new Alumno("Luci",4));
        enlazada.add(new Alumno("Mario",7));
        enlazada.add(new Alumno("Andres",3));
        System.out.println(enlazada + " - size : "+enlazada.size());

        enlazada.addFirst(new Alumno("Diego",18)); //Agregar primero
        enlazada.addLast(new Alumno("Dante",19)); //Agregar ultimo
        System.out.println(enlazada + " - size : "+enlazada.size());

        //Visualizar primer y último contenido de la lista y por índice
        System.out.println("Primero en la lista : "+enlazada.getFirst());
        System.out.println("Ultimo en la lista : "+enlazada.getLast());
        System.out.println("Por indice en la lista 2 : "+enlazada.get(2));

        //Remover primero y último
        enlazada.removeFirst();
        enlazada.removeLast();
        System.out.println(enlazada + " - size : "+enlazada.size());

        //Eliminar por indice
        enlazada.remove(2);
        System.out.println(enlazada + " - size : "+enlazada.size());

        //Agregar elemento por objeto
        Alumno a = new Alumno("Lucas",5);
        enlazada.addLast(a);
        System.out.println("Indice de Lucas : "+enlazada.indexOf(a));

        //MODIFICAR por indice
        enlazada.set(3,new Alumno("Lala",7));
        System.out.println(enlazada);

        System.out.println("**************************************************");
        //IMPLEMENTANDO ITERATOR PARA RECORRER LIST
        ListIterator<Alumno> l1 = enlazada.listIterator();
        while (l1.hasNext()){
            System.out.println(l1.next()); //ORDEN ASCENDENTE
        }
        System.out.println();
        while(l1.hasPrevious()){
            System.out.println(l1.previous()); //ORDEN DESCENDENTE
        }
    }
}
