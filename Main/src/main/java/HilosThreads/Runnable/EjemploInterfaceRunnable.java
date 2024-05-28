package HilosThreads.Runnable;

public class EjemploInterfaceRunnable {
    public static void main(String[] args) {

        //Es aleatorio no hay prioridad de ejecución
        new Thread(new ViajeTarea("Cusco")).start();
        new Thread(new ViajeTarea("Trujillo")).start();
        new Thread(new ViajeTarea("Arequipa")).start();
        new Thread(new ViajeTarea("Cajamarca")).start();
    }
}
