package ProgramacionJFrame.Modulo_2_SwingIntellijIDEA;

import com.formdev.flatlaf.FlatDarculaLaf;
import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

public class Forma extends JFrame{
    private JPanel panelPrincipal;
    private JTextField campoTexto;
    private JLabel replicadorLabel;

    public Forma(){
        inicializarForma();
        /*campoTexto.addActionListener(e -> {
            replicarTexto();
        });*/
        campoTexto.addKeyListener(new KeyAdapter() {
            @Override
            public void keyTyped(KeyEvent e) {
                super.keyTyped(e);
                replicarTexto();
            }
        });
    }

    private void inicializarForma(){
        setContentPane(panelPrincipal);   //para establecer el primer componente del formulario
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //esta línea nos indica que cuando cerramos la ventana terminaremos la aplicación
        setSize(600,400); //para indicar el tamaño de nuestra ventana en pixeles alto y ancho
        setLocationRelativeTo(null); // para indicar la posición donde se mostrara nuestra ventana con ello centraremos la ventana
    }

    private void replicarTexto(){
        this.replicadorLabel.setText(this.campoTexto.getText());
    }

    public static void main(String[] args) {
        FlatDarculaLaf.setup();
        Forma forma = new Forma();
        forma.setVisible(true);
    }
}
