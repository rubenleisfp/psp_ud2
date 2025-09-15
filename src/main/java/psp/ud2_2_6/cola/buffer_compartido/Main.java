package psp.ud2_2_6.cola.buffer_compartido;

public class Main {
    public static void main(String[] args) {
        Buffer buffer = new Buffer(5);  // Tamaño máximo del buffer

        // Simulación del productor
        System.out.println("=== Productor ===");
        for (int i = 1; i <= 7; i++) {
            buffer.agregar(i);
        }

        // Simulación del consumidor
        System.out.println("\n=== Consumidor ===");
        for (int i = 0; i < 7; i++) {
            buffer.obtener();
        }
    }
}
