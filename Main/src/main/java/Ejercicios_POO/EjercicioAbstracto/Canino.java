package Ejercicios_POO.EjercicioAbstracto;

abstract public class Canino extends Mamifero{
    protected String color;
    protected float tamaColmillos;

    public Canino(String habitat, float altura, float largo, float peso, String nombreCientifico, String color, float tamaColmillos) {
        super(habitat, altura, largo, peso, nombreCientifico);
        this.color = color;
        this.tamaColmillos = tamaColmillos;
    }

    public String getColor() {
        return color;
    }
    public void setColor(String color) {
        this.color = color;
    }
    public float getTamaColmillos() {
        return tamaColmillos;
    }
    public void setTamaColmillos(float tamaColmillos) {
        this.tamaColmillos = tamaColmillos;
    }
}
