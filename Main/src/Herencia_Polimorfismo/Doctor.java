package Herencia_Polimorfismo;

public class Doctor extends Usuario{
    //Atributos
    /*int id;
    private String nombre;
    private String ubicacion;
    private String email;
    private String celular;*/
    //Atributo que no se repite
    private String especialidad;
    //CONSTRUCTORES
    public Doctor(String nombre, String email, String especialidad) {
        super(nombre, email);
        this.especialidad = especialidad;
        //MENSAJE CON MÉTODO QUE CAPTURA VARIABLES Y RETORNA MENSAJE
        System.out.println(DatDoc(nombre,email,especialidad));
    }
    //metodo [getter - setter]
    public String getEspecialidad() {
        return especialidad;
    }
    public void setEspecialidad(String especialidad) {
        this.especialidad = especialidad;
    }
    /**
     * Método que mostrar los datos del
     * DOCTOR*/
    public static String DatDoc(String nombre,String email,String especialidad){
        return  "||================DOCTOR================||\n"+
                "|| El nombre del doctor es: ["+nombre+"]\n"+
                "|| El email es: ["+email+"]\n"+
                "|| Su especialidad es: ["+especialidad+"]\n"+
                "||=======================================||";
    }
    //Concatenar los datos de la clase padre [USUARIO] para unirlo
    //con los datos de la clase hija [DOCTOR] para dar un solo
    //mensaje con el objeto en la clase principal [PRINCIPAL]
    //APLICANDO EL MÉTODO [toString()]

    @Override
    public String toString() {
        return super.toString()+"\n"+
                "|| Su especialidad es: ["+especialidad+"]\n"+
                "||=======================================||";
    }
}
