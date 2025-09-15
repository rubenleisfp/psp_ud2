package psp.botelin.ud2.practica5;

public class Coche extends Thread {
    private Semaforo semaforo;

    public Coche(Semaforo semaforo) {
        this.semaforo = semaforo;
    }

    @Override
    public void run() {
        try {
            semaforo.esperarLuzVerde();  // El coche espera a que el semáforo esté en verde
            System.out.println("Coche: ¡Semáforo en verde, avanzando!");
        } catch (InterruptedException e) {
            System.err.println(e.getMessage());
        }
    }
}
