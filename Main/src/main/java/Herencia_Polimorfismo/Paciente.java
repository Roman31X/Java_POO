package Herencia_Polimorfismo;

public class Paciente extends Usuario{
    //Atributos
    /*int id;
    private String nombre;
    private String ubicacion;
    private String email;
    private String celular;*/
    //Atributos que no se repiten
    private String fecha;
    private double talla;
    private double peso;
    private String enfermedad;
    //CONSTRUCTORES
    public Paciente(String nombre, String email, String fecha, double talla, double peso, String enfermedad) {
        super(nombre, email);
        this.fecha = fecha;
        this.talla = talla;
        this.peso = peso;
        this.enfermedad = enfermedad;
        //MENSAJE CON MÉTODO QUE CAPTURA VARIABLES Y RETORNA MENSAJE
        System.out.println(DatPaci(nombre,email,fecha,talla,peso,enfermedad));
    }
    //metodo [getter - setter]
    public String getFecha() {
        return fecha;
    }
    public void setFecha(String fecha) {
        this.fecha = fecha;
    }
    public double getTalla() {
        return talla;
    }
    public void setTalla(double talla) {
        this.talla = talla;
    }
    public double getPeso() {
        return peso;
    }
    public void setPeso(double peso) {
        this.peso = peso;
    }
    public String getEnfermedad() {
        return enfermedad;
    }
    public void setEnfermedad(String enfermedad) {
        this.enfermedad = enfermedad;
    }
    /**
     * Método que mostrar los datos del
     * DOCTOR*/
    public static String DatPaci(String nombre,String email,String fecha,double talla,double peso,String enfermedad){
        return  "||================PACIENTE================||\n"+
                "|| El nombre del Paciente es: ["+nombre+"]\n"+
                "|| El email es: ["+email+"]\n"+
                "|| La fecha de nacimiento: ["+fecha+"]\n"+
                "|| La talla es : ["+talla+" m ]\n"+
                "|| El peso es de: ["+peso+" Kg ]\n"+
                "|| La enfermedad es: ["+enfermedad+"]\n"+
                "||=======================================||";
    }
    //Concatenar los datos de la clase padre [USUARIO] para unirlo
    //con los datos de la clase hija [PACIENTE] para dar un solo
    //mensaje con el objeto en la clase principal [PRINCIPAL]
    //APLICANDO EL MÉTODO [toString()]

    @Override
    public String toString() {
        return super.toString()+"\n"+
                "|| La fecha de nacimiento: ["+fecha+"]\n"+
                "|| La talla es : ["+talla+" m ]\n"+
                "|| El peso es de: ["+peso+" Kg ]\n"+
                "|| La enfermedad es: ["+enfermedad+"]\n"+
                "||=======================================||";
    }
}
