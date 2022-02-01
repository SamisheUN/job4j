package ru.job4j.iterator;

import java.util.Iterator;
import java.util.NoSuchElementException;

public class EvenNumbersIterator implements Iterator<Integer> {
    private int[] data;
    private int index;

    public EvenNumbersIterator(int[] data) {
        this.data = data;
    }

    @Override
    public boolean hasNext() {
        boolean rsl = false;


        while (data.length > 0 //сыкл "пока чётотам больше ноля"
                && index < data.length) {
            if (data[index] % 2 == 0) { //если чётотам вотакоевот
                rsl = true;
                break;                  //прерываем цыкл
            }
            index++;
        }
        return rsl;                       //возврат рез-та
    }

    @Override
    public Integer next() {
        if (!hasNext()) {
            throw new NoSuchElementException();
        }
        Integer rsl = data[index];
        index++;
        return rsl;
    }
}
