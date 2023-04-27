package Ejercicios_POO.Ejer_3Abstracto;

public class Principal {
    public static void main(String[] args) {
        //creamos un objeto de las clases hijas
        Planta pa = new Planta();
        Carnivoro cn = new Carnivoro();
        Herbivoro he = new Herbivoro();
        //una vez creados veremos como se alimentan las hijas
        //ya sobreescrito el método comer
        pa.Comer();
        cn.Comer();
        he.Comer();
    }
}
