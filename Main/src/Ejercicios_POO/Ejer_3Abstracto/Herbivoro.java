package Ejercicios_POO.Ejer_3Abstracto;

public class Herbivoro extends Animal{
    //herdamos la clase abstracta del padre
    /**
     * El método comer es heredado de la clase padre
     * SerVivo pero al agregar el @Override lo está
     * sobreescribiendo como su propia clase con su
     * función*/
    @Override
    public void Comer() {
        System.out.println("Se alimentan de hierbas o pasto");
    }
}
