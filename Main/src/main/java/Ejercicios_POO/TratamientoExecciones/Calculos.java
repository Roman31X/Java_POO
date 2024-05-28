package Ejercicios_POO.TratamientoExecciones;

public class Calculos {
    public static void main(String[] args) {
        try {
            // Código que podría generar una excepción
            int dividendo = 10;
            int divisor = 0;
            int resultado = dividendo / divisor;
            System.out.println("El resultado es: " + resultado);
        } catch (ArithmeticException e) {
            // Capturando la excepción específica ArithmeticException
            System.out.println("Error: División por cero.");
        } catch (Exception e) {
            // Capturando cualquier otra excepción
            System.out.println("Error: " + e.getMessage());
        }
    }
}
