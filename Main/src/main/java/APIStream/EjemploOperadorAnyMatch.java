package APIStream;

import APIStream.model.Usuario;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class EjemploOperadorAnyMatch {
    public static void main(String[] args) {
        boolean existe = Stream
                .of("Pedro Castillo","Dina Boularte","Martin Vizcarra","Alan Garcia",
                        "Alan Cueva")
                .map(nombre -> new Usuario(nombre.split(" ")[0],nombre.split(" ")[1]))
                .peek(System.out::println)
                .anyMatch(u -> u.getId().equals(3));

        System.out.println(existe);

        /*List<Usuario> lista =  Arrays.asList(
                new Usuario("Pedro"," Castillo"),
                new Usuario("Dina","Boularte"),
                new Usuario("Martin","Vizcarra"),
                new Usuario("Alan", "Garcia"),
                new Usuario("Alan", "Cueva"));

        boolean resultado = false;
        for (Usuario u : lista) {
            if(u.getId().equals(3)){
                resultado = true;
                break;
            }
        }

        System.out.println(resultado);*/

    }
}
