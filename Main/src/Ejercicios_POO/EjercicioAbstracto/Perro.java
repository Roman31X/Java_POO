package Ejercicios_POO.EjercicioAbstracto;

public class Perro extends Canino{
    private Integer fuerzaMordida;

    public Perro(String habitat, float altura, float largo, float peso, String nombreCientifico, String color, float tamaColmillos, Integer fuerzaMordida) {
        super(habitat, altura, largo, peso, nombreCientifico, color, tamaColmillos);
        this.fuerzaMordida = fuerzaMordida;
    }

    public Integer getFuerzaMordida() {
        return fuerzaMordida;
    }
    public void setFuerzaMordida(Integer fuerzaMordida) {
        this.fuerzaMordida = fuerzaMordida;
    }

    @Override
    public String toString() {
        return "|+++++++++++[DATOS PERRO AFRICANO]++++++++++++++|\n"+
               "| Fuerza Mordida : " + getFuerzaMordida() + "\n"+
               "| Color : " + getColor() + "\n"+
               "| Tamaño Colmillos : " + getTamaColmillos() +"\n"+
               "| Habitat : " + getHabitat() + "\n"+
               "| Altura : " + getAltura() +"\n"+
               "| Largo : " + getLargo() +"\n"+
               "| Peso : " + getPeso() +"\n"+
               "| Nombre Cientifico : " + getNombreCientifico() + "\n"+
               "++++++++++++DATOS EXTRAS+++++++++++++++++++++++|";
    }

    @Override
    public String comer() {
        return "|+++++++++++[COMER]++++++++++++++|\n"+
                "El perro africano solo consumer el 6% de su peso "+getPeso();
    }

    @Override
    public String dormir() {
        return "|+++++++++++[DORMIR]++++++++++++++|\n"+
                "El perro africano duerme en manadas en "+getHabitat();
    }

    @Override
    public String correr() {
        return "|+++++++++++[CORRER]++++++++++++++|\n"+
                "El perro Africano suele alcanza una velocidad de 13 km/h por su altura de "+getAltura();
    }

    @Override
    public String comunicarse() {
        return "|+++++++++++[COMUNICACIÓN]++++++++++++++|\n"+
                "El perro Africano puede comunicarse con su manda a travez de rugidos y aullidos";
    }
}
