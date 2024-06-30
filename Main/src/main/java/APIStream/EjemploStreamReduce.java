package APIStream;

import java.util.stream.Stream;

public class EjemploStreamReduce {
    public static void main(String[] args) {
        Stream<String> nombres = Stream.of("Pedro Castillo","Dina Boularte","Martin Vizcarra","Alan Garcia",
                        "Dina Boularte","Dina Boularte")
                .distinct();
        
        String resultadoFinal = nombres.reduce("resultadoFinal: ",(a,b) -> a+" , "+b);
        System.out.println(resultadoFinal);
    }
}
