package ru.job4j.array;

public class AlgoArray {
    public static void main(String[] args) {
        int[] array = new int[] {5, 3, 2, 1, 4};
         // записываем в ячейку с индексом 3 значение временной переменной.

        for (int index = 0; index < array.length; index++) {
            for (int indexnext = index + 1; indexnext < array.length; indexnext++)
                if (array[index] > array[indexnext]) {
                    int temp = array[index]; // переменная для временного хранения значение ячейки с индексом 0.
                    array[index] = array[indexnext]; // записываем в ячейку с индексом 0 значение ячейки с индексом 3.
                    array[indexnext] = temp;
                }

            System.out.println(array[index]);
        }
    }
}