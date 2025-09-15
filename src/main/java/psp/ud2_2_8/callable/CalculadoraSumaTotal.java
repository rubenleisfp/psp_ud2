package psp.ud2_2_8.callable;



import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.concurrent.*;

public class CalculadoraSumaTotal {


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Indique el valor minimo del rango: ");
        String rangoMinimoStr = sc.nextLine();
        int rangoMinimo = Integer.parseInt(rangoMinimoStr);
        System.out.println("Indique el valor maximo del rango: ");
        String rangoMaximoStr = sc.nextLine();
        int rangoMaximo = Integer.parseInt(rangoMaximoStr);
        System.out.println("Indique el numero de hilos del proceso: ");
        String numHilosStr = sc.nextLine();
        int numHilos = Integer.parseInt(numHilosStr);

        throw new UnsupportedOperationException("A completar por el alumno");
    }
}
