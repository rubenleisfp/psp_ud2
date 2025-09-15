package psp.ud2_2_5.hilos_wait_notify;

public class SincronizacionHilos {
    public static void main(String[] args) {
        Coordinador coordinador = new Coordinador();

        PrimerHilo primerHilo = new PrimerHilo(coordinador);  // Primer hilo que espera
        SegundoHilo segundoHilo = new SegundoHilo(coordinador);  // Segundo hilo que despierta

        primerHilo.start();
        segundoHilo.start();
    }
}
