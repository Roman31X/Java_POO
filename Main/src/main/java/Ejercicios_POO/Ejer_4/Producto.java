package Ejercicios_POO.Ejer_4;

public class Producto {
    /*
    * Crear la clase Producto con tres atributos fabricante
    * tipo String y nombre String y precio int, inicializar
    * todos sus valores en el constructor e implementar sus
    * respectivos métodos getter.*/

    private String fabricante;
    private String nombre;
    private int precio;

    public Producto(String fabricante, String nombre, int precio) {
        this.fabricante = fabricante;
        this.nombre = nombre;
        this.precio = precio;
    }

    public String getFabricante() {
        return fabricante;
    }
    public void setFabricante(String fabricante) {
        this.fabricante = fabricante;
    }
    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public int getPrecio() {
        return precio;
    }
    public void setPrecio(int precio) {
        this.precio = precio;
    }

}
