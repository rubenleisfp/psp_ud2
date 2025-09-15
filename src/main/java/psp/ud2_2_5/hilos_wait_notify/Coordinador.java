package psp.ud2_2_5.hilos_wait_notify;

class Coordinador {
    private boolean despertado = false;

    // Método para esperar hasta que el segundo hilo despierte al primero
    public synchronized void esperar() throws InterruptedException {
        throw new UnsupportedOperationException("A implementar por el alummno");
    }

    // Método para despertar al primer hilo
    public synchronized void despertar() {
        throw new UnsupportedOperationException("A implementar por el alummno");
    }
}
