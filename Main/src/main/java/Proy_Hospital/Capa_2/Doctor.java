package Proy_Hospital.Capa_2;
import Proy_Hospital.Capa_1.MenuDoctor;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;

public class Doctor extends Usuario{
    //Atributos encapsulados
    private String especialidad;
    private ArrayList<CitasDoctor> Fechas = new ArrayList<>();
    //constructor
    public Doctor(String nombre, String emai) {
        super(nombre, emai);
    }
    //método getter y setter
    public String getEspecialidad() {
        return especialidad;
    }
    public void setEspecialidad(String especialidad) {
        this.especialidad = especialidad;
    }
    //creamos un arraylist
    //método para registrar los datos
    public void AgregarFecha(String fecha,String hora){
        Fechas.add(new CitasDoctor(fecha,hora));
    }
    public ArrayList<CitasDoctor> getFechas() {
        return Fechas;
    }
    public void setFechas(ArrayList<CitasDoctor> fechas) {
        Fechas = fechas;
    }

    //método citas del doctor
    public static class CitasDoctor{
        //atributos propios de la clase CITADOCTOR
        private int id;
        private String date;
        private String time;
        SimpleDateFormat formato = new SimpleDateFormat("dd/MM/yyyy");
        //constructor
        public CitasDoctor(String date, String time) {
            this.date = date;
            this.time = time;
        }
        //getter y setter
        public int getId() {return id;}
        public void setId(int id) {this.id = id;}
        public String getDate() {
            return date;
        }
        public void setDate(String date) {
            this.date = date;
        }
        public String getTime() {
            return time;
        }
        public void setTime(String time) {
            this.time = time;
        }
        public SimpleDateFormat getFormato() {
            return formato;
        }
        public void setFormato(SimpleDateFormat formato) {
            this.formato = formato;
        }

    }
    @Override
    public String toString() {
        return "|| La especialidad es: [" + especialidad + "]\n";
    }

    //metodo toString
    @Override
    public void Trabajador() {
        System.out.println("||=========AREA HOSPITAL===========||");
        System.out.println("||     Hospital   - Trabajador     ||");
        System.out.println("||   Departamento - Operaciones    ||");
        System.out.println("||   Departamento - Nutrición      ||");
    }
}
