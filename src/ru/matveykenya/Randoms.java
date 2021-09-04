package ru.matveykenya;

import java.util.Iterator;
import java.util.Random;

public class Randoms implements Iterable<Integer> {
    protected Random random;
    int min;
    int range;

    public Randoms(int min, int max) {
        random = new Random();
        this.min = min;
        range = max - min + 1;
    }

    @Override
    public Iterator<Integer> iterator() {
        return new Iterator<Integer>() {
            @Override
            public boolean hasNext() {
                return true;
            }

            @Override
            public Integer next() {
                return min + random.nextInt(range);
            }
        };
    }

}