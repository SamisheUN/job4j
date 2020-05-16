

package ru.job4j.array;

public class Check {
    public static boolean mono(boolean[] data) {
        boolean result = true;
        for (boolean index : data) {
            if (data[0] != index) {
                result = false;
            }
        }
        return result;
    }
}

