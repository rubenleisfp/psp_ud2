
package psp.ud2_2_7.executor_service.productor_consumidor;

class Consumidor implements Runnable {
    private Buffer buffer;

    public Consumidor(Buffer buffer) {
        this.buffer = buffer;
    }

    @Override
    public void run() {
        while (true) {
            try {
                buffer.consumir();  // Consumir un valor
                Thread.sleep(2500);  // Simular el tiempo de consumo
            } catch (InterruptedException e) {
                System.err.println(e.getMessage());
                Thread.currentThread().interrupt(); // Restaurar el estado de interrupción
                break;
            }
        }
    }
}
