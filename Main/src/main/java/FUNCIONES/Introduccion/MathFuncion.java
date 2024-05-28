package FUNCIONES.Introduccion;

import java.util.function.Function;
import java.util.function.Predicate;

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
        System.out.println(square.apply(25));
        System.out.println(cuadrado(5));

        //FUNCIÓN MUCHA MAS CORTA
        Function<Integer,Boolean> impar = x -> x % 2 == 1;

        Predicate<Integer> incluso = x -> x % 2 == 0;

        incluso.test(4);

        Predicate<Estudiante> estudiante =  estudiante1 -> estudiante1.getCalificacion() >= 6.0;

        Estudiante estudanite2 = new Estudiante(5.9);
        System.out.println(estudiante.test(estudanite2));
    }

    //Función estatica externa
    static int cuadrado(int x){
        return x * x;
    }

    static class Estudiante{
        private double calificacion;

        public Estudiante(double calificacion) {
            this.calificacion = calificacion;
        }

        public double getCalificacion(){
            return calificacion;
        }

        @Override
        public String toString() {
            return "Estudiante{" +
                    "calificacion=" + calificacion;
        }
    }
}
