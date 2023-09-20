package Ejercicios_POO.EjercicioAbstracto;

public class Lobo extends Canino{
    private Integer numCamada;
    private String especieLobo;

    public Lobo(String habitat, float altura, float largo, float peso, String nombreCientifico, String color, float tamaColmillos, Integer numCamada, String especieLobo) {
        super(habitat, altura, largo, peso, nombreCientifico, color, tamaColmillos);
        this.numCamada = numCamada;
        this.especieLobo = especieLobo;
    }

    public Integer getNumCamada() {
        return numCamada;
    }
    public void setNumCamada(Integer numCamada) {
        this.numCamada = numCamada;
    }
    public String getEspecieLobo() {
        return especieLobo;
    }
    public void setEspecieLobo(String especieLobo) {
        this.especieLobo = especieLobo;
    }

    @Override
    public String toString() {
        return "|+++++++++++[DATOS LOBO]++++++++++++++|" +"\n"+
               "| Numero Camada : " + getNumCamada() +"\n"+
               "| Especie Lobo : " + getEspecieLobo() + "\n"+
               "| Color : " + getColor() +"\n"+
               "| Tamaño Colmillos : " + getTamaColmillos() +"\n"+
               "| Habitat : " + getHabitat() + "\n"+
               "| Altura : " + getAltura() +"\n"+
               "| Largo : " + getLargo() +"\n"+
               "| Peso : " + getPeso() +"\n"+
               "| Nombre Cientifico : " + getNombreCientifico() + "\n"+
               "|+++++++++++DATOS EXTRAS++++++++++++|";
    }

    @Override
    public String comer() {
        return "|+++++++++++[COMER]++++++++++++++|\n"+
                "El lobo "+getEspecieLobo()+" puede comer el 10% de su peso de "+getPeso()+" pero cuando alcanzan la mayoria de edad";
    }

    @Override
    public String dormir() {
        return "|+++++++++++[DORMIR]++++++++++++++|\n"+
                "Los lobos "+getEspecieLobo()+" siempre duermen en manda par conservar calor en temporadas frias";
    }

    @Override
    public String correr() {
        return "|+++++++++++[CORRER]++++++++++++++|\n"+
                "Los lobos pueden alcanzar una velocidad de 15km/h debido a altura de "+getAltura();
    }

    @Override
    public String comunicarse() {
        return "|+++++++++++[COMUNICACIÓN]++++++++++++++|\n"+
                "Los lobos de la especie "+getEspecieLobo()+" usualmente suele comunicarse con su mana mediante aullidos";
    }
}
