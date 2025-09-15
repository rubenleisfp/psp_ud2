package psp.ud2_2_3.recursos_compartidos;

public class AppDemo {

    public static void main(String [] args) throws InterruptedException {

            Counter counter = new Counter();

            ThreadDemo t1 = new ThreadDemo(counter);
            ThreadDemo t2 = new ThreadDemo(counter);

            t1.start();
            t2.start();

            t1.join(); // Esperar a que los hilos terminen
            t2.join();

            System.out.println("Valor final del contador: " + counter.getCount());

    }
}
