package Constructor;


import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //implementar la libreria Scanner
        Scanner sc = new Scanner(System.in);
        //creamos un objeto
        /**
         * Declaramos primero al módulo [Doctor] para
         * después declara el objeto [doc]
         * */
        Doctor doc = new Doctor("U172036","Diego Roman","Desarrollador Junior");
        //le dare valores a las variables de la clase
        doc.nombre = "Escorpio";
    }
}
