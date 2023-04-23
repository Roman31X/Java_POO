package Herencia_Polimorfismo;

public class Usuario {
    //Atributos
    private int id;
    private String nombre;
    private String email;
    private String ubicacion;
    private String celular;
    //Constructor de USUARIO
    public Usuario(String nombre, String email) {
        this.nombre = nombre;
        this.email = email;
    }
    //metodo [getter - setter]
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public String getEmail() {
        return email;
    }
    public void setEmail(String email) {
        this.email = email;
    }
    public String getUbicacion() {
        return ubicacion;
    }
    public void setUbicacion(String ubicacion) {
        this.ubicacion = ubicacion;
    }
    public String getCelular() {
        return celular;
    }
    public void setCelular(String celular) {
        this.celular = celular;
    }

    //APLICANDO EL MÉTODO [toString()] en la clase padre [USUARIO]
    //se dara como un segmento del mensaje de las clases hijas [DOCTOR - USUARIO]
    //para dar un solo mensaje con el objeto en la clase principal [PRINCIPAL]


    @Override
    public String toString() {
        return "||================USUARIO================||\n"+
               "|| El nombre es: ["+nombre+"]\n"+
               "|| El email es: ["+email+"]\n"+
               "|| Su ubicación es: ["+ubicacion+"]\n"+
               "|| Su numero de celular es: ["+celular+"]";
    }
}
