package POO_Execiciones;

public class calculadora {
    public double divisor(int numerador, int divisor) throws DivisionPorZeroException{

        if(divisor == 0){
            throw new DivisionPorZeroException("no se puede dividir por cero!");
        }

        return numerador/(double)divisor;
    }
    public double dividir(String numerador, String divisor)
            throws DivisionPorZeroException,FormatoNumeroException {
        try {
            int num = Integer.parseInt(numerador);
            int div = Integer.parseInt(divisor);
            return this.divisor(num,div);
        }catch (NumberFormatException e){
            throw new FormatoNumeroException("debe ingresar un número en el numerador y divisor");
        }
    }
}
