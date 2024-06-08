package ProgramacionJFrame.Modulo_2_SwingIntellijIDEA;

import javax.swing.*;
import java.awt.*;

public class Forma extends JFrame{
    private JPanel panel1;

    public Forma(){
        inicializarForma();
    }

    private void inicializarForma(){
        setContentPane(panel1);   //para establecer el primer componente del formulario
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //esta línea nos indica que cuando cerramos la ventana terminaremos la aplicación
        setSize(400,200); //para indicar el tamaño de nuestra ventana en pixeles alto y ancho
        setLocationRelativeTo(null); // para indicar la posición donde se mostrara nuestra ventana con ello centraremos la ventana
    }

    public static void main(String[] args) {
        Forma forma = new Forma();
        forma.setVisible(true);
    }
}
