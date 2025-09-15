package psp.ud2_2_6.cola.buffer_compartido;

import java.util.LinkedList;
import java.util.Queue;

class Buffer {
    private Queue<Integer> cola = new LinkedList<>();
    private int capacidad;

    public Buffer(int capacidad) {
        this.capacidad = capacidad;
    }

    // Método para agregar un elemento al buffer
    public void agregar(int valor) {
        if (cola.size() < capacidad) {
            cola.add(valor);
            System.out.println("Elemento agregado al buffer: " + valor);
        } else {
            System.out.println("Buffer lleno. No se puede agregar: " + valor);
        }
    }

    // Método para obtener un elemento del buffer
    public Integer obtener() {
        if (!cola.isEmpty()) {
            int valor = cola.poll();
            System.out.println("Elemento obtenido del buffer: " + valor);
            return valor;
        } else {
            System.out.println("Buffer vacío. No hay elementos para consumir.");
            return null;
        }
    }
}
