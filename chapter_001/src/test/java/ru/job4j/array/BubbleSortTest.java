package ru.job4j.array;
import org.junit.Test;
import org.testng.IExpectedExceptionsHolder;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class BubbleSortTest {
    //напишите здесь тест, проверяющий сортировку массива из 10 элементов методом пузырька, например {1, 5, 4, 2, 3, 1, 7, 8, 0, 5}.
    @Test
    public void whenSortArrayWithTenElementsThenSortedArray() {
        int[] array = {1, 5, 4, 2, 3, 1, 7, 8, 0, 5};
        int[] result = BubbleSort.sort(array);
        int[] expect = {0, 1, 1, 2, 3, 4, 5, 5, 7, 8};
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

