package ru.job4j.loop;

public class Counter {
    public static int sum(int start, int finish) {
        int sum = 0;
        for (start = start /*start*/; start <= finish; start++) sum = sum + start;
        return sum;
    }

    public static int sumByEven(int start, int finish) {
        int sum = 0;
        for (int index = start; index <= finish; index++) {
            int halfIndex = index % 2;
            if (halfIndex <= 0) {
                sum = sum + index;
            }
        }
        return sum;
    }


    public static void main(String[] args) {
        System.out.println(sum(0, 124));
        System.out.println(sum(3, 4));
        System.out.println(sum(1, 3));

        System.out.println(sumByEven(0, 10));
        System.out.println(sumByEven(3, 8));
        System.out.println(sumByEven(1, 5));
    }
}


