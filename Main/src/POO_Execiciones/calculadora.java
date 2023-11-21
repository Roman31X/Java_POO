package POO_Execiciones;

public class calculadora {
    public double divisor(int numerador, int divisor) throws DivisionPorZeroException{

        if(divisor == 0){
            throw new DivisionPorZeroException("no se puede dividir por cero!");
        }

        return numerador/(double)divisor;
    }
}
