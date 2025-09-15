package psp.botelin.ud2.practica2;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class CarreraApp extends Thread {

    public static void main(String[] args) {
        Scanner dato = new Scanner(System.in);

        System.out.println("Ingrese el numero de kms de la carrera");
        int numKms = dato.nextInt();
        dato.nextLine();
        System.out.println("Ingrese el numero de paricipantes de la carrera");
        int numParticipantes = dato.nextInt();
        dato.nextLine();

        List<Thread> atletaList = new ArrayList<>();
        int i=0;
        while (i<numParticipantes) {
            System.out.println("Ingrese el nombre del primer atleta :" + i);
            String nombre = dato.next();
            Runnable atleta = new Atleta(nombre, numKms);
            Thread thread1 = new Thread(atleta);
            atletaList.add(thread1);
            i++;
        }

        for (Thread thread: atletaList) {
            thread.start();
        }

        for (Thread thread: atletaList) {
            try {
                thread.join();
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }

        System.out.println("Carrera finalizada!");
    }


}