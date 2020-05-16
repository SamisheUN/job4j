package ru.job4j.array;

// Если все ячейки из массива pref соответствуют таким же ячейкам в массиве word,
// значит, нужно вернуть true.


public class ArrayChar {

    public static boolean startsWith(char[] word, char[] pref) {
        boolean result = true;
        for (int index = 0; index < pref.length; index++) {
            //исходным в цикле взят массив pref,
            //т.к. условие не исключает наличие в word[] дополнительных ячеек
            if (pref[index] != word[index]) {
                result = false;
            }
        }
        return result;
    }
}