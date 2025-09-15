package psp.ud2_2_8.callable;

import java.util.concurrent.Callable;

public class SumaParcial implements Callable<Integer> {
    private final int inicio;
    private final int fin;

    public SumaParcial(int inicio, int fin) {
        this.inicio = inicio;
        this.fin = fin;
    }

    @Override
    public Integer call() {
        int suma = 0;
        for (int i = inicio; i <= fin; i++) {
            suma += i;
        }
        return suma;
    }
}
