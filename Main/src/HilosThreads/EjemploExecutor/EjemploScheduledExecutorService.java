package HilosThreads.EjemploExecutor;

import java.util.concurrent.*;
import java.util.concurrent.atomic.AtomicInteger;

public class EjemploScheduledExecutorService {
    public static void main(String[] args) throws InterruptedException {

        ScheduledExecutorService executor = Executors.newScheduledThreadPool(2);

        System.out.println("Alguna tarea en el main se esta desarrollando .....");

        AtomicInteger contador = new AtomicInteger(5);
        //CountDownLatch lock = new CountDownLatch(5);
        Future<?> futuro = executor.scheduleAtFixedRate(() ->{
            System.out.println("Hola mundo tarea....");
            try {
                TimeUnit.MILLISECONDS.sleep(1000);
                //lock.countDown();
                contador.getAndDecrement();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

        },1000,2000, TimeUnit.MILLISECONDS);

        //lock.await();
        //futuro.cancel(true);
        //TimeUnit.SECONDS.sleep(10);

        while (contador.get() >= 0){
            if (contador.get() == 0){
                futuro.cancel(true);
                contador.getAndDecrement();
            }
        }

        System.out.println("Alguna otra tarea en el main se esta desarrollando .....");
        executor.shutdown();
    }
}
