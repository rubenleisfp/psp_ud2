package psp.ud2_2_6.cola.buffer_compartido;

import java.util.LinkedList;
import java.util.Queue;

class Buffer {
    private Queue<Integer> cola = new LinkedList<>();
    private int capacidad;

    public Buffer(int capacidad) {
        this.capacidad = capacidad;
    }

    /**
     * Método para agregar un elemento al buffer. Si el buffer está lleno no se agregará el elemento.
     *
     * @param valor El elemento a agregar al buffer
     */
    public void agregar(int valor) {
        throw new UnsupportedOperationException("A implementar por el alummno");
    }


    /**
     * Método para obtener un elemento del buffer. Si el buffer está vacío no se devuelve ningun elemento.
     *
     * @return El elemento obtenido del buffer o null si el buffer está vacío
     */
    public Integer obtener() {
        throw new UnsupportedOperationException("A implementar por el alummno");
    }
}
