package Venta;

import javax.swing.*;
import java.awt.*;

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
        //COMO SEGUNDO ARGUMENTO EL [LARGO de la ventana
        setSize(500,400);
        //designamos un nombre a la ventana grafica
        setTitle("Mi primera Ventana Jframe");
        //SENTENCIA PARA DETENER LA EJECUCIÓN DESDE LA VENTANA
        //por defecto tomara la función cerrar la barra donde esta
        //el titulo
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        //establecemos la posicion de la ventana en el plano
        //[x] y [y]
        /**setLocation(100,200);*/
        //para reducir lines d codigo en una sola sentencia se puede
        //indicar la posición y el tamaño de la ventana
        /**Los dos primeros argumentos determinan la posición*/
        /**Los dos segundos argumentos determinan el tamaño de la ventana*/
        //setBounds(100,200,500,400);
        //para centrar la ventana
        setLocationRelativeTo(null);
        //establecer color a la Ventana
        //this.getContentPane().setBackground(Color.CYAN);
        //lamamos al metodo que contiene al panel
        iniciarComponentes();
    }
    //agregar un panel a nuestra ventana
    private void iniciarComponentes(){
        JPanel panel1 = new JPanel(); //creación de un panel
        //colocar encima de la Ventana
        this.getContentPane().add(panel1);
        //para darle color al panel
        //panel1.setBackground(Color.CYAN);
        //Para desactivar el Layout o Diseño por defecto
        panel1.setLayout(null);
        //CREAMOS UNA INSTANCIA del tipo [JLabel = etiquetas]
        //PODEMOS ENVIAR EL ARGUMENTO DE TIPO CADENA "Hola"
        //El constructor por determinación lo puede aceptar
        JLabel etiqueta = new JLabel("Hola",SwingConstants.CENTER); //para mostrar texto en la etiqueta y centrarlo
        //para darle nombre la etiqueta
        //etiqueta.setText("Hola");
        //le damos tamaño y posicion a la etiqueta
        etiqueta.setBounds(20,10,50,15);
        //agregamos la etiqueta al panel
        panel1.add(etiqueta);
        //Color a la Letra de la etiqueta
        etiqueta.setForeground(Color.BLACK);
        //Permitir editar la etiqueta
        etiqueta.setOpaque(true);
        //Cambiar el color de fondo de la etiqueta
        etiqueta.setBackground(Color.CYAN);
        etiqueta.setFont(new Font("chiller",0,30));

    }
}
