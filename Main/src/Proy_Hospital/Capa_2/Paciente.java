package Proy_Hospital.Capa_2;

public class Paciente extends Usuario{
    //Atributos del paciente
    private double talla;
    private double peso;
    private String sintomas;
    //constructor
    public Paciente(String nombre, String emai) {
        super(nombre, emai);
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

    @Override
    public void Trabajador() {
        System.out.println("||=======ES PACIENTE=======||");
        System.out.println("||  Historial del paciente ||");
        System.out.println("||  Tipo de tratamiento    ||");
    }
}
