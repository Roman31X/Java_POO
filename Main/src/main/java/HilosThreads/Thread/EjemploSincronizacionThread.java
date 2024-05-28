package HilosThreads.Thread;

import HilosThreads.Runnable.ImprimirFrases;

public class EjemploSincronizacionThread {
    public static void main(String[] args) throws InterruptedException {
        new Thread(new ImprimirFrases("Hola", "¡Bienvenido!")).start();
        new Thread(new ImprimirFrases("Quien eres","Como llegaste aquí")).start();

        Thread.sleep(100);
        Thread h3 = new Thread(new ImprimirFrases("Muchas", "Gracias amigo!"));
        h3.start();
        Thread.sleep(100);
        System.out.println(h3.getState());
    }

    //implementamos el prefijo de synchronized para que entre en orden de uso
    public synchronized static void imprimirFrases(String frase1, String frase2){
        System.out.println(frase1);

        try {
            Thread.sleep(500);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        System.out.println(frase2);
    }
}
