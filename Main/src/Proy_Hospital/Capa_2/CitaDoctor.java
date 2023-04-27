package Proy_Hospital.Capa_2;

import java.util.Date;

public class CitaDoctor implements Programacion{
    //Atributos encapsulados
    private int id;
    private Paciente paci;
    private Doctor doct;
    private Date date;
    private String fecha;
    //creamos los métodos getter y setter para acceso
    public int getId() {        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public Paciente getPaci() {
        return paci;
    }
    public void setPaci(Paciente paci) {
        this.paci = paci;
    }
    public Doctor getDoct() {
        return doct;
    }
    public void setDoct(Doctor doct) {
        this.doct = doct;
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
