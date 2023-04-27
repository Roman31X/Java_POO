package Proy_Hospital.Capa_2;

//La clase padre se denominara como Abstracto
public abstract class  Usuario {
    //Declarar atributos a heredar a heredar a las clases hijas
    private String nombre;
    private String emai;
    private String celular;
    //Constructor del padre
    public Usuario(String nombre, String emai) {
        this.nombre = nombre;
        this.emai = emai;
    }
    //métodos getter y setter
    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public String getEmai() {
        return emai;
    }
    public void setEmai(String emai) {
        this.emai = emai;
    }
    public String getCelular() {
        return celular;
    }
    public void setCelular(String celular) {
        this.celular = celular;
    }

}
