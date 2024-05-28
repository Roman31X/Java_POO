package Proy_Hospital.Capa_1;
import Proy_Hospital.Capa_2.Doctor;

import java.util.*;
public class MenuPaciente {
    public static void PacienteMenu(){
        Scanner sc = new Scanner(System.in);
        int respuesta = 0;
        do{
            System.out.println("||===========================||");
            System.out.println("|| Paciente : [ "+Menu_Interfas.loginpaci.getNombre()+" ]");
            System.out.println("|| [1] - AGENDAR CITA");
            System.out.println("|| [2] - MI CITAS");
            System.out.println("|| [0] - RETORNAR");
            System.out.print("Ingrese N° : ");
            //leer respuesta
            respuesta = sc.nextInt();
            switch(respuesta){
                case 1:
                    MenuPaciente();
                    break;
                case 2:
                    ImprimirCitas();
                    break;
                case 0:
                    Menu_Interfas.Menu();
                    break;
            }


        }while(respuesta !=0 );
    }
    //método con opciones para el paciente
    private static void MenuPaciente(){
        int respuesta = 0;
        do{
            System.out.println("||=========PACIENTE===========||");
            System.out.println("|| SELECCIONE UN MES DEL MENU ||");
            //creamos un arraylist para almacenar las fechas
            //Numeración de la lista de fechas
            //Indice fechas seleccionadas
            //Doctores
            //1.- Doctor [1]
                // - 1 Fecha1
                // - 1 Fecha2
                // - 1 Fecha3
            //1.- Doctor [1]
            //1.- Doctor [1]
            //Arraylist bidimencional
            Map<Integer,Map<Integer, Doctor>> doctores = new TreeMap<>();
            int k = 0;
            for (int i = 0; i < MenuDoctor.CitasDoctor.size(); i++) {
                ArrayList<Doctor.CitasDoctor> CitasDoctor = MenuDoctor.CitasDoctor.get(i).getFechas();
                Map<Integer, Doctor> Doctorcita = new TreeMap<>();

                for (int j = 0; j < CitasDoctor.size(); j++) {
                    k++;
                    System.out.println("    [ "+k+" ] "+ Menu_Interfas.mes[j]);
                    Doctorcita.put(Integer.valueOf(j),MenuDoctor.CitasDoctor.get(i));
                    doctores.put(Integer.valueOf(k),Doctorcita);
                }
            }
            Scanner sc = new Scanner(System.in);
            System.out.print("Ingrese Numero : ");
            int respuestafecha = Integer.valueOf(sc.nextLine());
            Map<Integer, Doctor> Citaseleccion = doctores.get(respuestafecha);
            Integer datofecha = 0;
            Doctor doctorelegido = new Doctor("","");

            for(Map.Entry<Integer, Doctor> doc : Citaseleccion.entrySet()){
                datofecha = doc.getKey();
                doctorelegido = doc.getValue();
            }
            System.out.println(" Doctor disponible : [ "+doctorelegido.getNombre()+" ] elegiste este doctor");
            System.out.println(" [ "+doctorelegido.getFechas().get(datofecha).getDate()+" ] la fecha es correcta");
            System.out.println(" [ "+doctorelegido.getFechas().get(datofecha).getTime()+" ] la hora disponible es");
            System.out.println(" Los datos mostrados son correctos: ");
            System.out.println("[==============================================]");
            System.out.println("|| [1] - Correcto ");
            System.out.println("|| [2] - Cambiar ");
            System.out.println("|| [0] - Regresar ");
            System.out.println(" Ingrese N° : ");
            respuesta = Integer.valueOf(sc.nextLine());
            if(respuesta == 1){
                Menu_Interfas.loginpaci.addCitadoctor(doctorelegido,
                        doctorelegido.getFechas().get(datofecha).getDate(),
                        doctorelegido.getFechas().get(datofecha).getTime());
                MenuPaciente.PacienteMenu();
            }
        }while(respuesta != 0);
    }

    private static void ImprimirCitas(){
        Scanner sc = new Scanner(System.in);
        int respuesta = 0;
        do{
            System.out.println("|| Verificar si tiene citas disponibles ||");
            if(Menu_Interfas.loginpaci.getCitadoctor().size() == 0 ){
                System.out.println("Usted no cuenta con citas disponibles. Gracias!!");
                break;
            }
            for (int i = 0; i < Menu_Interfas.loginpaci.getCitadoctor().size(); i++) {
                int j = i + 1;
                System.out.println("|| [ "+j+" ] en la fecha [ "+
                        Menu_Interfas.loginpaci.getCitadoctor().get(i).getFecha()+" ] en la hora [ "+
                        Menu_Interfas.loginpaci.getCitadoctor().get(i).getHora()+ " ] con el doctor [ "+
                        Menu_Interfas.loginpaci.getCitadoctor().get(i).getDoct().getNombre()+ " ] ");
            }
            System.out.println("|| [0] - REGRESAR ");
            respuesta = sc.nextInt();

        }while(respuesta != 0);
    }
}
