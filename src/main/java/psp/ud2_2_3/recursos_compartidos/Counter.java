package psp.ud2_2_3.recursos_compartidos;

import java.util.concurrent.atomic.AtomicInteger;

class Counter {
    private AtomicInteger count = new AtomicInteger(0);

    public void increment() {
        count.set(count.get() +1);
    }

    public int getCount() {
        return count.get();
    }
}

