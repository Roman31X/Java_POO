package APIStream;

import APIStream.model.Usuario;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class EjemploOperadorFilterSingle {
    public static void main(String[] args) {
        Usuario usuario = Stream
                .of("Pedro Castillo","Dina Boularte","Martin Vizcarra","Alan Garcia",
                        "Alan Cueva")
                .map(nombre -> new Usuario(nombre.split(" ")[0],nombre.split(" ")[1]))
                .filter(u -> u.getId().equals(3))
                .findFirst().get();

        System.out.println(usuario);
    }
}
