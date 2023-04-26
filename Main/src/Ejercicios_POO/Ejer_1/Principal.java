package Ejercicios_POO.Ejer_1;
import java.util.*;
/*ENUNCIADO
* Ejercicio 3: Construir un programa que dada una
* serie de vehículos caracterizados por su marca,
* modelo y precio, imprima las propiedades del vehículo
* más barato. Para ello, se deberán leer por teclado las
* características de cada vehículo y crear una clase que
* represente a cada uno de ellos.*/
public class Principal {
    public static void main(String[] args) {
        //Importamos paquete Scanner
        Scanner sc = new Scanner(System.in);
        //Atributos vehiculo
        String modelo,tipo;
        double precio;
        int cantidad = 0, barato = 0;
        //SOLICITAMOS
        System.out.println("Ingrese cantidad de autos a registrar");
        cantidad = sc.nextInt();
        //Creamos un arreglo como objeto de la clase Vehículo
        Vehiculo auto[] = new Vehiculo[cantidad];
        //Creamos un bucle para registrar los vehículos en el arreglo
        for (int i = 0; i < auto.length; i++) {
            //pedimos los datos del vehículo
            //agregamos el objeto de Scanner para que nos cre una interacion
            //Para poder iterar con el siguiente mensaje
            sc.nextLine();
            System.out.println("||====================["+(i+1)+"]==============||");
            System.out.print("|| Ingrese marca de vehiculo => ");
            modelo = sc.nextLine();
            System.out.print("|| Ingrese modelo del vehículo => ");
            tipo = sc.nextLine();
            System.out.print("|| Ingrese precio del vehiculo => ");
            precio = sc.nextDouble();
            //los datos registrados por consola enviar al arreglo
            auto[i] = new Vehiculo(modelo,tipo,precio);
        }
        //Ahora capturaremos la posición del vehículo más barato
        barato = IndicadorVehiculo(auto);
        //Una vez capturada la posición solo mostraremos los datos
        //en la posición capturada
        System.out.println("||=======VEHÍCULO BARATO==============||");
        System.out.println(auto[barato].DatosVehiculo());

    }
    //Creamos un método re recibira como parametro el arreglo
    public static int IndicadorVehiculo( Vehiculo auto[]){
        //atributo que capture precio y posición
        int posicion = 0;
        double precio = 0;
        //Capturamos el precio
        precio = auto[0].getPrecio();
        //Bucle para evaluar al menor precio
        for (int i = 0; i < auto.length; i++) {
            //condición para evaluar
            if(auto[i].getPrecio() < precio){
                // de ser verdad se captura el menor precio
                precio = auto[i].getPrecio(); //se captura el nuevo precio menor
                posicion = i; //capturar la posicion
            }
        }
        return posicion;
    }
}
