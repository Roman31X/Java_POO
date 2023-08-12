package FUNCIONES.Modulo1;

import java.util.function.Consumer;
import java.util.function.Supplier;

public class CLIArgumetosUtiles {
    static void recividoAyuda(CLIArgumentos cliargumentos){
        Consumer<CLIArgumentos> validacionAyuda = cliArgumentos -> {
            if(cliArgumentos.isAyuda()){
                System.out.println("Mostrar manuala de ayuda solicitado");
            }
        };
        validacionAyuda.accept(cliargumentos);
    }
    static CLIArgumentos generarCLI(){
        Supplier<CLIArgumentos> generador = () -> new CLIArgumentos();
        return generador.get();
    }
}
