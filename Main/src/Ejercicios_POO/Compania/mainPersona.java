package Ejercicios_POO.Compania;

public class mainPersona {
    public static void main(String[] args) {

        //Ejemplo de CLIENTE
        Cliente clinete1 = new Cliente("Daniel","Cavero","102510","Av. Caleta",1);
        System.out.println("|+++++++++++++++++++++++++++++++++|");
        System.out.println(clinete1.toString());
        System.out.println("|+++++++++++++++++++++++++++++++++|");
        //Ejemplo de EMPLEADO
        Empleado empleado1 = new Empleado("Diego","Roman","984620","Av. Panamericana",2500.00,2);
        System.out.println(empleado1.toString());
        System.out.println("|+++++++++++++++++++++++++++++++++|");
        //Ejemplo de Gerente
        Gerente gerente1 = new Gerente("Renne","Magallanes","525212","Av. Marical",3500.00,05,5000.00);
        System.out.println(gerente1.toString());
        System.out.println("|+++++++++++++++++++++++++++++++++|");
    }
}
