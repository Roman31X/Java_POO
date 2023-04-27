package Proy_Hospital.Capa_1;

import Proy_Hospital.Capa_2.Doctor;
import Proy_Hospital.Capa_2.Paciente;
import Proy_Hospital.Capa_2.Usuario;

public class Principal {
    public static void main(String[] args) {
        //Objeti para Doctor
        Usuario user = new Doctor("Diego","die.haa65@gmail.com");
        user.Trabajador();
        //Objeto para paciente
        Usuario userpa = new Paciente("Carlos","carlo.haa@gmail.com");
        userpa.Trabajador();
    }
}
