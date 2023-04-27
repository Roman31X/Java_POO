package Ejercicios_POO.Ejer_2;
import java.util.*;
public class Corredor {
    //Atributos Encapsulados
    private int numero;
    private String nombre;
    private double tiempo;
    //Constructor con parametros
    public Corredor(int numero, String nombre, double tiempo) {
        this.numero = numero;
        this.nombre = nombre;
        this.tiempo = tiempo;
    }
    //método getter y setter
    public int getNumero() {
        return numero;
    }
    public void setNumero(int numero) {
        this.numero = numero;
    }
    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public double getTiempo() {
        return tiempo;
    }
    public void setTiempo(double tiempo) {
        this.tiempo = tiempo;
    }
    //método toSrtring

    @Override
    public String toString() {
        return  "|| N° de corredor es ["+numero+"]\n"+
                "|| El nombres es: ["+nombre+"]\n"+
                "|| Su tiempo fue de: ["+tiempo+"]\n"+
                "||=======================================||";
    }
}
