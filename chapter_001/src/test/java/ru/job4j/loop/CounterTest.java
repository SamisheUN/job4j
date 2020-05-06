package ru.job4j.loop;

import org.junit.Test;

import static org.hamcrest.Matchers.is;
import static org.junit.Assert.assertThat;

public class CounterTest {

    @Test
    public void whenSumEvenNumbersFromOneToTenThenThirty() {
        int rsl = Counter.sumByEven(1, 10);
        int expected = 30;
        assertThat(rsl, is(expected));
    }

     @Test
     public void whenSumOnetoTen() {
     int boo = Counter.sumByEven(10, 12);
     int expected = 24;
    }

    @Test
    public void whenSumOnetoFive() {
        int boo = Counter.sumByEven(1, 5);
        int expected = 6;
    }
}