package ru.job4j.loop;

import org.hamcrest.Matchers;
import org.junit.Test;

import static org.junit.Assert.assertThat;

public class FactorialTest {
    @Test
    public void whenCalculateFactorialForFiveThenOneHundredTwenty() {
        int rsl = Factorial.calc(5); //напишите здесь тест, проверяющий, что факториал для числа 5 равен 120.
        int expected = 120;
        assertThat(rsl, Matchers.is(expected));
    }

    @Test
    public void whenCalculateFactorialForZeroThenOne() {
        int rsl = Factorial.calc(1); //напишите здесь тест, проверяющий, что факториал для числа 0 равен 1.
        int expected = 1;
        assertThat(rsl, Matchers.is(expected));
    }

    @Test
    public void whenCalculateFactorialForZero() {
        int rsl = Factorial.calc(0); //напишите здесь тест, проверяющий, что факториал для числа 0 равен 1.
        int expected = 0;
        assertThat(rsl, Matchers.is(expected));
    }

}

