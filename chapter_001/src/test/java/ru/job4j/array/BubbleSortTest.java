package ru.job4j.array;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class BubbleSortTest {
    @Test
    public void whenSortArrayWithTenElementsThenSortedArray() {
        int[] array = {91, 35, 584, 732, 113, 221, 37, 18, 230, 555};
        int[] result = BubbleSort.sort(array);
        int[] expect = {18, 35, 37, 91, 113, 221, 230, 555, 584, 732};
        assertThat(result, is(expect));
    }

    @Test
    public void whenSortArrayWithSwitchedBorders() {
        int[] array = {99, 1, 5, 4, 2, 3, 1, 7, 8, 0, 5, 0};
        int[] result = BubbleSort.sort(array);
        int[] expect = {0, 0, 1, 1, 2, 3, 4, 5, 5, 7, 8, 99};
        assertThat(result, is(expect));
    }

}

