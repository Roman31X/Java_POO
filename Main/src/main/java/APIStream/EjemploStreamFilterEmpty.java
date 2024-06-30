package APIStream;

import APIStream.model.Usuario;

import java.util.Optional;
import java.util.stream.Stream;

public class EjemploStreamFilterEmpty {
    public static void main(String[] args) {
        long count = Stream
                .of("Pedro Castillo","","Martin Vizcarra","Alan Garcia",
                        "")
                .filter(String::isEmpty)
                .peek(System.out::println)
                .count();

        System.out.println("count = " + count);
    }
}
