package APIStream;

import java.util.stream.Stream;

public class EjemploStreamReduceInt {
    public static void main(String[] args) {
        Stream<Integer> nombres = Stream.of(5,10,15,20);
        
        int resultadoFinal = nombres.reduce(0,Integer::sum);
        System.out.println(resultadoFinal);
    }
}
