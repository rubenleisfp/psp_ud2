package psp.ud2_2_6.cola.productor_consumidor;

class Consumidor extends Thread {
    private Buffer buffer;

    public Consumidor(Buffer buffer) {
        this.buffer = buffer;
    }

    @Override
    public void run() {
        while (true) {
            try {
                buffer.consumir();  // Consumir un valor
                Thread.sleep(1000);  // Simular el tiempo de consumo
            } catch (InterruptedException e) {
                System.err.println(e.getMessage());
            }
        }
    }
}