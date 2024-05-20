package Lambdas.Modulo2;

import Lambdas.Modulo2.Modelo.Usuario;

import java.util.function.BiConsumer;
import java.util.function.Supplier;

public class EjemploSupplier {
    public static void main(String[] args) {

        /**Esta expresión lambda no recibe ningún argumento
         * pero siempre devuelve un valor por eso es considerado proveedor*/

        Supplier<String> proveedor = () ->{
            return "Hola mundo";
        };

        //LAMBDA SIMPLIFICADO
        Supplier<String> proveedor2 = () ->"Hola mundo";

        System.out.println(proveedor.get());
        System.out.println(proveedor2.get());

        /**Expresión Supplier para creación de objetos*/
        Supplier<Usuario> nuevoUsuario = () -> new Usuario();

        //SIMPLIFICADA
        Supplier<Usuario> nuevoUsuario2 = Usuario::new;

        Usuario usuario = nuevoUsuario.get();
        Usuario usuario2 = nuevoUsuario.get();

        /**Implementación de Lambdas simplificada con objetos*/
        BiConsumer<Usuario, String> asignarNombre = Usuario::setNombre;

        asignarNombre.accept(usuario,"Diego");
        asignarNombre.accept(usuario2,"Pedro");

        System.out.println("Su nombre de este usuario es: "+ usuario.getNombre());
        System.out.println("Su nombre de este usuario es: "+ usuario2.getNombre());

    }
}
