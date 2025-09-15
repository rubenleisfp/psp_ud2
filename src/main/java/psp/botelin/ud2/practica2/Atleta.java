package psp.botelin.ud2.practica2;

import java.util.Random;

public class Atleta implements Runnable {

    private String nombre;
    private int kmMax;

    public Atleta(String nombre, int kmMax) {
        this.nombre = nombre;
        this.kmMax = kmMax;
    }

    @Override
    public void run() {
        Random rand = new Random();
        for (int km = 1; km <= kmMax; km++) {
            int rand_int1 = rand.nextInt(1000);
            try {

                Thread.sleep(rand_int1);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            System.out.println(nombre + " está en el " +  km + " km");

        }

        System.out.println("Carrera finalizada por: " + nombre);

    }
}

