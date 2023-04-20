package Contructor;

public class Trabajador {
    //declaramos los datos de un trabajador
    String cod;
    String ocupacion;
    String Fecha;
    int pago;
    public void DATrabajador(){
        System.out.println("Los datos del trabajador son los siguientes:\n"+
                "Su codigo es: ["+cod+"]\n"+
                "Su ocupacion es: ["+ocupacion+"]\n"+
                "Su fecha de ingreso fue en: ["+Fecha+"]\n"+
                "Su salario es de: ["+pago+"]");
    }
}
