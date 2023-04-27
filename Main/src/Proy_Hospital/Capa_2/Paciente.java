package Proy_Hospital.Capa_2;

public class Paciente extends Usuario{
    //Atributos del paciente
    private double talla;
    private double peso;
    private String sintomas;
    //constructor
    public Paciente(String nombre, String emai, double talla, double peso, String sintomas) {
        super(nombre, emai);
        this.talla = talla;
        this.peso = peso;
        this.sintomas = sintomas;
    }
    //método getter y setter
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
    public String getSintomas() {
        return sintomas;
    }
    public void setSintomas(String sintomas) {
        this.sintomas = sintomas;
    }

}
