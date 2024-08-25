package APIStream;

import APIStream.model.Usuario;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class EjemploStreamMapUsuario {
    public static void main(String[] args) {


        Stream<Usuario> nombres = Stream
                .of("Pedro Castillo","Dina Boularte","Martin Vizcarra","Alan Garcia")
                .map(nombre -> new Usuario(nombre.split(" ")[0],nombre.split(" ")[1]))
                .peek(System.out::println)
                .map(usuario -> {
                    String nombre = usuario.getNombre().toUpperCase();
                    usuario.setNombre(nombre);
                    return usuario;
                });
        //nombres.forEach(System.out::println);

        List<Usuario> lista = nombres.collect(Collectors.toList());
        lista.forEach(System.out::println);



    }
}
