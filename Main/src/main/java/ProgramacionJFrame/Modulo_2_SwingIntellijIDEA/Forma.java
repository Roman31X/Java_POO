package ProgramacionJFrame.Modulo_2_SwingIntellijIDEA;

import com.formdev.flatlaf.FlatDarculaLaf;
import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Forma extends JFrame{
    private JPanel panelPrincipal;
    private JTextField campoTexto;
    private JLabel replicadorLabel;

    public Forma(){
        inicializarForma();
        campoTexto.addActionListener(e -> {
            System.out.println("Se ejecuto accionLisener");
        });
    }

    private void inicializarForma(){
        setContentPane(panelPrincipal);   //para establecer el primer componente del formulario
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //esta línea nos indica que cuando cerramos la ventana terminaremos la aplicación
        setSize(600,400); //para indicar el tamaño de nuestra ventana en pixeles alto y ancho
        setLocationRelativeTo(null); // para indicar la posición donde se mostrara nuestra ventana con ello centraremos la ventana
    }

    public static void main(String[] args) {
        FlatDarculaLaf.setup();
        Forma forma = new Forma();
        forma.setVisible(true);
    }
}
