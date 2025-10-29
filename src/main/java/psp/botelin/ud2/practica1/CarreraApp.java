package psp.botelin.ud2.practica1;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class CarreraApp extends Thread {



    public static void main(String[] args) {

        Scanner dato = new Scanner(System.in);
        String numeroAtletasString = dato.next();
        int numeroAtletas = Integer.parseInt(numeroAtletasString);

        List<Thread> atletas = new ArrayList<>();
        for (int i = 0; i < numeroAtletas; i++) {
            System.out.println("Ingrese el nombre del  atleta :" + i);
            String nombre = dato.next();
            Runnable atleta = new Atleta(nombre);
            Thread threadAtleta = new Thread(atleta);
            atletas.add(threadAtleta);
        }

        for (Thread atleta : atletas) {
            atleta.start();
        }
        for (Thread atleta : atletas) {
            try {
                atleta.join();
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }



        System.out.println("Carrera finalizada");
    }


}