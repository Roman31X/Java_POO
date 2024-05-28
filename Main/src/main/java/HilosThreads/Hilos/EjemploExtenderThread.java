package HilosThreads.Hilos;

import HilosThreads.Thread.NombreThread;

public class EjemploExtenderThread {
    public static void main(String[] args) throws InterruptedException {
        Thread hilo = new NombreThread("Jhon With");
        hilo.start();
        //Thread.sleep(1000); //Para agregar pausas en el método main

        Thread hilo2 = new NombreThread("Sofia Bulka");
        hilo2.start();

        NombreThread hilo3 = new NombreThread("Rimuru Tempes");
        hilo3.start();
        System.out.println(hilo.getState());
    }
}
