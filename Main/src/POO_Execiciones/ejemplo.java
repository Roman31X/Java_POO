package POO_Execiciones;

import javax.swing.*;

public class ejemplo {

    public static void main(String[] args) {

        String cadena = JOptionPane.showInputDialog("Ingrese un entero");
        int divisor;
        try{
            divisor = Integer.parseInt(cadena);
            int division = 10/divisor;
            System.out.println(division);
        } catch (NumberFormatException num){
            System.out.println("Se detecto una excepción de tipo : "+num.getMessage());
            main(args); //volvemos a la ejecución hasta se solucione el error
        } catch (ArithmeticException ae){
            System.out.println("Se capturo una excepción de tipo :" + ae.getMessage());
            main(args);
        } catch (Exception e){
            System.out.println("Se capturo una excepción de tipo : " + e);
        }finally {
            System.out.println("Este es un mensaje dentro de finally");
        }
        System.out.println("Seguimos con la ejecución de la clase aun se halla encontrado un error");


    }
}
