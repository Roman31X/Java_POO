package FundamentosPOO.sobrecarga;

public class ejemploSobrecargaMetodos {
    public static void main(String[] args) {
        Calculadora calcular = new Calculadora();
        System.out.println("Sumar dos números enteros : "+calcular.sumar(5,5));
        System.out.println("Sumar un números double y un entero : "+calcular.sumar(5.0,5));
        System.out.println("Sumar dos números pasados como caracter : "+calcular.sumar("5","5"));
        System.out.println("Suma tres argumentos de distintos tipos : "+calcular.sumar(5,5.0,"5"));

        System.out.println("|++++++++++++++++++++++++++++++|");
        System.out.println("Suma de mas de tres argumentos del mismo tipo : "+calcular.sumar(5,10,15,20,25,30));
    }
}
