package FUNCIONES.Introduccion;

import FUNCIONES.Introduccion.MutablePersona;

import java.util.*;

public class Principal {
    public static void main(String[] args) {
        List<String> emails = new ArrayList<>();
        emails.add("diego.haa@gmial.com");

        MutablePersona usuario = new MutablePersona();
        usuario.setEmails(emails);
        usuario.setNombre("Diego");
        usuario.setApellido("Román");

        //UN POCO SOBRE LOS PELIGROS DE UNA CLASE MUTABLE
        System.out.println(usuario);
        emails.clear();
        emails.add("diego.roman@gmail.com");
        emails.add("roman.haa31@gmial.com");
        usuario.setEmails(emails);
        System.out.println(usuario);
    }
}
