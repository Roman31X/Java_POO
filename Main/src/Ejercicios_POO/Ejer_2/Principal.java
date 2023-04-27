package Ejercicios_POO.Ejer_2;
import java.util.*;
/*
* ENUNCIADO
* Construir un programa para una
* competencia de atletismo, el programa debe
* gestionar una serie de atletas caracterizados por
* su número de atleta, nombre y tiempo de
* carrera, al final el programa debe mostrar los
* datos del atleta ganador de la carrera.*
* */
public class Principal {
    public static void main(String[] args) {
        //importamos la clase Scanner
        Scanner sc = new Scanner(System.in);
        //Atributos del corredor
        int numero, cantidad, ganador;
        String nombre;
        double tiempo;
        //solicitamos la cantidad de corredores
        System.out.print("Ingrese cantidad de corredores => ");
        cantidad = sc.nextInt();
        //Creamos un arreglo con la cantidad de corredores
        Corredor cor [] = new Corredor[cantidad];
        //Creamos un bucle que nos datos de corredor por cantidad aignada
        for (int i = 0; i < cor.length; i++) {
            //Registramos a los corredores
            System.out.println("||====CORREDOR ["+(i+1)+"]=======||");
            System.out.print("Ingrese numero del corredor => ");
            numero = sc.nextInt();
            sc.nextLine();
            System.out.print("Ingres nombre del corredor => ");
            nombre = sc.nextLine();
            System.out.print("Ingrese tiempo del corredor => ");
            tiempo = sc.nextDouble();
            cor[i] = new Corredor(numero,nombre,tiempo);
        }
        //capturamos la posición del corredor ganador
        ganador = IndiCorredor(cor);
        //Una vez obtenido el tiempo más corto lo
        //captura con los datos del corredor
        System.out.println("||========CORREDOR GANADOR ES============||");
        System.out.println(cor[ganador].toString());
    }
    //Método que comparar para obtener el menor tiempo para el ganador
    public static int IndiCorredor(Corredor cor[]){
        //atributo que capture menor tiempo y posición
        int posicion = 0;
        double tiempo = 0;
        //Capturamos el menor tiempo
        tiempo = cor[0].getTiempo();
        //Bucle para evaluar al menor tiempo
        for (int i = 0; i < cor.length; i++) {
            //condición para evaluar
            if(cor[i].getTiempo() < tiempo){
                // de ser verdad se captura el menor tiempo
                tiempo = cor[i].getTiempo(); //se captura el nuevo menor tiempo
                posicion = i; //capturar la posición
            }
        }
        return posicion;
    }
}
