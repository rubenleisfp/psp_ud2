package psp.botelin.ud2.practica5;

public class Semaforo {
    private boolean enVerde = false;  // Estado inicial del semáforo (rojo)

    // Método sincronizado para que el coche espere hasta que el semáforo esté en verde
    public synchronized void esperarLuzVerde() throws InterruptedException {
        while (!enVerde) {  // Mientras el semáforo no esté en verde, espera
            System.out.println("Coche: Semáforo en rojo, esperando...");
            wait();  // El coche espera hasta que sea notificado
        }
    }

    // Método sincronizado para cambiar el semáforo a verde y notificar a los coches
    public synchronized void cambiarALuzVerde() {
        enVerde = true;  // Cambia el estado a verde
        System.out.println("Semáforo: ¡Cambio a luz verde!");
        notifyAll();  // Notifica a todos los coches que están esperando
    }
}
