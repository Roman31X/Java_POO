package Proy_Hospital.Capa_2;
import java.util.*;
public class Doctor extends Usuario{
    //Atributos encapsulados
    private String especialidad;
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
