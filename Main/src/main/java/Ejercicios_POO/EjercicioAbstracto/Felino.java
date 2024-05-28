package Ejercicios_POO.EjercicioAbstracto;

abstract class Felino extends Mamifero{
    protected float tamanoGarras;
    protected Integer velocidad;

    public Felino(String habitat, float altura, float largo, float peso, String nombreCientifico, float tamanoGarras, Integer velocidad) {
        super(habitat, altura, largo, peso, nombreCientifico);
        this.tamanoGarras = tamanoGarras;
        this.velocidad = velocidad;
    }

    public float getTamanoGarras() {
        return tamanoGarras;
    }
    public void setTamanoGarras(float tamanoGarras) {
        this.tamanoGarras = tamanoGarras;
    }
    public Integer getVelocidad() {
        return velocidad;
    }
    public void setVelocidad(Integer velocidad) {
        this.velocidad = velocidad;
    }
}
