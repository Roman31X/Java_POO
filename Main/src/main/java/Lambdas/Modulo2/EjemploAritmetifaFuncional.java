package Lambdas.Modulo2;

import Lambdas.Modulo2.Aritmetica.Aritmetica;
import Lambdas.Modulo2.Aritmetica.Calculadora;

public class EjemploAritmetifaFuncional {
    public static void main(String[] args) {

        Aritmetica suma = Double::sum;
        Aritmetica resta = (a, b) -> a - b;

        Calculadora cal = new Calculadora();

        System.out.println(cal.computar(10,5,suma));
        System.out.println(cal.computar(10,5,resta));
        System.out.println(cal.computar(10,5,(a,b) -> a * b));

        System.out.println(cal.computarConBiFunction(10,5,(a,b)-> a + b));

    }
}
