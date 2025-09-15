package psp.ud2_2_1.hilos.runnable;


public class ThreadApp {

    public static void main(String[] args) throws InterruptedException {
        Runnable runnable1 = new MiHilo();
        Thread thread1 = new Thread(runnable1);
        thread1.start();

        Runnable runnable2 = new MiHilo();
        Thread thread2 = new Thread(runnable2);
        thread2.start();

        System.out.println("Done!");

    }
}
