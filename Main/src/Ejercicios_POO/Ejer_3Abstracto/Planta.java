package Ejercicios_POO.Ejer_3Abstracto;

public class Planta extends SerVivo{
    //Heredo de la clase padre el método
    /**
     * El método comer es heredado de la clase padre
     * SerVivo pero al agregar el @Override lo está
     * sobreescribiendo como su propia clase con su
     * función*/
    @Override
    public void Comer(){
        System.out.println("La planta se alimenta a través de fotosintesis");
    }
}
