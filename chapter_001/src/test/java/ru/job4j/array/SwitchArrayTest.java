package ru.job4j.array;

import org.junit.Test;
import static org.hamcrest.Matchers.is;
import static org.junit.Assert.assertThat;

public class SwitchArrayTest {

    @Test
    public void whenSwap0to3() {
        int[] input = {1, 2, 3, 4};
        int[] expect = {4, 2, 3, 1};
        int[] rsl = SwitchArray.swap(input, 0, input.length - 1);
        assertThat(rsl, is(expect));
    }

    @Test
    public void whenSwap99to11() {
        int[] input = {99, 211, 0, 72, 11, 85};
        int[] expect = {11, 211, 0, 72, 99, 85};
        int[] rsl = SwitchArray.swap(input, 0, 4);
        assertThat(rsl, is(expect));
    }

    @Test
    public void whenSwapBorder() {
        int[] input = {0, 2, 4, 6};
        int[] expect = {6, 2, 4, 0};
        int[] rsl = SwitchArray.swapBorder(input);
        assertThat(rsl, is(expect));
    }
}