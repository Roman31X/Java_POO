package Proy_Hospital.Capa_2;

public class Enfermera extends Usuario{
    //atributo
    private String especialidad;
    //constructor
    public Enfermera(String nombre, String emai) {
        super(nombre, emai);
    }
    //getter y setter
    public String getEspecialidad() {
        return especialidad;
    }
    public void setEspecialidad(String especialidad) {
        this.especialidad = especialidad;
    }

    @Override
    public void Trabajador() {
        System.out.println("||===========HOSPITAL==========||");
        System.out.println("||  Hospital   - Trabajador    ||");
        System.out.println("||        Area - Traumatología ||");
        System.out.println("||        Area - Cuidado       ||");
    }
}
