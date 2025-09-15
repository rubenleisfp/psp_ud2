package psp.ud2_2_3.recursos_compartidos.cocina;

class Cocinero extends Thread {
    private Cocina cocina;
    private String nombre;

    public Cocinero(Cocina cocina, String nombre) {
        this.cocina = cocina;
        this.nombre = nombre;
    }

    public void run() {
        cocina.usarCuchillo(nombre);
    }
}