package ProgramacionJFrame.Modulo_2_SwingIntellijIDEA;

import com.formdev.flatlaf.FlatDarculaLaf;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class LoginForm extends JFrame{
    private JPanel panelPrincipal;
    private JTextField usuarioTexto;
    private JPasswordField passwordTexto;
    private JButton enviarBoton;

    public LoginForm() {
        inicializarForma();
        enviarBoton.addActionListener(e -> validar());
    }

    private void inicializarForma(){
        setContentPane(panelPrincipal);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(600,400);
        setLocationRelativeTo(null);
    }

    private void validar(){
        var usuario = usuarioTexto.getText();
        var password = new String(passwordTexto.getPassword());

        if("root".equals(usuario) && "admin".equals(password)){
            mostarMensaje("Datos correctos, bienvenido!");
        }else if("root".equals(usuario)){
            mostarMensaje("Password incorrecto, corregirlo!");
        }else{
            mostarMensaje("Ambos datos son incorrectos!");
        }
    }

    private void mostarMensaje(String mensaje){
        JOptionPane.showMessageDialog(this,mensaje);
    }

    public static void main(String[] args) {
        FlatDarculaLaf.setup();
        LoginForm loginFrom = new LoginForm();
        loginFrom.setVisible(true);
    }
}
