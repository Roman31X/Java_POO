package HilosThreads.EjemploExecutor;

import HilosThreads.EjemploSync.Panaderia;
import HilosThreads.EjemploSync.runnable.Consumidor;
import HilosThreads.EjemploSync.runnable.Panadero;

import java.util.concurrent.*;

public class EjemploExecutorProductoConsumidor {
    public static void main(String[] args) throws InterruptedException, ExecutionException, TimeoutException {

        ThreadPoolExecutor executor = (ThreadPoolExecutor) Executors.newFixedThreadPool(2);

        System.out.println("Tamaño del pool: "+executor.getPoolSize());
        System.out.println("Cantidad de tareas en cola: "+executor.getQueue().size());

        Panaderia p = new Panaderia();
        Runnable productor = new Panadero(p);
        Runnable consumidor = new Consumidor(p);

        Future<?> future1 = executor.submit(productor);
        Future<?> future2 = executor.submit(consumidor);

        System.out.println("Tamño del pool: "+ executor.getPoolSize());
        System.out.println("Contidad de tareas en cola: "+executor.getQueue().size());

        executor.shutdown();
        System.out.println("Continuamos con la ejecución del método main");

    }
}
