package psp.ud2_2_1.hilos.herencia.propiedades;

public class MiHilo extends Thread{

    private String name;
    private int duration;

    public MiHilo(String name, int duration) {
        this.name = name;
        this.duration = duration;
    }

    public void run() {

        System.out.println("Soy " + name + " y me estoy ejecutando en mi hilo");
        try {
            Thread.sleep(duration); //Para el hilo un tiempo determinado

        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        System.out.println("Soy " + name + " y mi hilo ha finalizado");

    }
}