package Venta;

import javax.swing.*;
import java.awt.*;

//PARA UTILIZAR EL PAQUETE DE GRAFICA EN MI CLASE
//SE DEBE DE IMPORTAR "import javax.swing.*;"
//Y EN LE MÉTODO DE LA CLASE AGREGAR EL "extends JFrame"
//MAS INFORMACIÓN => "https://docs.oracle.com/en/java/javase/17/docs/api/java.desktop/javax/swing/JFrame.html"
public class Venta extends JFrame {
    //declaramos variable publica de acceso a todos los metodos
    public JPanel panel1;
    //CONSTRUCTOR DE LA CLASE
    public Venta(){
        //DAMOS TAMAÑO A LA VENTA A TRAVES DE LA SIGUIENTE DECLARACIÓN
        //mediante la sentencia le pasaremos los argumentos
        //COMO PRIMER ARGUMENTO EL [ANCHO] de la ventana
        //COMO SEGUNDO ARGUMENTO EL [LARGO de la ventana
        setSize(500,500);
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
        iniciarPaneles();
    }
    //agregar un panel a nuestra ventana
    private void iniciarPaneles(){
        iniciarComponentes();
        //iniciarEtiquetas();
        //ColocarBoton();
        //RadioBotones();
        //CajasTexto();
        //areadeTexto();
        ListaDesplegable();
    }
    //agregar un panel a nuestra ventana
    private void iniciarComponentes(){
        panel1 = new JPanel(); //creación de un panel
        //colocar encima de la Ventana
        getContentPane().add(panel1);
        //para darle color al panel
        //panel1.setBackground(Color.CYAN);
        //Para desactivar el Layout o Diseño por defecto
        panel1.setLayout(null);

    }
    //agregamos dos etiquetas a nuetra ventana panel
    private void iniciarEtiquetas(){
        //CREAMOS UNA INSTANCIA del tipo [JLabel = etiquetas]
        //PODEMOS ENVIAR EL ARGUMENTO DE TIPO CADENA "Hola"
        //El constructor por determinación lo puede aceptar
        JLabel etiqueta = new JLabel("Hola Mundo",SwingConstants.CENTER); //para mostrar texto en la etiqueta y centrarlo
        //ETIQUETA - 1 TIPO TEXTO
        //para darle nombre la etiqueta
        //etiqueta.setText("Hola");
        //le damos tamaño y posicion a la etiqueta
        etiqueta.setBounds(150,50,100,15);
        //agregamos la etiqueta al panel
        panel1.add(etiqueta);
        //Color a la Letra de la etiqueta
        etiqueta.setForeground(Color.BLACK);
        //Permitir editar la etiqueta
        etiqueta.setOpaque(true);
        //Cambiar el color de fondo de la etiqueta
        etiqueta.setBackground(Color.CYAN);
        //editar estilo de letra - tipo [negrita, etc] - tamaño
        etiqueta.setFont(new Font("chiller",0,20));

        //ETIQUETA - 2 IMAGEN

        JLabel etiqueta2 = new JLabel();
        etiqueta2.setOpaque(true);
        //posición
        etiqueta2.setBackground(Color.BLUE);
        etiqueta2.setBounds(250,90,150,200);
        ImageIcon imagen = new ImageIcon("Main/src/Venta/demiurs.jpg");
        //para dar tamaño a la imgen dentro de la etiqueta
        //se tomara sus datos de medida
        etiqueta2.setIcon(new ImageIcon(imagen.getImage().getScaledInstance(etiqueta2.getWidth(),etiqueta2.getHeight(),Image.SCALE_SMOOTH))); //ota forma de colocar imagen

        //agregar al panel
        panel1.add(etiqueta2);
    }
    //agregamos botones
    private void ColocarBoton(){
        //BOTON - 1
        JButton boton1 = new JButton("Registrar"); //otra forma boton1.getText("click");
        //POSICIÓN
        boton1.setBounds(100,100,140,40);
        boton1.setBackground(Color.CYAN);
        boton1.setMnemonic('a'); //como dar accion en el boton [alt + a] com si fuera un clic
        //para iteracion con el boton activar y desactivar
        boton1.setEnabled(true);
        boton1.setFont(new Font("arial",Font.BOLD,20));
        //agregar botron al panel
        panel1.add(boton1);

        //BOTON - 2 - BOTON IMAGEN
        JButton boton2 = new JButton();
        boton2.setBounds(100,200,60,60);
        ImageIcon imagen2 = new ImageIcon("Main/src/Venta/s1.png");
        boton2.setBackground(Color.GREEN);
        boton2.setIcon(new ImageIcon(imagen2.getImage().getScaledInstance(boton2.getWidth(),boton2.getHeight(),Image.SCALE_SMOOTH)));
        panel1.add(boton2);

    }
    //agregamos radio bootons
    private void RadioBotones(){
        JRadioButton radioboton1 = new JRadioButton("Opción [1]",false);
        radioboton1.setBounds(50,100,100,50);
        //para desabilitar el boton
        //radioboton1.setEnabled(false);
        //agregar al panel
        panel1.add(radioboton1);
        //segundo radioboton
        JRadioButton radioboton2 = new JRadioButton("Opción [2]",false);
        radioboton2.setBounds(50,150,100,50);
        //agregar al panel
        panel1.add(radioboton2);
        JRadioButton radioboton3 = new JRadioButton("Opción [3]",false);
        radioboton3.setBounds(50,200,100,50);
        //agregar al panel
        panel1.add(radioboton3);

        //GRUPO DE BOTONES
        //ayuda a limitar a la selección de una sola opción
        ButtonGroup grupo1 = new ButtonGroup();
        grupo1.add(radioboton1);
        grupo1.add(radioboton2);
        grupo1.add(radioboton3);
    }
    //agregamos fila de texto
    private void CajasTexto(){
        JTextField usuario = new JTextField();
        usuario.setBounds(50,50,100,30);
        panel1.add(usuario);
    }
    //agregamos areas de texto
    private void areadeTexto(){
        JTextArea caja1 = new JTextArea();
        caja1.setBounds(20,20,300,200);
        caja1.setText("Escribe aqui tu comentario:");
        caja1.append("\nDescribe tu personalidad:"); //te permite agregar otra linea de texto
        caja1.setEditable(false);//no dejara editar el texto
        panel1.add(caja1);
    }
    //agregar lista despegable
    private void ListaDesplegable(){
        String [] paises = {"Perú","Colombia","Chile","Argentina"};
        JComboBox lista1 = new JComboBox(paises);
        //agregar otro item a la lista
        lista1.addItem("Ecuador");
        //seleccionar el primero objeto visto
        lista1.setSelectedItem("Ecuador");
        lista1.setBounds(20,20,100,30);
        panel1.add(lista1);
    }
}
