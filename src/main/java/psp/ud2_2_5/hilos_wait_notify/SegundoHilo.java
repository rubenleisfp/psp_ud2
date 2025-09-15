package psp.ud2_2_5.hilos_wait_notify;

class SegundoHilo extends Thread {
    private Coordinador coordinador;

    public SegundoHilo(Coordinador coordinador) {
        this.coordinador = coordinador;
    }

    public void run() {
        try {
            Thread.sleep(3000);  // Simular un retraso antes de despertar al primer hilo
            coordinador.despertar();  // El segundo hilo despierta al primer hilo
        } catch (InterruptedException e) {
            System.err.println(e.getMessage());
        }
    }
}
