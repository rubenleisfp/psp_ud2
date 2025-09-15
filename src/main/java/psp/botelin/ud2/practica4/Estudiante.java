package psp.botelin.ud2.practica4;

public class Estudiante implements Runnable {
    private SalaEstudio salaEstudio;
    private String nombre;

    // Constructor que recibe el nombre del estudiante y la sala de estudio
    public Estudiante(SalaEstudio salaEstudio, String nombre) {
        this.salaEstudio = salaEstudio;
        this.nombre = nombre;
    }

    @Override
    public void run() {
        // Cada estudiante trata de usar el computador
        salaEstudio.usarComputador(nombre);
    }
}