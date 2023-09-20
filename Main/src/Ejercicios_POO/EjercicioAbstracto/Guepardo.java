package Ejercicios_POO.EjercicioAbstracto;

public class Guepardo extends Mamifero{

    public Guepardo(String habitat, float altura, float largo, float peso, String nombreCientifico) {
        super(habitat, altura, largo, peso, nombreCientifico);
    }

    @Override
    public String toString() {
        return "|+++++++++++[DATOS TIGRE]++++++++++++++|" +"\n"+
               "| Habitat : " + habitat + "\n"+
               "| Altura : " + altura +"\n"+
               "| Largo : " + largo +"\n"+
               "| Peso : " + peso +"\n"+
               "| Nombre Cientifico : " + nombreCientifico + "\n"+
               "|++++++++++++++++++DATOS EXTRAS++++++++|";
    }

    @Override
    public String comer() {
        return "|+++++++++++[COMER]++++++++++++++|\n"+
                "El Guepardo solo como el 5% de sus peso de "+getPeso();
    }

    @Override
    public String dormir() {
        return "|+++++++++++[DORMIR]++++++++++++++|\n"+
                "El guepardo busca dormir en zonas altas en las cuales se sientan tranquilos o en busca de presas";
    }

    @Override
    public String correr() {
        return "|+++++++++++[CORRER]++++++++++++++|\n"+
                "Este felino pued elacanzar grandes velocidades debido a su peso de "+getPeso();
    }

    @Override
    public String comunicarse() {
        return "|+++++++++++[COMUNICARSE]++++++++++++++|\n"+
                "Este felino muy poco se comunica con su manada ya que suele cazar solo por su velocidad";
    }
}
