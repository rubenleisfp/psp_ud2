package psp.ud2_2_1.hilos.herencia.propiedades;


import java.sql.SQLOutput;

public class ThreadApp {

    public static void main (String [] args) throws InterruptedException {
        MiHilo h1 = new MiHilo("Marian",5000);
        h1.start();
        Thread.sleep(1);
        System.out.println("Hilo principal");
    }
}
