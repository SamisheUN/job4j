package ru.job4j.array;

public class Merge {
    public static int[] merge(int[] left, int[] right) {

        int[] rsl = new int[left.length + right.length];
        int indexL = 0; //счётчик перебора массива left
        int indexR = 0; //счётчик перебора массива right
        int rslActual = 0; //cчётчик актуальной rsl ячейки


            for (int index = 0; index < rsl.length; index++) {

                if (left.length - indexL == 0 | right.length - indexR == 0) {
                    break;
                }

                int l = left[indexL]; //значение очередной ячейки left
                int r = right[indexR]; //значение очередной ячейки right

                if (l <= r) { //выбор значения для ячейки rsl
                    rsl[index] = l;
                    indexL++;
                } else {
                    rsl[index] = r;
                    indexR++;
                }
                rslActual++;
            }
            //сравнение, если использовано ячеек массива left больше right
            if ((left.length - indexL) > (right.length - indexR)) {
                //цикл использования остатка right начинается с следующей ячейки rsl, и длится пока index существует в rsl
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
