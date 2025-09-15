package psp.ud2_2_3.recursos_compartidos.cocina;

public class CocinaMultihilo {
    public static void main(String[] args) {
        Cocina cocina = new Cocina();

        // Crear tres cocineros (hilos) que comparten la misma cocina
        Cocinero cocinero1 = new Cocinero(cocina, "Cocinero 1");
        Cocinero cocinero2 = new Cocinero(cocina, "Cocinero 2");
        Cocinero cocinero3 = new Cocinero(cocina, "Cocinero 3");

        // Iniciar los hilos
        cocinero1.start();
        cocinero2.start();
        cocinero3.start();

       //monitorizarCocineros(cocinero1, cocinero2, cocinero3);

    }


    public static void monitorizarCocineros(Cocinero cocinero1, Cocinero cocinero2 , Cocinero cocinero3 ) {
        boolean running = true;
        while (running) {
            // Mostrar el estado de cada hilo
            System.out.println("Estado del Cocinero 1: " + cocinero1.getState());
            System.out.println("Estado del Cocinero 2: " + cocinero2.getState());
            System.out.println("Estado del Cocinero 3: " + cocinero3.getState());

            // Pausa de 1 segundo para no sobrecargar la consola
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                System.err.println(e.getMessage());
            }

            // Comprobar si todos los hilos han terminado
            if (cocinero1.getState() == Thread.State.TERMINATED &&
                    cocinero2.getState() == Thread.State.TERMINATED &&
                    cocinero3.getState() == Thread.State.TERMINATED) {
                running = false; // Salir del bucle si todos los hilos han terminado
            }
        }
    }
}
