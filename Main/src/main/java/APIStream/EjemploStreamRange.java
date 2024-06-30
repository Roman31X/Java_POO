package APIStream;

import java.util.IntSummaryStatistics;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class EjemploStreamRange {
    public static void main(String[] args) {
        IntStream numeros = IntStream.range(5,10)
                .peek(System.out::println);
        
        //int resultadoFinal = numeros.reduce(0,Integer::sum);
        //int resultadoFinal = numeros.sum();
        //System.out.println(resultadoFinal);

        IntSummaryStatistics estadistica = numeros.summaryStatistics();
        System.out.println("Maximo: "+estadistica.getMax());
        System.out.println("Minimo: "+estadistica.getMin());
        System.out.println("Suma: "+estadistica.getSum());
        System.out.println("Promedio: "+estadistica.getAverage());
        System.out.println("Total: "+estadistica.getCount());
    }
}
