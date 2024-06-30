package APIStream;

import APIStream.model.Usuario;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class EjemploOperadorFilter {
    public static void main(String[] args) {
        Stream<Usuario> nombres = Stream
                .of("Pedro Castillo","Dina Boularte","Martin Vizcarra","Alan Garcia",
                        "Alan Cueva")
                .map(nombre -> new Usuario(nombre.split(" ")[0],nombre.split(" ")[1]))
                .filter(u -> u.getNombre().equals("Alan"))
                .peek(System.out::println);
        //nombres.forEach(System.out::println);

        List<Usuario> lista = nombres.collect(Collectors.toList());
        lista.forEach(System.out::println);
    }
}
