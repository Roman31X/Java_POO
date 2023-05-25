package Venta;

import javax.swing.*;

//PARA UTILIZAR EL PAQUETE DE GRAFICA EN MI CLASE
//SE DEBE DE IMPORTAR "import javax.swing.*;"
//Y EN LE MÉTODO DE LA CLASE AGREGAR EL "extends JFrame"
//MAS INFORMACIÓN => "https://docs.oracle.com/en/java/javase/17/docs/api/java.desktop/javax/swing/JFrame.html"
public class Venta extends JFrame {
    //CONSTRUCTOR DE LA CLASE
    public Venta(){
        //DAMOS TAMAÑO A LA VENTA A TRAVES DE LA SIGUIENTE DECLARACIÓN
        //mediante la sentencia le pasaremos los argumentos
        //COMO PRIMER ARGUMENTO EL [ANCHO] de la ventana
        //COMO SEGUNDO ARGUMENTO EL [LARGO] de la ventana
        setSize(500,400);
        //designamos un nombre a la ventana grafica
        setTitle("Mi primera Ventana Jframe");

    }
}
