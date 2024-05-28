package HilosThreads.EjemploSync;

import HilosThreads.EjemploSync.runnable.Consumidor;
import HilosThreads.EjemploSync.runnable.Panadero;

public class EjemploProductoConsumidor {
    public static void main(String[] args) {
        Panaderia p = new Panaderia();
        new Thread(new Panadero(p)).start();
        new Thread(new Consumidor(p)).start();
    }
}
