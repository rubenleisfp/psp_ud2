package psp.botelin.ud2.practica1;

import java.util.Scanner;

public class CarreraApp extends Thread {



    public static void main(String[] args) {
        Scanner dato = new Scanner(System.in);
        System.out.println("Ingrese el nombre del primer atleta :");
        String nombre1 = dato.next();
        System.out.println("Ingrese el nombre del segundo atleta :");
        String nombre2 = dato.next();

        Runnable atleta1 = new Atleta(nombre1);
        Runnable atleta2 = new Atleta(nombre2);
        Thread thread1 = new Thread(atleta1);
        Thread thread2 = new Thread(atleta2);

        thread1.start();
        thread2.start();

        try {
            thread1.join();
            thread2.join();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        System.out.println("Carrera finalizada!");
    }


}