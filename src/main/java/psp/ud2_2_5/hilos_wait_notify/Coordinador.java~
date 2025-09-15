package psp.ud2_2_5.hilos_wait_notify;

class Coordinador {
    private boolean despertado = false;

    // Método para esperar hasta que el segundo hilo despierte al primero
    public synchronized void esperar() throws InterruptedException {
        while (!despertado) {
            System.out.println("Primer hilo: Esperando a ser despertado...");
            wait();  // El hilo se pone en espera
        }
        System.out.println("Primer hilo: He sido despertado, ¡continuando!");
    }

    // Método para despertar al primer hilo
    public synchronized void despertar() {
        despertado = true;
        System.out.println("Segundo hilo: ¡Despertando al primer hilo!");
        notify();  // Despertar al hilo que está esperando
    }
}
