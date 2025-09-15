package psp.ud2_2_7.executor_service.productor_consumidor;

import java.util.LinkedList;
import java.util.Queue;

class Buffer {
    private Queue<Integer> cola = new LinkedList<>();
    private int capacidad;

    // Constructor para inicializar el tamaño del buffer
    public Buffer(int capacidad) {
        this.capacidad = capacidad;
    }

    // Método sincronizado para producir elementos en el buffer
    public synchronized void producir(int valor) throws InterruptedException {
        // Si el buffer está lleno, esperar hasta que haya espacio

        while (cola.size() == capacidad) {
            System.out.println("Buffer lleno. Productor esperando...");
            wait();
        }

        // Agregar el valor al buffer y notificar a los consumidores
        cola.add(valor);
        System.out.println("Productor produjo: " + valor);
        System.out.println("Tamaño buffer:" + cola.size());

        notifyAll();  // Notificar a los consumidores que hay un nuevo elemento
    }

    // Método sincronizado para consumir elementos del buffer
    public synchronized int consumir() throws InterruptedException {
        // Si el buffer está vacío, esperar hasta que haya elementos
        while (cola.isEmpty()) {
            System.out.println("Buffer vacío. Consumidor esperando...");
            wait();
        }

        // Consumir el valor del buffer y notificar a los productores
        int valor = cola.poll();
        System.out.println("Consumidor consumió: " + valor);
        System.out.println("Tamaño buffer:" + cola.size());
        notifyAll();  // Notificar a los productores que hay espacio disponible
        return valor;
    }
}