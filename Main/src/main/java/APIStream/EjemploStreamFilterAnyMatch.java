package APIStream;

import APIStream.model.Usuario;

import java.util.stream.Stream;

public class EjemploStreamFilterAnyMatch {
    public static void main(String[] args) {
        long count = Stream
                .of("Pedro Castillo","Dina Boularte","Martin Vizcarra","Alan Garcia",
                        "Alan Cueva")
                .map(nombre -> new Usuario(nombre.split(" ")[0],nombre.split(" ")[1]))
                .peek(System.out::println)
                .count();

        System.out.println(count);

    }
}
