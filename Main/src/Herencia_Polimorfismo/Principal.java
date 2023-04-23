package Herencia_Polimorfismo;
public class Principal {
    public static void main(String[] args) {
        //Creamos un OBJETOS PARA CADA CLASE [USUARIO - DOCTOR - PACIENTE]
        //OBJETO DE DOCTOR
        Doctor doc = new Doctor("Pedro","pedro.haa3@gmail.com","Dentista");
        //OBJETO PACIENTE
        Paciente paci = new Paciente("Carlos","car.haa@gmail.com","02-04-2000",1.68,60.3,"Caries");
        //OBJETO USUARIO
        /*Al crear un objeto a la clase padre y enviando valores
        * a través de los parametros ya declarados en el objeto de
        * las clases hijas este sobre escribira los datos enviados antes*/
        Usuario usu = new Usuario("Diego","die.haa31@gmail.com");

        //MOSTRAR atraves de el metodo [toString()]
        System.out.println(usu);
        //mostrar los datos enviados el objeto paciente
        System.out.println(paci);
        System.out.println(doc);
    }
}
