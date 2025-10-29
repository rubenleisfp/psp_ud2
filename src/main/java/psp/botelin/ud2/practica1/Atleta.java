package psp.botelin.ud2.practica1;

import java.util.Random;

public class Atleta implements Runnable {

    private String nombre;

    public Atleta(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public void run() {
        Random rand = new Random();

        for (int km = 1; km <=30 ; km++) {
            int tiempo = rand.nextInt(1000);
            try {
                Thread.sleep(tiempo);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            System.out.println(nombre + " está en el km: " + km);
        }
        System.out.println("Carrera finalizada por: " + nombre);

    }
}

