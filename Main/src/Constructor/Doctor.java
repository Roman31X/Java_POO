package Constructor;

public class Doctor {
    //Declaramos variables
    String cod;
    String nombre;
    String especialidad;
    //IMPLEMENTAMOS UN CONSTRUCTOR

    /**
     * Constructor que captura los datos enviados
     * por el objeto en la clase main principal
     * */
    Doctor(String cod,String nombre,String especialidad) {
        System.out.println("El código es: ["+cod+"]\n"+
                "El nombre es: ["+nombre+"]\n"+
                "La especialidad es: ["+especialidad+"]");
    }

    //esta clase solo va a imprimir el mensaje y la variable
    public void Nombre() {
        System.out.println(nombre);
    }

}
