package Lambdas.Modulo2;

import Lambdas.Modulo2.Modelo.Usuario;

import java.util.function.BiPredicate;
import java.util.function.Predicate;

public class EjemploPredicate {

    public static void main(String[] args) {

        /**
         * Siempre retorna un valor boolean*/
        Predicate<Integer> test = num -> num > 10;
        boolean r = test.test(11);
        boolean p = test.test(9);
        System.out.println("r es mayor que 10 = "+r);
        System.out.println("p es mayor que 10 = "+p);

        Predicate<String> t2 = role -> role.equals("ROLE_ADMIN");
        System.out.println("Es administrador: "+t2.test("ROLE_ADMIN"));

        BiPredicate<String,String> test3 = String::equals;
        System.out.println("Los nombres son iguales: "+test3.test("Pedro","Pedro"));

        BiPredicate<Integer,Integer> test4 = (i, j) -> j > i;
        boolean respuesta = test4.test(5,10);
        System.out.println("i es mayor que j: "+respuesta);

        Usuario a = new Usuario();
        Usuario b = new Usuario();
        a.setNombre("Pedro");
        b.setNombre("Dina");
        BiPredicate<Usuario,Usuario> test5 = (va,vb) -> va.getNombre().equals(vb.getNombre());
        System.out.println("Los nombres de los usuarios es igual: "+test5.test(a,b));


    }
}
