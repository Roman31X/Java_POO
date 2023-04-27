package Proy_Hospital.Capa_1;
import java.util.*;
public class MenuDoctor {
    public static void DoctorMenu(){
        //importamos scanner para registrar la respuesta
        Scanner sc = new Scanner(System.in);
        int respuesta = 0;
        do{
            System.out.println("||  BIENVENIDO DOCTOR  ||");
            System.out.println("|| Bienvenido: ["+Menu_Interfas.logindoc+"]");
            System.out.println("|| [1] - Agendar Hora");
            System.out.println("|| [2] - Cronograma Mes");
            System.out.println("|| [0] - REGRESAR AL MENÚ");
            respuesta = sc.nextInt();
            //Una vez capturada evaluación que opción tomara
            switch(respuesta){
                case 1:
                    break;
                case 2:
                    break;
                case 0:
                    break;
            }


        }while(respuesta != 0);

    }
    //método privado para mostrar meses
    private static void SelecionMes(){
        Scanner sc = new Scanner(System.in);
        int respuesta = 0;
        do{
            System.out.println("||==========SLECCION MES==========||");
            //para la prueba solo usaremos los tres primeros meses
            for (int i = 0; i < 3; i++) {
                //atributo o contador para indicar el mes
                int j = i + 1;
                System.out.println("||  ["+j+"] - "+Menu_Interfas.mes[i]);
            }
            System.out.println("||  [0] - retornar");
            //solicitamos la respuesta
            respuesta = sc.nextInt();
            //evaluaremos que tome solo la tres opciones mostradas
            if(respuesta > 0 && respuesta < 4){
                //las opciones son 1 - 2 - 3
                int selec = respuesta; // variable auxiliar para verificar el mes
                System.out.println("|| La opción es ["+selec+"] - ["+Menu_Interfas.mes[selec]+"]");
                System.out.println("|| Inserte la fecha disponible => formato [dd/mm/yyyy]");
                String fecha = sc.nextLine();
                //enviaremos un mensaje para verificar si es correcto la fecha ingresada
                System.out.println("|| La fecha ingresada es: ["+fecha+"]\n"+
                                   "|| [1] - CORRECTO\n"+
                                   "|| [2] - CAMBIAR FECHA\n");
                //selección de opción
            } else if (respuesta != 0) {
                DoctorMenu();
            }

        }while(respuesta != 0);
    }
}
