package Lambdas.Modulo2;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.List;
import java.util.function.BiConsumer;
import java.util.function.Consumer;

public class EjemploConsumer {
    public static void main(String[] args) {

        /**
         * Esta expresión lambda nos permite pasar una expresión lambda
         * del tipo genérico.
         * Cuando la función únicamente tiene un proceso o función
         * se puede omitir las llaves, pero por buenas prácticas
         * es necesario establecer su contenido
         * También al ser únicamente un solo argumento se puede
         * colocar entre dos paréntesis, pero por buenas prácticas
         * es recomendable para identificarlo
         * Asi mismo, también se puede mencionar el tipo de argumento,
         * pero ya que lo estamos declarando de tipo genérico String
         * no es necesario*/

        /*ejemplo de tipo String*/
        Consumer<String> consumidor = saludo -> System.out.println(saludo);

        /**Simplificar lambda con método de referencia*/
        Consumer<String> consumidorReferencia = System.out::println;

        /*Ejemplo de tipo Date*/
        Consumer<Date> consumidor2 = (Date fecha) -> {
            SimpleDateFormat datos = new SimpleDateFormat("yyyy-MM-dd");
            System.out.println(fecha);
        };

        /**Para la implementación de una funciona lambda se debe
         * de hacer el llamado mediante su objeto consumidor*/

        consumidor.accept("Hola este es mi saludo por lambda");

        //método lambda comprimido
        consumidorReferencia.accept("Hola lambda");

        consumidor2.accept(new Date());

        /**Para la implementación para más de dos tipos de atributos
         * por la expresión usaremos la clase BiConsumer*/

        BiConsumer<String, Integer> consumidor3 = (nombre, edad) -> {
            System.out.println("Mi nombre es: "+nombre);
            System.out.println("Mi edad es: "+edad);
        };

        consumidor3.accept("Diego",24);

        /**Aplicando lambda con list y foreach*/

        List<String> nombres = Arrays.asList("Lucas","Tobias","Diego","Pedro","Miguel");
        nombres.forEach(consumidorReferencia);

    }
}
