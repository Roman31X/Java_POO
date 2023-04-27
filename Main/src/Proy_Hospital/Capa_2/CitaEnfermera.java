package Proy_Hospital.Capa_2;
import java.util.*;
//el atributo [implements] me permite
//implementar multiple veces una interfas
public class CitaEnfermera implements Programacion{
    //Atributos
    private int id;
    private Enfermera enfer;
    private Paciente paci;
    private Date date;
    private String fecha;
    //método getter y setter
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public Enfermera getEnfer() {
        return enfer;
    }
    public void setEnfer(Enfermera enfer) {
        this.enfer = enfer;
    }
    public Paciente getPaci() {
        return paci;
    }
    public void setPaci(Paciente paci) {
        this.paci = paci;
    }
    public Date getDate() {
        return date;
    }
    public void setDate(Date date) {
        this.date = date;
    }
    public String getFecha() {
        return fecha;
    }
    public void setFecha(String fecha) {
        this.fecha = fecha;
    }
    //Al implementar llamamos a su método de la interfas
    //Programación
    @Override
    public void Programacion(Date date, String fecha) {

    }
}
