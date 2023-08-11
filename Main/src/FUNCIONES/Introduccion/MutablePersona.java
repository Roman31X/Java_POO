package FUNCIONES.Introduccion;

import java.util.List;

/**
 * POJO comun: Incluye propiedades y métodos para acceder y modificar dichas propiedades
 *
 * */

public class MutablePersona {
    private String nombre;
    private String apellido;

    private List<String> emails;

    public MutablePersona() {
    }

    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public String getApellido() {
        return apellido;
    }
    public void setApellido(String apellido) {
        this.apellido = apellido;
    }
    public List<String> getEmails() {
        return emails;
    }
    public void setEmails(List<String> emails) {
        this.emails = emails;
    }

    @Override
    public String toString() {
        return "||      Persona      ||\n" +
               "|| Nombre : " + nombre + "\n" +
               "|| Apellido : " + apellido + "\n" +
               "|| Email : " + emails;
    }
}
