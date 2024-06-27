package APIStream;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class EjemploStream {
    public static void main(String[] args) {


        Stream<String> nombres = Stream.of("Pedro","Dina","Martin","Alan");
        nombres.forEach(System.out::println);
        System.out.println();

        String[] arreglo = {"Pedro","Dina","Martin","Alan"};
        Stream<String> nombres2 = Arrays.stream(arreglo);
        nombres2.forEach(System.out::println);
        System.out.println();

        Stream<String> nombres3 = Stream.<String>builder()
                .add("Pedro")
                .add("Dina")
                .add("Martin")
                .add("Alan")
                .build();
        nombres3.forEach(System.out::println);
        System.out.println();

        List<String> lista = new ArrayList<>();
        lista.add("Pedro");
        lista.add("Dina");
        lista.add("Martin");
        lista.add("Alan");
        Stream<String> nombres4 = lista.stream();
        nombres4.forEach(System.out::println);
        System.out.println();

        lista.stream().forEach(System.out::println);

    }
}
