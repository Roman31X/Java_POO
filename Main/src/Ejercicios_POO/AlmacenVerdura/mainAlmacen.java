package Ejercicios_POO.AlmacenVerdura;

public class mainAlmacen {
    public static void main(String[] args) {
        //Ejemplo Lacteo
        Lacteo producto1 = new Lacteo("Yogurt",8.50,2,3);
        //Ejemplo Fruta
        Fruta producto2 = new Fruta("Papaya",12.5,3.20,"Naranja");
        //Ejemplo Limpieza
        Limpieza producto3 = new Limpieza("Brillantina",15.50,"Cera",1.5);
        //Ejemplo NoPerecible
        NoPerecible producto4 = new NoPerecible("Galletas",20.5,5,4);

        Producto[] productos = {producto1,producto2,producto3,producto4};
        for (int i = 0; i < productos.length; i++) {
            System.out.println("|+++++++Producto ["+(i+1)+"]+++++++++|");
            System.out.println(productos[i].toString());
        }
    }
}
