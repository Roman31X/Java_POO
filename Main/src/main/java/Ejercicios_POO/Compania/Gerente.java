package Ejercicios_POO.Compania;

public class Gerente extends Empleado{
    private double presupuesto;

    public Gerente(String nombre, String apellido, String numeroFiscal, String direccion, double remuneracion, int empleado, double presupuesto) {
        super(nombre, apellido, numeroFiscal, direccion, remuneracion, empleado);
        this.presupuesto = presupuesto;
    }

    public double getPresupuesto() {
        return presupuesto;
    }

    public void setPresupuesto(double presupuesto) {
        this.presupuesto = presupuesto;
    }

    @Override
    public String toString() {
        return super.toString()+"\n"+"| Presupuesto : " + presupuesto;
    }
}
