
package psp.ud2_2_7.executor_service.productor_consumidor;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

public class ProductorConsumidor {
    public static void main(String[] args) {
        Buffer buffer = new Buffer(10);  // Tamaño del buffer

        // Crear un pool de hilos con un tamaño fijo
        ExecutorService executor = Executors.newFixedThreadPool(2);  // Un hilo para productor y otro para consumidor

        // Ejecutar productores y consumidores
        executor.submit(new Productor(buffer));
        executor.submit(new Consumidor(buffer));

        // Cerrar el executor después de un tiempo de ejecución
        try {
            Thread.sleep(10000);  // Dejar que el programa corra durante 10 segundos
        } catch (InterruptedException e) {
            System.err.println(e.getMessage());
        }

        executor.shutdown();  // Apagar el ExecutorService

        try {
            if (!executor.awaitTermination(5, TimeUnit.SECONDS)) {
                executor.shutdownNow();  // Forzar la terminación si no se completa en 5 segundos
            }
        } catch (InterruptedException e) {
            executor.shutdownNow();
        }

        System.out.println("Finalizado");
    }
}
