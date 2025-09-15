package psp.botelin.ud2.practica4;

public class SalaEstudio {
    // Método sincronizado para usar el computador
    public synchronized void usarComputador(String estudiante) {
        System.out.println(estudiante + " está utilizando el computador.");
        try {
            // Simula el uso del computador por 2 segundos
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            System.out.println(e.getMessage());
        }
        System.out.println(estudiante + " ha terminado de usar el computador.");
    }
}