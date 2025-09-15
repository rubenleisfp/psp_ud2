package psp.ud2_2_1.hilos.herencia;

public class ThreadApp {

    public static void main (String [] args) throws InterruptedException {
        MiHilo  miHilo1 = new MiHilo();
        miHilo1.start();

        MiHilo  miHilo2 = new MiHilo();
        miHilo2.start();

    }
}
