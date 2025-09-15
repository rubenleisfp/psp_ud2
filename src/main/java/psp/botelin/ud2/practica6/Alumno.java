package psp.botelin.ud2.practica6;

public class Alumno extends Thread {
    String nombre;
    Saludo saludo;

    Alumno(Saludo s, String n) {
        nombre = n;
        saludo = s;
    }

    public void run() {
        System.out.println(" ( " + nombre + " ingresa ) ");
        saludo.saludarProfe(nombre);
    }

}