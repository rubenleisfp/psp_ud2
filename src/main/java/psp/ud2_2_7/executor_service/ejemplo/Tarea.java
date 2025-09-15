package psp.ud2_2_7.executor_service.ejemplo;

class Tarea implements Runnable {
    @Override
    public void run() {
        System.out.println("Ejecutando la tarea en el hilo: " + Thread.currentThread().getName());
    }
}
