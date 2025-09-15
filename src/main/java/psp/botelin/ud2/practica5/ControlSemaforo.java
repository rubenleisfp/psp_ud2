package psp.botelin.ud2.practica5;

public class ControlSemaforo extends Thread {
    private Semaforo semaforo;

    public ControlSemaforo(Semaforo semaforo) {
        this.semaforo = semaforo;
    }

    @Override
    public void run() {
        throw new UnsupportedOperationException("A implementar por el alummno");
    }
}
