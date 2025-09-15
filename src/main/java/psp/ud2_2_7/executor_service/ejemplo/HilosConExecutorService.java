package psp.ud2_2_7.executor_service.ejemplo;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class HilosConExecutorService {
    public static void main(String[] args) {
        // Crear un pool de 3 hilos
        ExecutorService executorService = Executors.newFixedThreadPool(3);

        // Enviar 5 tareas al ExecutorService
        for (int i = 0; i < 5; i++) {
            executorService.submit(new Tarea());
        }

        // Finalizar el ExecutorService de manera controlada
        executorService.shutdown();
    }
}
