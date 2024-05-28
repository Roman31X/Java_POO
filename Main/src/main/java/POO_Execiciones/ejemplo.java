package POO_Execiciones;


import javax.swing.*;

public class ejemplo {

    public static void main(String[] args) {
        calculadora cal = new calculadora();
        //String cadena = JOptionPane.showInputDialog("Ingrese un entero");

        String numerador = JOptionPane.showInputDialog("Ingrese un entero par el numerador");
        String denominador = JOptionPane.showInputDialog("Ingrese un entero para el divisor");

        int divisor;
        double division;
        try{
            /*divisor = Integer.parseInt(cadena);
            division = cal.divisor(10,divisor);
            System.out.println(division);*/

            double division2 = cal.dividir(numerador,denominador);
            System.out.println("Division N°2 : "+division2);
        } catch (NumberFormatException num){
            System.out.println("Se detecto una excepción de tipo : "+num.getMessage());
            main(args); //volvemos a la ejecución hasta se solucione el error
        } catch (ArithmeticException ae) {
            System.out.println("Se capturo una excepción de tipo :" + ae.getMessage());
            main(args);
        } catch (FormatoNumeroException e){
            System.out.println("Se detecto una excepcion: ingrese un número valido: "+e.getMessage());
            e.printStackTrace(System.out);//imprime mensaje en la consola
        } catch (Exception e){
            System.out.println("Se capturo una excepción de tipo : " + e);
        }finally {
            System.out.println("Este es un mensaje dentro de finally");
        }
        System.out.println("Seguimos con la ejecución de la clase aun se halla encontrado un error");

    }
}
