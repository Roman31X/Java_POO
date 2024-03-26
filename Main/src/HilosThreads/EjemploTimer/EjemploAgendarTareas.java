package HilosThreads.EjemploTimer;

import java.util.Date;
import java.util.Timer;
import java.util.TimerTask;

public class EjemploAgendarTareas {
    public static void main(String[] args) {
        Timer timer = new Timer();

        timer.schedule(new TimerTask() {
            @Override
            public void run() {
                System.out.println("Tarea realizada en : "+new Date()
                        + " nombre del Thread : "+
                        Thread.currentThread().getName());
                System.out.println("Finaliza el tiempo de la Tarea o Hilo");
                timer.cancel();
            }
        },5000);

        System.out.println("Agendamos una tarea para 5 segundos mas ...");
    }
}
