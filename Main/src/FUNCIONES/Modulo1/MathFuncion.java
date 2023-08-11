package FUNCIONES.Modulo1;

import java.util.function.Function;

public class MathFuncion {
    public static void main(String[] args) {
        Function<Integer, Integer> square =
            new Function<Integer, Integer>() {
            @Override
            public Integer apply(Integer x) {
                return x * x;
            }
        };
        System.out.println(square.apply(5));
        System.out.println(square.apply(3));
        System.out.println(cuadrado(5));
    }
    static int cuadrado(int x){
        return x * x;
    }
}
