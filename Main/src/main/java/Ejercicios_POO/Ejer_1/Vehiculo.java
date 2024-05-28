package Ejercicios_POO.Ejer_1;

public class Vehiculo {
    //Atributos emcapsulados
    private String modelo;
    private String tipo;
    private double precio;
    //constructor
    public Vehiculo(String modelo, String tipo, double precio) {
        this.modelo = modelo;
        this.tipo = tipo;
        this.precio = precio;
    }
    //método setter y getter
    public String getModelo() {
        return modelo;
    }
    public void setModelo(String modelo) {
        this.modelo = modelo;
    }
    public String getTipo() {
        return tipo;
    }
    public void setTipo(String tipo) {
        this.tipo = tipo;
    }
    public double getPrecio() {
        return precio;
    }
    public void setPrecio(double precio) {
        this.precio = precio;
    }
    //Método para mostrar Los datos del vehiculo
    /**
     * Este método retorna la información del vehículo registrado
     * en la posición asignada por el método de la clase principal*/
    public String DatosVehiculo(){
        return "||===============VEHICULO================||\n"+
               "|| La marca del vehiculo es: ["+modelo+"]\n"+
               "|| El tipo de vehiculo es: ["+tipo+"]\n"+
               "|| El preciodel vehiculo es: ["+precio+"]";
    }
}
