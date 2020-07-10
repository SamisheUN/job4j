package ru.job4j.array;

public class BubbleSort {
    public static int[] sort(int[] array) {
      /*  for (int index = array.length - 1; index >= 0; index--) {
            for (int indexb = 0; indexb < array.length - 1; indexb++) {
                if (array[indexb] > array[indexb + 1]) {
                    int temp = array[indexb];
                    array[indexb] = array[indexb + 1];
                    array[indexb + 1] = temp;
                }
            }*/
      boolean sorted = false;
          for (int i = 0;  i < array.length - 1 && !sorted; i++) {
              sorted = true;
              for (int j = i + 1; j < array.length; j++) {
                if (array[i] > array[j]) {
                    int temp = array[i];
                    array[i] = array[j];
                    array[j] = temp;
                    sorted = false;
                }
            }
        }
        return array;
    }
}
