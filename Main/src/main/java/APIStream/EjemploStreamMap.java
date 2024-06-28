package APIStream;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class EjemploStreamMap {
    public static void main(String[] args) {


        Stream<String> nombres = Stream
                .of("Pedro","Dina","Martin","Alan")
                .map(String::toUpperCase)
                .peek(System.out::println)
                .map(String::toLowerCase);
        //nombres.forEach(System.out::println);

        List<String> lista = nombres.collect(Collectors.toList());
        lista.forEach(System.out::println);



    }
}
