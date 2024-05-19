package Lambdas.Modulo1;

public class Main {
    public static void main(String[] args) {
        PrimeraFuncion primera = new PrimeraFuncion() {
            @Override
            public void Primero(String mensaje) {
                System.out.println("Primero : "+mensaje);
            }
        };

        PrimeraFuncion segunda = (String mensaje) ->{
            System.out.println("Primer mensaje Lambda : "+mensaje);
        };

        primera.Primero("Sin LAMBDA 0<[:v");
        segunda.Primero("Ahora con LAMBDA [:v]");
    }
}
