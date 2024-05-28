package Proy_Hospital.Capa_2;

import Proy_Hospital.Capa_1.MenuDoctor;
import java.util.*;

public class Paciente extends Usuario{
    //Atributos del paciente
    private double talla;
    private double peso;
    private String sintomas;
    //arraylist para las citas del paciente
    private ArrayList<CitaDoctor> citadoctor = new ArrayList<>();
    private ArrayList<CitaEnfermera> citaenfermera = new ArrayList<>();
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
    //geter y setter de los arraylist
    public ArrayList<CitaDoctor> getCitadoctor() {
        return citadoctor;
    }
    public void addCitadoctor(Doctor doctor,String fecha,String hora) {
        CitaDoctor citadoc = new CitaDoctor(this,doctor);
        citadoc.Programacion(fecha,hora);
        citadoctor.add(citadoc);
    }
    public ArrayList<CitaEnfermera> getCitaenfermera() {
        return citaenfermera;
    }
    public void setCitaenfermera(ArrayList<CitaEnfermera> citaenfermera) {
        this.citaenfermera = citaenfermera;
    }
    @Override
    public void Trabajador() {
        System.out.println("||=======ES PACIENTE=======||");
        System.out.println("||  Historial del paciente ||");
        System.out.println("||  Tipo de tratamiento    ||");
    }
}
