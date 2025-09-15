package psp.botelin.ud2.practica4;

public class SalaEstudioMultihilo {
    public static void main(String[] args) {
        // Instanciamos la sala de estudio que todos los estudiantes compartirán
        SalaEstudio salaEstudio = new SalaEstudio();

        // Creamos cinco estudiantes que compartirán el computador
        Thread estudiante1 = new Thread(new Estudiante(salaEstudio, "Estudiante 1 (Informe)"));
        Thread estudiante2 = new Thread(new Estudiante(salaEstudio, "Estudiante 2 (Programación)"));
        Thread estudiante3 = new Thread(new Estudiante(salaEstudio, "Estudiante 3 (Investigación)"));
        Thread estudiante4 = new Thread(new Estudiante(salaEstudio, "Estudiante 4 (Presentación)"));
        Thread estudiante5 = new Thread(new Estudiante(salaEstudio, "Estudiante 5 (Correos)"));

        // Iniciamos los hilos (estudiantes)
        estudiante1.start();
        estudiante2.start();
        estudiante3.start();
        estudiante4.start();
        estudiante5.start();

    }
}