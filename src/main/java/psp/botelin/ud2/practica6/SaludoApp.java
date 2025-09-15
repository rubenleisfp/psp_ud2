package psp.botelin.ud2.practica6;

public class SaludoApp {
    public static void main(String[] args) {
        Saludo hola = new Saludo();
        Alumno pedro = new Alumno(hola, "Pedro");
        Alumno susana = new Alumno(hola, "Susana");
        Alumno andrea = new Alumno(hola, "Andrea");
        Alumno carlitos = new Alumno(hola, "Carlitos");

        Profesor profesor = new Profesor(hola, "Ruben");



        pedro.start();
        susana.start();
        andrea.start();
        carlitos.start();

        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        profesor.start();

        try {
            pedro.join();
            susana.join();
            andrea.join();
            carlitos.join();
        } catch (InterruptedException e) {
        }

    }
}
