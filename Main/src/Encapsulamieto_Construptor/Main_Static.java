package Encapsulamieto_Construptor;
import java.util.*;
public class Main_Static {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        /*
         * IMPLEMENTACIÓN DE LA FUNCIÓN ESTATICA EN
         * VARIABLES Y CLASES
         * [========================================]
         * */
        //Llamar a las clases publicas del Hospital
        //variable para selección de la opción entre
        //DOCTOR Y PACIENTE
        int opcion = 0, salida = 0;
        do{
            System.out.println("BIENVENIDO AL HOSPITAL");
            /*mediante la importación [static] de la
            * Clase HOSPITAL podremos usar sus metodos
            * se mostrará el método llamado Principal()*/
            Hospital.Principal();
            System.out.print("INGRESE OPCIÓN => ");
            opcion = sc.nextInt();
            switch(opcion){
                case 1: Hospital.MenuDoctor(); break;
                case 2: Hospital.MenPaciente();break;
                case 3: salida = 1;
            }
        }while(salida != 1);
    }
}
