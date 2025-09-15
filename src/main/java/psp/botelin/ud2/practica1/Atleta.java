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

        //Recorre 30 kms
        for (int km = 1; km <= 30; km++) {
            //En cada km, se genera un aleatorio entre 0 y 1000ms
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

