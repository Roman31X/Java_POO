package APIStream;

import APIStream.model.Usuario;

import java.util.Optional;
import java.util.stream.Stream;

public class EjemploStreamDistinct {
    public static void main(String[] args) {
        Stream<String> nombres = Stream.of("Pedro Castillo","Dina Boularte","Martin Vizcarra","Alan Garcia",
                        "Dina Boularte","Dina Boularte")
                .distinct();

        nombres.forEach(System.out::println);
    }
}
