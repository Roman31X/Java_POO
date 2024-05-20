package Lambdas.Modulo2;

import java.util.function.BiFunction;
import java.util.function.Function;

public class EjemploFuntion {
    public static void main(String[] args) {

        /**También recibe argumentos de tipo genéricos
         * para consumirlo y finalmente devuelve un valor
         * Esto quiere decir que podemos recibir un argumento
         * y devolver un resultado esperado como usar un return*/
        //EJEMPLO 1
        Function<String, String> funcion1 = parametro -> "Hola usuario : "+parametro;

        String resultado = funcion1.apply("Diego");
        System.out.println(resultado);

        //EJEMPLO 2
        Function<String, Integer> funcion2 = dia -> {
            int p = 0;
            switch (dia){
                case "Lunes": p = 1;break;
                case "Martes": p = 2;break;
                case "Miercoles": p = 3;break;
                case "Jueves": p = 4;break;
                case "Viernes": p = 5;break;
                case "Sabado": p = 6;break;
                default: p = 7;break;
            }
            return p;
        };

        Integer dia = funcion2.apply("Miercoles");
        System.out.println("Es el "+dia+" dia de la semana");

        //EJEMPLO 3
        Function<String, String> funcion3 = String::toUpperCase;
        String resultado3 = funcion3.apply("diego");
        System.out.println("Nombre en mayuscula : "+resultado3);

        /**Función que nos permite enviar dos argumentos y recibir
         * un resultado esperado*/

        BiFunction<String, String, String> funcion4 = (a, b) -> a.toUpperCase().concat(b.toUpperCase());

        String resultado4 = funcion4.apply("diego","roman");
        System.out.println("Nombre de usuario creado : " +resultado4);

        BiFunction<String, String, Integer> function5 = (a, b) -> a.compareTo(b);
        System.out.println(function5.apply("andres","andres"));

        //SIMPLIFICADO
        BiFunction<String, String, Integer> function6 = String::compareTo;
        System.out.println(function6.apply("andres","andres2"));

        BiFunction<String, String, String> function7 = String::concat;
        System.out.println(function7.apply("diego","roman"));

    }
}
