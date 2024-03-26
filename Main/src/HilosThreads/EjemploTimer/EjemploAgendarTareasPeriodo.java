package HilosThreads.EjemploTimer;

import java.awt.*;
import java.util.Date;
import java.util.Timer;
import java.util.TimerTask;
import java.util.concurrent.atomic.AtomicInteger;

public class EjemploAgendarTareasPeriodo {
    public static void main(String[] args) {

        //Implementar sonido de alerta
        Toolkit toolkit = Toolkit.getDefaultToolkit();

        //Permite implementar números dentro del timer que no pertenecen al método
        AtomicInteger contadorAtomic = new AtomicInteger(3);

        //Importamos Timer de java.util para implementar temporizadores
        Timer timer = new Timer();

        timer.schedule(new TimerTask() {
            //int contador = 3;
            @Override
            public void run() {
                int i = contadorAtomic.getAndDecrement();
                if(i > 0){
                    toolkit.beep(); //reproduce el alert d windows
                    System.out.println("Tarea periódica "+i+" en : "
                            + new Date()
                            + " nombre del Thread : "
                            + Thread.currentThread().getName());
                    //contador--;
                }else{
                    System.out.println("Finaliza el tiempo de la Tarea o Hilo");
                    timer.cancel();
                }



            }
        },0,2000);

        System.out.println("Agendamos una tarea para que se repita cada 2 segundos mas ...");
    }
}
