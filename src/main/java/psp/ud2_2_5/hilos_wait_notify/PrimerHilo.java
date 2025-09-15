package psp.ud2_2_5.hilos_wait_notify;

class PrimerHilo extends Thread {
    private Coordinador coordinador;

    public PrimerHilo(Coordinador coordinador) {
        this.coordinador = coordinador;
    }

    public void run() {
        try {
            coordinador.esperar();  // El primer hilo espera hasta ser despertado
        } catch (InterruptedException e) {
            System.err.println(e.getMessage());
        }
    }
}
