package psp.botelin.ud2.practica5;

public class JuegoSemaforo {
    public static void main(String[] args) {
        Semaforo semaforo = new Semaforo();

        // Crear los hilos
        Coche coche = new Coche(semaforo);
        ControlSemaforo controlSemaforo = new ControlSemaforo(semaforo);

        // Iniciar los hilos
        coche.start();
        controlSemaforo.start();
    }
}
