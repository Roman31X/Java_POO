package Ejercicios_POO.EjercicioAbstracto;

public class Leon extends Mamifero{
    private Integer numManada;
    private float potencialRugidoDecimal;

    public Leon(String habitat, float altura, float largo, float peso, String nombreCientifico, Integer numManada, float potencialRugidoDecimal) {
        super(habitat, altura, largo, peso, nombreCientifico);
        this.numManada = numManada;
        this.potencialRugidoDecimal = potencialRugidoDecimal;
    }

    public Integer getNumManada() {
        return numManada;
    }
    public void setNumManada(Integer numManada) {
        this.numManada = numManada;
    }
    public float getPotencialRugidoDecimal() {
        return potencialRugidoDecimal;
    }
    public void setPotencialRugidoDecimal(float potencialRugidoDecimal) {
        this.potencialRugidoDecimal = potencialRugidoDecimal;
    }

    @Override
    public String toString() {
        return "|+++++++++++++DATOS LEON]+++++++++++++++++++|" + "\n"+
               "| Numero de Manada : " + getNumManada() +"\n"+
               "| Potencial de Rugido : " + getPotencialRugidoDecimal() +"\n"+
               "| Habitat : " + getHabitat() + "\n"+
               "| Altura : " + getAltura() +"\n"+
               "| Largo : " + getLargo() +"\n"+
               "| Peso : " + getPeso() +"\n"+
               "| Nombre Cientifico : " + getNombreCientifico()+ "\n"+
               "|+++++++++++ACCIONES DE FELINO++++++++++++++|" ;
    }

    @Override
    public String comer() {
        return "|+++++++++++[COMER]++++++++++++++|\n"+
                "| El leon suele comer el 15% de su peso que es "+getPeso();
    }

    @Override
    public String dormir() {
        return "|+++++++++++[DORMIR]++++++++++++++|\n"+
                "| El león suele buscar su habitad de "+getHabitat()+" para descansar";
    }

    @Override
    public String correr() {
        return "|+++++++++++[CORRER]++++++++++++++|\n"+
                "| El leon puede no puede alcanzar grandes velocidades devido a su peso de "+getPeso();
    }

    @Override
    public String comunicarse() {
        return "|+++++++++++[COMUNICACIÓN]++++++++++++++|\n"+
                "| El leon suele tener una potencia de "+getPotencialRugidoDecimal()+" para comunicarce con su manada";
    }
}
