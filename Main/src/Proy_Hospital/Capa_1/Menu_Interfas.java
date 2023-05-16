package Proy_Hospital.Capa_1;
import Proy_Hospital.Capa_2.Doctor;
import Proy_Hospital.Capa_2.Enfermera;
import Proy_Hospital.Capa_2.Paciente;

import java.util.*;
public class Menu_Interfas {
    //Creamos un arreglo que almacene los meses del año
    public static final String [] mes = {"Enero","Febrero","Marzo","Abril","Mayo","Junio","Julio","Agosto","Setiembre","Octubre","Noviembre","Diciembre"};
    //Creamos variables de tipo publico para [DOCTOR - PACINETE - ENFERMERA]
    public static Doctor logindoc;//doctor
    public static Enfermera loginenfer;//enfermera
    public static Paciente loginpaci;//paciente
    //Creamos un método que mostrara el menu de la interfas
    public static void Menu(){
        //importamos Scanner
        Scanner sc = new Scanner(System.in);
        System.out.println("||=========BIENVENIDO INTERFAZ========||");
        System.out.println("|| SELECIONE LA OPCIÓN DESEADA");
        //Atributo para selección de menu
        int opcion = 0;
        //bucle para mostrar interfaz
        do{
            System.out.println("||   [1] - DOCTOR    ||");
            System.out.println("||   [2] - ENFERMERA ||");
            System.out.println("||   [3] - PACIENTE  ||");
            System.out.println("||   [0] - SALIR     ||");
            System.out.print("|| Ingrese : ");
            //Pedimos el valor de opción de menu
            opcion = sc.nextInt();
            //ahora se evaluara la opción ingresada
            switch(opcion){
                case 1:
                    //Autenticaremos el usuario
                    Autenticar(opcion);
                case 2:
                    //Autenticaremos el usuario
                    Autenticar(opcion);
                case 3:
                    //Autenticaremos el usuario
                    Autenticar(opcion);
                case 0: opcion = 1;break;
            }
        }while(opcion != 1);

    }
    //Creamos otro metodo para verificar la autenticación
    public static void Autenticar(int usuario){
        //SINTAXIS
        // si usuario = 1 [Doctor]
        // si usuario = 2 [Enfermera]
        // si usuario = 3 [Enfermera]
        //ARRAYLIST DOCTOR
        ArrayList<Doctor> doctor = new ArrayList<Doctor>();
        doctor.add(new Doctor("Carlos","carlos.haa@gmail.com"));
        doctor.add(new Doctor("Mario","mario.haa@gmail.com"));
        doctor.add(new Doctor("Luigui","luigui.haa@gmail.com"));
        doctor.add(new Doctor("Pedro","pedro.haa@gmail.com"));
        //ARRAYLIST PACIENTE
        ArrayList<Paciente> paciente = new ArrayList<Paciente>();
        paciente.add(new Paciente("Dante","dante26@gmail.com"));
        paciente.add(new Paciente("Daniela","daniela3@gmail.com"));
        paciente.add(new Paciente("Ana","ana45@gmail.com"));
        paciente.add(new Paciente("Santiago","santiago25@gmail.com"));
        //ARRAYLIST ENFERMERA
        ArrayList<Enfermera> enfermera = new ArrayList<Enfermera>();
        enfermera.add(new Enfermera("Camila","camila02@gmail.com"));
        enfermera.add(new Enfermera("Alondra","alondra25@gmail.com"));
        enfermera.add(new Enfermera("Sophia","sophia5@gmail.com"));
        enfermera.add(new Enfermera("Yoselin","Yoselin45@gmail.com"));
        //atributo qu everificara si es un usuario
        boolean email = false;
        do {
            //Solicitamos el correo del usuario
            Scanner sc = new Scanner(System.in);
            System.out.println("Ingrese su correo : [usuario.gmail.com]");
            System.out.print("|| Ingrese CORREO : ");
            String correo = sc.nextLine();
            //validaremos el correo
            if(usuario == 1){
                //bucle que recorrera el arraylist
                for (Doctor doc:doctor) {
                    if(doc.getEmai().equals(correo)){
                        email = true;
                        //obtener los datos del usuario
                        logindoc = doc;
                        //método una vez se loge
                        MenuDoctor.DoctorMenu();
                    }
                }
            }else if( usuario == 2){
                //bucle que recorrera el arraylist
                for (Enfermera enfer:enfermera) {
                    if(enfer.getEmai().equals(correo)){
                        email = true;
                        //obtener los datos del usuario
                        loginenfer = enfer;
                        //método una vez se loge correctamnete
                    }
                }
            }else if( usuario == 3){
                //bucle que recorrera el arraylist
                for (Paciente paci:paciente) {
                    if(paci.getEmai().equals(correo)){
                        email = true;
                        //obtener los datos del usuario
                        loginpaci = paci;
                        //método que se ejecutara una vez se loge correctamente
                        MenuPaciente.PacienteMenu();
                    }
                }
            }
        }while(!email);

    }

}
