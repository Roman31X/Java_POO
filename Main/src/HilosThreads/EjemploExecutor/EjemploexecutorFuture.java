package HilosThreads.EjemploExecutor;

import java.util.concurrent.*;

public class EjemploexecutorFuture {
    public static void main(String[] args) throws InterruptedException, ExecutionException, TimeoutException {

        ExecutorService executor = Executors.newSingleThreadExecutor();

        Runnable tarea = () -> {
            System.out.println("Inicio de la tarea...");
            try {
                System.out.println("Nombre del thread : "
                        +Thread.currentThread().getName());
                TimeUnit.SECONDS.sleep(3);
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
                e.printStackTrace();
            }
            System.out.println("Finaliza la tarea...");
        };
        Future<?> resultado = executor.submit(tarea);
        executor.shutdown();
        System.out.println("Continuamos con la ejecución del método main 1");

        //System.out.println(resultado.isDone());
        while(!resultado.isDone()){
            System.out.println("Ejecutando tarea....");
            TimeUnit.MILLISECONDS.sleep(1500);
        }
        System.out.println(resultado.get(5,TimeUnit.SECONDS));
        System.out.println(resultado.isDone());
        System.out.println("Continuamos....");
//duplicado
        //System.out.println(resultado.isDone());
        while(!resultado.isDone()){
            System.out.println("Ejecutando tarea....");
            TimeUnit.MILLISECONDS.sleep(1500);
        }
        System.out.println(resultado.get(5,TimeUnit.SECONDS));
        System.out.println(resultado.isDone());
        System.out.println("Continuamos....");


    }
}
