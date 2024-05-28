package Proy_Hospital.Capa_2;

import java.util.ArrayList;
import java.util.Date;

public class CitaDoctor implements Programacion{
    //Atributos encapsulados
    private int id;
    private Paciente paci;
    private Doctor doct;
    private String fecha;
    private String hora;
    //contructor del metodo
    public CitaDoctor(Paciente paci, Doctor doct) {
        this.paci = paci;
        this.doct = doct;
    }
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
    public String getFecha() {
        return fecha;
    }
    public void setFecha(String fecha) {
        this.fecha = fecha;
    }
    public String getHora() {
        return hora + " hrs.";
    }
    public void setHora(String hora) {
        this.hora = hora;
    }
    //Al implementar llamamos a su método de la interfas

    //Programación
    @Override
    public void Programacion(String fecha, String hora) {
        this.fecha = fecha;
        this.hora = hora;
    }
}
