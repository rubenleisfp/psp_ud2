package psp.botelin.ud2.practica6;

class Saludo {
    synchronized void saludarProfe(String alumno) {
        try {
            wait();
            System.out.println(alumno + " --> Buenos dias Profesor !");
        } catch (InterruptedException e) {
            System.out.println(e);
        }
    }

    synchronized void saludarAlumnos() {
        System.out.println("Profesor --> Buenos dias");
        notifyAll();
    }

}