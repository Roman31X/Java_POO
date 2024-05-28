package Encapsulamieto_Construptor;


public class Main_Constructor {
    public static void main(String[] args) {
        /*
        //creamos un objeto
         * Declaramos primero al módulo [Doctor] para
         * después declara el objeto [doc]
         * */
        Doctor doc = new Doctor("U172036","Diego Roman","Desarrollador Junior");
        //le dare valores a las variables de la clase
        doc.setNombre("Escorpio");
        System.out.println(doc.getNombre());
        System.out.println("[=====================================]");
        /*CUANDO HAY SOBRE CARGA DE CONSTRUCTORES
        * NIVELES DE ACCESO
        * MODIFICADORES - CLASE - PACKAGE - SUBCLASE - OTROS
        *   public      -   si  -   si    -     si   -   si
        *   protected   -   si  -   si    -     si   -   no
        *   default     -   si  -   si    -     no   -   no
        *   private     -   si  -   no    -     no   -   no
        * ++++++++++++++++++++++++++++++++++++++++++++++++++++*/

    }
}
