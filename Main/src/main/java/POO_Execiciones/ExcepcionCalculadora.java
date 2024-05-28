package POO_Execiciones;

import javax.swing.*;

public class ExcepcionCalculadora {
    public static void main(String[] args) {

        calculadora calculadora1 = new calculadora();

        String valor = JOptionPane.showInputDialog("Ingrese un entero");
        int divisor;
        double division;

        try{

            divisor = Integer.parseInt(valor);
            division = calculadora1.divisor(10,divisor);
            System.out.println("La division es : "+division);

        } catch (DivisionPorZeroException e) {
            System.out.println("Se capturo una excepción de tipo : "+e);
        }
    }
}
