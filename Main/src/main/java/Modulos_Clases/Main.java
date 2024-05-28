package Modulos_Clases;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        //implementar la libreria Scanner
        Scanner sc = new Scanner(System.in);
        //creamos un objeto
        /**
         * Declaramos primero al módulo [Doctor] para
         * después declara el objeto [doc]
         * */
        Doctor doc = new Doctor();
        //le dare valores a las variables de la clase
        doc.nombre = "Diego Roman";
        doc.Nombre();
    }
}
