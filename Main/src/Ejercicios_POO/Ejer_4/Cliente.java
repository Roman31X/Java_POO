package Ejercicios_POO.Ejer_4;

public class Cliente {
    /*
    * Crear la clase Cliente con dos atributos nombre y apellido,
    * inicializar todos sus valores en el constructor e implementar
    *  sus respectivos métodos getter.
     */

    private String nombre;
    private String apellido;

    public Cliente(String nombre, String apellido) {
        this.nombre = nombre;
        this.apellido = apellido;
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

    @Override
    public String toString() {
        return "Nombre : " +nombre + "\n" +
               "|\t\t\tApellido : " + apellido;
    }
}
