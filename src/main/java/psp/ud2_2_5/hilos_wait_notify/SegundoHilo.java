package psp.ud2_2_5.hilos_wait_notify;

class SegundoHilo extends Thread {
    private Coordinador coordinador;

    public SegundoHilo(Coordinador coordinador) {

        this.coordinador = coordinador;
    }

    public void run() {
        try {
            Thread.sleep(3000);
            coordinador.despertar();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }


    }
}
