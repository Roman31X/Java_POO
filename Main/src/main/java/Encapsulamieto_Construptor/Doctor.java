package Encapsulamieto_Construptor;

public class Doctor {
    //Declaramos variables
    //[Encapsulamos] con el prefijo [private]
    private String cod;
    private String nombre;
    private String especialidad;
    //encapsula la dos variables solo a nivel clase
    private double peso = 0;
    private double altura = 0;
    //IMPLEMENTAMOS UN CONSTRUCTOR

    /**
     * Constructor que captura los datos enviados
     * por el objeto en la clase main principal
     * */
    //METODO CONSTRUCTOR SE ENCARGA DE DEFINIR
    Doctor(String cod,String nombre,String especialidad) {
        System.out.println("El código es: ["+cod+"]\n"+
                "El nombre es: ["+nombre+"]\n"+
                "La especialidad es: ["+especialidad+"]");
    }
    //Agregamos métodos Getter and Setter
    //ESTOS MéTODOS SE ENCARGAN DE VALIDAD
    //[Setter - set]: se encarga de asignar un valor al campo o atributo
    //[Getter - get]: se encarga de recuperar el valor del campo o atributo

    public String getCod() {
        return cod;
    }
    public void setCod(String cod) {
        this.cod = cod;
    }
    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public String getEspecialidad() {
        return especialidad;
    }
    public void setEspecialidad(String especialidad) {
        this.especialidad = especialidad;
    }
    public double getPeso() {
        return peso;
    }
    public void setPeso(double peso) {
        this.peso = peso;
    }
    public double getAltura() {
        return altura;
    }
    public void setAltura(double altura) {
        this.altura = altura;
    }

    //esta clase solo va a imprimir el mensaje y la variable
    public void Nombre() {
        System.out.println(nombre);
    }

}
