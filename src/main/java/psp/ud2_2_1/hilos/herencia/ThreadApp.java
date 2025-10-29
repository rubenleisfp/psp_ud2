package psp.ud2_2_1.hilos.herencia;

public class ThreadApp {

    public static void main (String [] args) throws InterruptedException {
        MiHilo h1 = new MiHilo();
        h1.start();

        for (int i=0;i<4;i++) {
            MiHilo h2 = new MiHilo();
            h2.start();
        }
    }
}
