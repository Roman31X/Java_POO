package Ejercicios_POO.EjercicioAbstracto;

public class Tigre extends Felino{
    private String especie;

    public Tigre(String habitat, float altura, float largo, float peso, String nombreCientifico, float tamanoGarras, Integer velocidad, String especie) {
        super(habitat, altura, largo, peso, nombreCientifico, tamanoGarras, velocidad);
        this.especie = especie;
    }

    public String getEspecie() {
        return especie;
    }
    public void setEspecie(String especie) {
        this.especie = especie;
    }

    @Override
    public String toString() {
        return "|+++++++++++++[DATOS TIGRE]+++++++++++++|\n" +
               "| Especie : " + getEspecie() +"\n" +
               "| Tamaño Garras : " + getTamanoGarras() +"\n" +
               "| Velocidad : " + getVelocidad() +"\n" +
               "| Habitat : " + getHabitat() + "\n" +
               "| Altura : " + getAltura() +"\n" +
               "| Largo : " + getLargo() +"\n" +
               "| Peso : " + getPeso() +"\n" +
               "| Nombre Cientifico : '" + getNombreCientifico() + "\n" +
               "|+++++++++++++DATOS EXTRAS++++++++++++++|";
    }

    @Override
    public String comer() {
        return "|+++++++++++[COMER]++++++++++++++|\n" +
                "El tigre de la especie "+getEspecie()+" suele comer el 10% de su peso "+getPeso();
    }

    @Override
    public String dormir() {
        return "|+++++++++++[DORMIR]++++++++++++++|\n" +
                "El tigre de la especie "+getEspecie()+" suelen buecar "+getHabitat()+" para poder reposar";
    }

    @Override
    public String correr() {
        return "|+++++++++++[CORRER]++++++++++++++|\n" +
                "El tigre de la especie "+getEspecie()+" alcanza una velocidad de "+getVelocidad();
    }

    @Override
    public String comunicarse() {
        return "|+++++++++++[COMUNICACIÓN]++++++++++++++|\n" +
                "El tigre solo suele socializar con su misma especie "+getEspecie();
    }
}
