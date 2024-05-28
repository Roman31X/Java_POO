package Proy_Hospital.Capa_1;
import Proy_Hospital.Capa_2.Doctor;

import java.util.*;
public class MenuDoctor {
    //declaramos una variable arraylist para las fechas CITAS
    public static ArrayList<Doctor> CitasDoctor = new ArrayList<>();
    public static void DoctorMenu(){
        //importamos scanner para registrar la respuesta
        Scanner sc = new Scanner(System.in);
        int respuesta = 0;
        do{
            System.out.println("||  BIENVENIDO DOCTOR  ||");
            System.out.println("|| Bienvenido: ["+Menu_Interfas.logindoc.getNombre()+"]");
            System.out.println("|| [1] - Agendar Hora");
            System.out.println("|| [2] - Cronograma Mes");
            System.out.println("|| [0] - REGRESAR AL MENÚ");
            System.out.print("|| Ingrese : ");
            respuesta = sc.nextInt();
            //Una vez capturada evaluación que opción tomara
            switch(respuesta){
                case 1:
                    SelecionMes();
                    break;
                case 2:
                    ImprimirCitas();
                    break;
                case 0:
                    Menu_Interfas.Menu();
                    break;
            }


        }while(respuesta != 0);

    }
    //método privado para mostrar meses
    private static void SelecionMes(){
        Scanner sc = new Scanner(System.in);
        int respuesta = 0;
        do{
            System.out.println("||==========SELECCIÓN MES==========||");
            //para la prueba solo usaremos los tres primeros meses
            for (int i = 0; i < 3; i++) {
                //atributo o contador para indicar el mes
                int j = i + 1;
                System.out.println("||  ["+j+"] - "+Menu_Interfas.mes[i]);
            }
            System.out.println("||  [0] - retornar");
            System.out.print("|| Ingresar : ");
            //solicitamos la respuesta
            respuesta = sc.nextInt();
            //evaluaremos que tome solo la tres opciones mostradas
            if(respuesta > 0 && respuesta < 4){
                //las opciones son 1 - 2 - 3
                int selec = respuesta; // variable auxiliar para verificar el mes
                System.out.println("|| La opción es ["+selec+"] - ["+Menu_Interfas.mes[selec-1]+"]");
                System.out.println("|| Inserte la fecha disponible => formato [dd/mm/yyyy]");
                System.out.print("|| Ingrese : ");
                sc.nextLine();
                String fecha = sc.nextLine();
                //enviaremos un mensaje para verificar si es correcto la fecha ingresada
                System.out.println("|| La fecha ingresada es: ["+fecha+"]\n"+
                                   "|| [1] - CORRECTO\n"+
                                   "|| [2] - CAMBIAR FECHA");
                System.out.print("|| Ingrese : ");
                //variable para capturar la opción
                int opcion = sc.nextInt();
                //evaluación de la opción insertada
                //con esta condición y el prefijo *continue* nos permite iniciar
                //nuevamente desde la primera línea donde se muestra la selección del mes
                if(opcion == 2) continue;

                //si la opción ingresada es [1]
                int hora = 0;
                String tiempo = "";
                //evaluaremos con un bucle do while para el registro de la hora
                do{
                    sc.nextLine();
                    //solicitamos la hora
                    System.out.println("Ingrese la Hora disponible en el mes de : [ "+fecha+" ] formato  [12 h]");
                    //capturamos la hora en la variable tiempo
                    tiempo = sc.nextLine();
                    //mostramos un mensaje si la hora ingresa es correcta o se desea cambiar
                    System.out.println("La hora ingresada es : [ "+tiempo+" ]\n" +
                            "|| [1] - CORRECTO\n"+"|| [2] - CAMBIAR FECHA");
                    System.out.print("|| Ingresar : ");
                    hora = sc.nextInt();
                    //una vez se reciba la respuesta de ser uno saldria del bucle
                    //caso contrario se vuelve a repetir hasta que la opción hasta
                    //que la variable hora sea [1]
                }while(hora == 2);
                //enviamos al menu del doctor los datos de fecha y hora
                Menu_Interfas.logindoc.AgregarFecha(fecha,tiempo);
                //pasamos los datos del doctor logeado del menu
                //principal de la interfas
                RevicionCitas(Menu_Interfas.logindoc);
            } else if (respuesta != 0) {
                DoctorMenu();
            }

        }while(respuesta != 0);
    }

    private static void RevicionCitas (Doctor doctor){
        if(doctor.getFechas().size() > 0 && !CitasDoctor.contains(doctor)){
            CitasDoctor.add(doctor);
        }
    }
    private static void ImprimirCitas(){
        if(0 == Menu_Interfas.logindoc.getFechas().size()){
            System.out.println(" USTED NO TIENE CITAS AGENDADAS GRACIAS!!");
        }else{
            System.out.println("||=========DIAS CITAS==========||");
            for (int i = 0; i < Menu_Interfas.logindoc.getFechas().size(); i++) {
                //atributo o contador para indicar el mes
                int j = i + 1;
                System.out.println("|| En el mes : ["+j+"] - [ "+
                        Menu_Interfas.mes[i]+" ] en la fecha : [ "+
                        Menu_Interfas.logindoc.getFechas().get(i).getDate()+" ] - [ "+
                        Menu_Interfas.logindoc.getFechas().get(i).getTime()+" ] hora disponible");
            }
        }
    }
}
