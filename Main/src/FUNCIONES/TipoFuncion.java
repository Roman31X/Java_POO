package FUNCIONES;

public class TipoFuncion {
    /**
     * A las funciones que no son puras se les conoce como funciones
     * impuras las reglas dictan que:
     * ||   FUNCION  ||  PUEDE INVOCAR : PURA ||  PUEDE INVOCAR IMPURA  ||
     * ||   PURA     ||          SI           ||          NO            ||
     * ||   IMPURA   ||          SI           ||          SI            ||
     */

    //EFECTO SECUNDARIO
    /**
     * Todo cambio observado desde fuera del sistema es un efecto secundario
     * POR EJEMPLO: una función que realice cambios de color o tamaño de un objeto
     * #debemos reducir / controlar cunado suceden
     * #debemos evitar los efectos secundarios
     * #los eventos secundarios son inevitables
     * */

    //FUNCIÓN DE ORDEN MAYOR
    /**
     * Una duncion de orden mayor cumple al menos con una estas características
     * #Toma otra función como parámetro
     * #Retorna una función como resultado
     * */

    //FUNCIONES LAMBDA
    /**
     * Las lambdas son conocidas como funciones anonimas
     *¿POR QUE USARLAS?
     * #Es un comportamiento de uso unico
     * #Una regla que solo se requiere en un lugar
     * #Es una función extremadamente simple
     * */

    //INMUTABILIDAD
    /**
     * INMUTABLES - VENTAJAS
     * #Una vez creado no se puede alterar
     * #Facilita crear funciones puras
     * #Facilitar usar threads/concurrencia
     *
     * INMUTABLES - DESVENTAJAS
     * #Nueva instancia por cada set de modificaciones
     * #Requiere especial atención al diseño
     * #Objetivo mutable fuera de nuestro alcance
     * */

    //MUTABLE
    /**
     *
     *
     *
     * */
    public static void main(String[] args) {

    }
}
