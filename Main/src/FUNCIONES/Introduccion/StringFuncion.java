package FUNCIONES.Introduccion;

import java.util.function.BiFunction;
import java.util.function.BinaryOperator;
import java.util.function.UnaryOperator;

public class StringFuncion {
    public static void main(String[] args) {
        //CON ESTA FUNCION NOS PERMITE AGREGAR CARACTERES A NUESTRAS MUESTRAS
        //POR CONSOLA SIEMPRE Y CUANDO PASEMOS UNA CADENA POR EL OBJETO DE LA CLASE
        UnaryOperator<String> cita = text -> "\"" + text + "\"";
        UnaryOperator<String> cita2 = text -> text + "!";


        System.out.println(cita.apply("Hola programador desde Java"));
        System.out.println(cita2.apply("Hola esta es una cita :o "));

        //Función para agregar espacio a un string y formateando la cadena con un
        //nuevo formato asignado por la función
        BiFunction<String,Integer,String> textLargo = (text,number) -> String.format("%"+number+"s",text);
        //Mandamos como parametros la palabra y los espacios por lo tanto
        //todo el espacio es de 10 caracteres por lo que al inicio nos debe de
        //dejar solo 6 espacios ya que la palabra es de 4 caracteres
        System.out.println(textLargo.apply("Hola",10));

        //ESTA FUNCION RECIBE DOS ARGUMENTOS DEL MISMO TIPO Y NOS RETORNARA
        //UN RESULTADO
        BinaryOperator<Integer> multiplicar = (x,y) -> x * y;


    }
}
