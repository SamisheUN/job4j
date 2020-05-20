package ru.job4j.array;

public class Matrix {
    public int[][] multiple(int size) {
        int[][] table = new int[size][size];
        for (int line = 0; line < size; line++) {
            for (int row = 0; row < size; row++) {
                table[line][row] = (line + 1) * (row + 1);
            }
        }
        return table;
    }
}