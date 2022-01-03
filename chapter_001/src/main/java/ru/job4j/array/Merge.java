package ru.job4j.array;

public class Merge {
    public static int[] merge(int[] left, int[] right) {

        int[] rsl = new int[left.length + right.length];
        int indexL = 0;
        int indexR = 0;
        int rslActual = 0;
        for (int index = 0; index < rsl.length; index++) {
            if (left.length - indexL == 0 | right.length - indexR == 0) {
                break;
            }
            int l = left[indexL];
            int r = right[indexR];
            if (l <= r) {
                rsl[index] = l;
                indexL++;
            } else {
                rsl[index] = r;
                indexR++;
            }
            rslActual++;
        }
        if ((left.length - indexL) > (right.length - indexR)) {
            for (int index = rslActual; index < rsl.length & indexL < left.length; index++) {
                rsl[index] = left[indexL];
                indexL++;
            }
        } else {
            for (int index = rslActual; index < rsl.length & indexR < right.length; index++) {
                rsl[index] = right[indexR];
                indexR++;
            }
        }
        return rsl;
    }
}