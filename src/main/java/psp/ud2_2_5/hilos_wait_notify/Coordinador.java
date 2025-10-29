package psp.ud2_2_5.hilos_wait_notify;

class Coordinador {


    // Método para esperar hasta que el segundo hilo despierte al primero
    public synchronized void esperar() throws InterruptedException {
        //while (!despierto) {
            System.out.println("Primer hilo: Esperando a ser despertado");
            wait();
        //}
        System.out.println("Primer hilo: he sido despertado! que ben se esta na cama");

    }

    // Método para despertar al primer hilo
    public synchronized void despertar() {

        System.out.println("Segundo hilo: Despertando al primer hilo que es un perezoso");
        notify();
    }
}
