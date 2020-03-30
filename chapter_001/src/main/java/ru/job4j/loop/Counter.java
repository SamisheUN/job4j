package ru.job4j.loop;

public class Counter {
    public static int sum(int start, int finish) {
        int sum = 0;
        for (start = start /*start*/; start <= finish; start++) {
            sum = sum + start;
        }
        return sum;
    }

    public static void main(String[] args) {
        System.out.println(sum(0, 124));
        System.out.println(sum(3, 4));
        System.out.println(sum(1, 3));
        System.out.println(sum(1, 99999));
        System.out.println(sum(1, 199));
    }
}


