package FundamentosPOO.sobrecarga;

public class Calculadora {

    public int sumar(int a, int b){
        return a + b;
    }
    public double sumar(double a, double b){
        return a + b;
    }
    public int sumar(String a, String b){
        return Integer.parseInt(a) + Integer.parseInt(b);
    }
    public double sumar(int a,double b,String c){
        return a + b + Integer.parseInt(c);
    }

    //SOBRECARGA TIPO VARIBALE
    public int sumar(int... argumentos){
        int total = 0;
        for(int i : argumentos){
            total+= i;
        }
        return total;
    }

    public String suma(String...){
        String saludo = "";
        for(String i : argumentos){
            saludo += i;
        }
        return saludo;
    }
}
