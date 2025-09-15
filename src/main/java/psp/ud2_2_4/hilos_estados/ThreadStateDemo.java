package psp.ud2_2_4.hilos_estados;

class ThreadStateDemo extends Thread {
    public void run() {
        System.out.println(Thread.currentThread().getName() + " en ejecución.");
    }

    public static void main(String[] args) throws InterruptedException {
        ThreadStateDemo thread = new ThreadStateDemo();
        System.out.println("Estado del hilo (antes de start): " + thread.getState());

        thread.start(); // Iniciar el hilo
        System.out.println("Estado del hilo (después de start): " + thread.getState());

        thread.join(); // Esperar a que termine el hilo
        System.out.println("Estado del hilo (después de join): " + thread.getState());
    }
}
