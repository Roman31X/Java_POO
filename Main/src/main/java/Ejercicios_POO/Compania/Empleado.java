package Ejercicios_POO.Compania;

public class Empleado extends Persona {
    private double remuneracion;
    private int empleadoId;

    public Empleado(String nombre, String apellido, String numeroFiscal, String direccion, double remuneracion, int empleadoId) {
        super(nombre, apellido, numeroFiscal, direccion);
        this.remuneracion = remuneracion;
        this.empleadoId = empleadoId;
    }

    public double getRemuneracion() {
        return remuneracion;
    }
    public void setRemuneracion(double remuneracion) {
        this.remuneracion = remuneracion;
    }
    public int getEmpleado() {
        return empleadoId;
    }
    public void setEmpleado(int empleado) {
        this.empleadoId = empleado;
    }

    @Override
    public String toString() {
        return super.toString()+"| Remuneración : " + remuneracion +"\n"+
                "| Empleado : " + empleadoId;
    }
}
