package psp.ud2_2_1.hilos.herencia.propiedades;

public class MiHilo extends Thread {

    private String name;
    private int duration;

    public MiHilo(String name,int duration) {
        this.name = name;
        this.duration = duration;
    }

    public void run() {
        System.out.println(name + " - " + "Ejecutando hilo");
        try {
            System.out.println(duration + " - " + "Duracion tarea");
            Thread.sleep(duration); //Paro el hilo un tiempo para simular una tarea
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        System.out.println(name + " - " + "Finalizado hilo");
    }


}