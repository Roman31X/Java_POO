package Ejercicios_POO.EjercicioAbstracto;

public class mainTest {
    public static void main(String[] args) {
        Mamifero[] mamiferos = new Mamifero[5];

        Mamifero leon = new Leon("Sabana Africana",1.20f,2.10f,210f,"Panthera Leon",10,8);
        Mamifero tigre = new Tigre("Sabana Africana",2.10f,2.20f,200f,"Pantheras Tigris",7.5f,65,"Felino");
        Mamifero guepardo = new Guepardo("Sabana Africana",80.0f,1.80f,80.0f,"Panthera onca");
        Mamifero lobo = new Lobo("Montañas",80.0f,1.60f,75.0f,"Canis Lupus","Gris",5.0f,10,"Canino");
        Mamifero perroAfricano = new Perro("Sabana Africana",0.75f,0.70f,0.70f,"Lycaon pictus","Color ocre con negro",0.05f,10);

        mamiferos[0] = leon;
        mamiferos[1] = tigre;
        mamiferos[2] = guepardo;
        mamiferos[3] = lobo;
        mamiferos[4] = perroAfricano;

        for (Mamifero animales : mamiferos) {
            System.out.println(animales.toString());
            System.out.println(animales.comer());
            System.out.println(animales.dormir());
            System.out.println(animales.correr());
            System.out.println(animales.comunicarse());
            System.out.println("|||||||||||||||||||||||||||||||||||||||||||");
        }

    }
}
