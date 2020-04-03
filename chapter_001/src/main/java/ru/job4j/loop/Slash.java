package ru.job4j.loop;

/**
 *      0 1 2 3 4
 * 0    0 . . . 0      0 4
 * 1    . 0 . 0 .      1 3
 * 2    . . 0 . .      2 2
 * 3    . 0 . 0 .      1 3
 * 4    0 . . . 0      0 4
 */



public class Slash {
    public static void draw(int size) {
        for (int row = 0; row < size; row++) {
            for (int cell = 0; cell < size; cell++) {
                boolean left = cell == row; // добавить усл., по кот. нужно опр. ставить ли символ/
                boolean right = (size - cell - 1) == row; // добавить условие, что нужно ставить элемент в правый угол.
                if (left) {
                    System.out.print("0");
                } else if (right) {
                    System.out.print("0");
                } else {
                    System.out.print(".");
                }
            }
            System.out.println();
        }
        System.out.println();
    }

    public static void main(String[] args) {
        System.out.println("Draw by 3");
        draw(3);
        System.out.println("Draw by 5");
        draw(5);
        System.out.println("Draw by 21");
        draw(21);
    }
}