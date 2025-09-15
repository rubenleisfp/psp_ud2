package psp.botelin.ud2.practica3;

public class Impares extends Thread {
    public void run() {
        int n, c = 0;
        int contador = 0;
        for (n = 1; n <= 10; n++) {
            c = n % 2;
            if (c != 0) {
                contador = contador + n;
                System.out.println(" " + n);
            }
        }
        System.out.print("La suma de los impares es : " + contador + "\n");
    }

}