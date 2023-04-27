package Ejercicios_POO.Ejer_3Abstracto;

public class Carnivoro extends Animal{

    //heredamos la clase abstracta del padre Animal
    /**
     * El método comer es heredado de la clase padre
     * SerVivo pero al agregar el @Override lo está
     * sobreescribiendo como su propia clase con su
     * función*/
    @Override
    public void Comer(){
        System.out.println("Los carnívoros se alimentan de carne");
    }
}
