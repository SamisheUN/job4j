package ru.job4j.array;

public class AlgoArray {
    public static void main(String[] args) {
        int[] array = new int[]{5, 3, 2, 1, 4};
        for (int index = 0; index < array.length; index++) {
            for (int indexnext = index + 1; indexnext < array.length; indexnext++) {
                if (array[index] > array[indexnext]) {
                    int temp = array[index];
                    array[index] = array[indexnext];
                    array[indexnext] = temp;
                }
            }
            System.out.println(array[index]);
        }
    }
}