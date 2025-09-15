package psp.botelin.ud2.practica5;

public class Coche extends Thread {
    private Semaforo semaforo;

    public Coche(Semaforo semaforo) {
        this.semaforo = semaforo;
    }

    @Override
    public void run() {
        throw new UnsupportedOperationException("A implementar por el alummno");
    }
}
