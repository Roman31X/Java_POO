package Lambdas;

import java.util.*;
import java.util.concurrent.atomic.AtomicInteger;

public class LambdaArrayList {
    
    public static void main(String[] args) {
        List<String> fechas = new ArrayList<String>();
        fechas.add("Lunes");

        for(int i=1;i<=10;i++){
            fechas.add("Elemento :"+i);
        }

        //IMPLEMENTACIÓN DE FUNCIÓN DE INCREMENTO
        //DENTRO DE ESTA FUNCIÓN SE PUEDE DELIMITAR EL NUMERO DESDE DONDE
        //SE EMPEZARA A INCREMENTAR EL CONTADOR
        AtomicInteger contador = new AtomicInteger(1);

        //RECORRER EL ARRAYLIST CON FUNCIÓN LAMBDA
        fechas.forEach(dia -> System.out.println(dia+ " : "+contador.getAndIncrement()));
    }
}
