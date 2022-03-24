package ru.job4j.io;

import ru.job4j.array.Matrix;

import java.io.FileOutputStream;

public class ResultFile {
    public static void main(String[] args) {
        Matrix matrixInit = new Matrix();
        int[][] matrix = matrixInit.multiple(10);

        try (FileOutputStream out = new FileOutputStream("result.txt")) {
            for (int[] row : matrix) {
                for (int val : row) {
                    out.write(Integer.toString(val).getBytes());
                }
                out.write(System.lineSeparator().getBytes());
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
