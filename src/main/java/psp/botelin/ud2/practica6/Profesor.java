package psp.botelin.ud2.practica6;

public class Profesor extends Thread {

    private final Saludo saludo;
    private String nombre;



    public Profesor(Saludo hola, String nombre) {
        this.saludo = hola;   
        this.nombre = nombre;
    }

    public void run() {
        System.out.println(" ( " + nombre + " ingresa ) ");
        saludo.saludarAlumnos();
    }
}
