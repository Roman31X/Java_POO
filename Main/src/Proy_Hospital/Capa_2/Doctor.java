package Proy_Hospital.Capa_2;
import java.util.*;
public class Doctor extends Usuario{
    //Atributos encapsulados
    private String especialidad;
    //constructor
    public Doctor(String nombre, String emai, String especialidad) {
        super(nombre, emai);
        this.especialidad = especialidad;
    }
    //método getter y setter
    public String getEspecialidad() {
        return especialidad;
    }
    public void setEspecialidad(String especialidad) {
        this.especialidad = especialidad;
    }

}
