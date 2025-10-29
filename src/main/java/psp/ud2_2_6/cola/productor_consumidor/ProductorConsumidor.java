package psp.ud2_2_6.cola.productor_consumidor;



// Clase principal que inicia la simulación
public class ProductorConsumidor {
    public static void main(String[] args) {
        Buffer buffer = new Buffer(5);  // Creamos un buffer con capacidad de 5 elementos

        // Creamos y arrancamos el productor y los consumidores
        Productor productor = new Productor(buffer);
        Consumidor consumidor = new Consumidor(buffer);

        productor.start();
        consumidor.start();
    }
}