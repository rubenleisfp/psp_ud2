package psp.ud2_2_3.recursos_compartidos.cocina;

/**
 * La cocina es un recurso compartido, por lo que debemos sincronizarlo para evitar que
 * 2 cocineros intenten usar el cuchillo simultaneamente
 *
 */
class Cocina {


    //Metodo sincronizado. Solo podra haber un hilo ejecutando esta seccion. El resto esperaran a que finalice
    public synchronized void usarCuchillo(String cocinero) {
        System.out.println(cocinero + " está usando el cuchillo.");
        try {
            Thread.sleep(4000); // Simular el uso del cuchillo
        } catch (InterruptedException e) {
            System.err.println(e.getMessage());
        }
        System.out.println(cocinero + " ha terminado de usar el cuchillo.");
    }
}