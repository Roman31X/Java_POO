package Encapsulamieto_Construptor;
import java.util.Scanner;
public class Hospital {
    //Creamos las variables del Hospital
    int salir = 0;
    //public para que cualquier método
    //pueda usar la variable
    //DATOS DE DOCTORES
    public static String Doc[] = {"Diego","Daniel","Renee","Liliana"};
    public static String Espe[] = {"Oculista","Cardiólogo","Dentista","Psiquiatría"};
    public static String dia[] = {"Lunes","Martes","Jueves","Viernes"};
    //DATOS DE PACIENTES
    public static String Paci[] = {"Britney","Saul","Alejandro","Mario"};
    public static String Enfer[] = {"Miopía","Taquicardia","Caries","Psicosis"};
    public static String Habit[] = {"Piso 1","Piso 2", "Piso 4", "Piso 5"};

    //Creación de Clases Estaticas
    /**
     * Esta Clase mostrará el menu
     * principal de selección entre
     * DOCTOR Y PACIENTE*/
    public static void Principal(){
        System.out.println("||====================||");
        System.out.println("||   MENU HOSPITAL    ||");
        System.out.println("|| [1] - DOCTORES     ||");
        System.out.println("|| [2] - PACIENTES    ||");
        System.out.println("|| [3] - SALIR        ||");
        System.out.println("||====================||");
    }
    /**
     * Esta Clase mostrará el Menu
     * principal de la sección
     * Doctores con sus respectivas
     * opciones*/
    public static void MenuDoctor(){
        Scanner sc = new Scanner(System.in);
        //variables privadas del metodo
        int salir = 0;
        int OpDoct = 0;
        do {
            //MENU
            System.out.println("||====================||");
            System.out.println("||       DOCTOR       ||");
            System.out.println("||   [1] - Nombres    ||");
            System.out.println("|| [2] - Especialidad ||");
            System.out.println("|| [3] - Horario      ||");
            System.out.println("|| [4] - RETORNAR     ||");
            System.out.println("||====================||");
            //SOLICITAR OPCIÓN
            System.out.print("INGRESE OPCIÓN =>");
            OpDoct = sc.nextInt();
            switch (OpDoct){
                case 1:
                    for (int i = 0;i < Doc.length; i++) {
                        System.out.println("Nombre del doctor: ["+Doc[i]+"]");
                    }
                    break;
                case 2:
                    for (int i = 0;i < Espe.length; i++) {
                        System.out.println("Especialidad del Doctor: ["+Espe[i]+"]");
                    }
                    break;
                case 3:
                    for (int i = 0;i < dia.length; i++) {
                        System.out.println("Horario del doctor: ["+dia[i]+"]");
                    }
                    break;
                case 4:
                    salir = 1;
            }
        }while( salir != 1);
    }
    /**
     * Esta Clase mostrará el Menu
     * principal de la sección
     * PACIENTES con sus respectivas
     * opciones*/
    public static void  MenPaciente(){
        Scanner sc = new Scanner(System.in);
        int salir = 0;
        int OpPaci = 0;
        do{
            System.out.println("||====================||");
            System.out.println("||     PACIENTE       ||");
            System.out.println("||   [1] - Nombres    ||");
            System.out.println("|| [2] - Enfermedad   ||");
            System.out.println("|| [3] - N° de cuarto ||");
            System.out.println("|| [4] - RETORNAR     ||");
            System.out.println("||====================||");
            //SOLICITAR OPCIÓN
            System.out.print("INGRESE OPCIÓN =>");
            OpPaci = sc.nextInt();
            switch (OpPaci){
                case 1:
                    for (int i = 0;i < Paci.length; i++) {
                        System.out.println("Nombre del Paciente: ["+Paci[i]+"]");
                    }
                    break;
                case 2:
                    for (int i = 0;i < Enfer.length; i++) {
                        System.out.println("Enfermedad del Paciente: ["+Enfer[i]+"]");
                    }
                    break;
                case 3:
                    for (int i = 0;i < Habit.length; i++) {
                        System.out.println("N° de piso: ["+Habit[i]+"]");
                    }
                    break;
                case 4:
                    salir = 1;
            }
        }while(salir != 1);
    }
}
