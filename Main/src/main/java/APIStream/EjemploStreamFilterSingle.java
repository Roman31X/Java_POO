package APIStream;

import APIStream.model.Usuario;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class EjemploStreamFilterSingle {
    public static void main(String[] args) {
        Stream<Usuario> nombres = Stream
                .of("Pedro Castillo","Dina Boularte","Martin Vizcarra","Alan Garcia",
                        "Alan Cueva")
                .map(nombre -> new Usuario(nombre.split(" ")[0],nombre.split(" ")[1]))
                .filter(u -> u.getNombre().equals("Alpn"))
                .peek(System.out::println);
        //nombres.forEach(System.out::println);

        Optional<Usuario> usuario = nombres.findFirst();
        //System.out.println(usuario.orElse(new Usuario("Susy","Gala")).getNombre());
        //System.out.println(usuario.orElseGet(() -> new Usuario("Susy","Gala")).getNombre());

        if(usuario.isPresent()){
            System.out.println(usuario.get().getNombre());
        }else{
            System.out.println("No se encontró el Objeto");
        }
    }
}
