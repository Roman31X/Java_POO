package Contructor;

public class Persona {
    int edad;
    String nombre;
    String Apellido;
    String sexo;
    //CREACIÓN DE CONSTRUCTOR

    public void datos(){
        System.out.println("Los datos del persona son:\n" +
                "Su edad es ["+edad+"]\n"+
                "Su nombre es: ["+nombre+"]"+
                "Su apellido es: ["+Apellido+"]\n"+
                "Su Sexo es: ["+sexo+"]");
    }
}
