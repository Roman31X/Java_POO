package Proy_Hospital.Capa_2;

public class Enfermera extends Usuario{
    //atributo
    private String especialidad;
    //constructor
    public Enfermera(String nombre, String emai, String especialidad) {
        super(nombre, emai);
        this.especialidad = especialidad;
    }
    //getter y setter
    public String getEspecialidad() {
        return especialidad;
    }
    public void setEspecialidad(String especialidad) {
        this.especialidad = especialidad;
    }

}
