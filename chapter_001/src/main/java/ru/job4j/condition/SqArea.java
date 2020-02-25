package ru.job4j.condition;

/*
2. Доработайте метод main с демонстрацией работы программы с параметрами p = 6, k = 2, площадь должна быть 2.
h = p / (2 * (k + 1));
L = h * k;
s = L * h;
*/

public class SqArea {
    public static double square(int p, int k) {
       /*
       int h = p / (2 * (k + 1));
       int l = h * k;

        return l * h;
       */
        return (p / (2 * (k + 1))) * k * (p / (2 * (k + 1)));
    }

    public static void main(String[] args) {
        double result1 = square(6, 2);
        System.out.println(" p = 6, k = 2, s = 2, real = " + result1);
    }
}
