package psp.ud2_2_1.hilos.runnable.propiedades;




public class ThreadApp {

    public static void main(String[] args) throws InterruptedException {
        Runnable h1 = new MiHilo("Alejandro",3000);
        Thread thread1 = new Thread(h1);
        thread1.start();


        Runnable h2 = new MiHilo("Ricardo",7000);
        Thread thread2 = new Thread(h2);
        thread2.start();

        thread1.join();
        thread2.join();

        System.out.println("Soy el hilo principal");
    }
}
