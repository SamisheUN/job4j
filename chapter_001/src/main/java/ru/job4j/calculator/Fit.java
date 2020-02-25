package ru.job4j.calculator;
/*
1. Реализуйте методы manWeight и womanWeight. Нужно дописать код, чтобы методы возвращали
идеальный вес для мужчины и женщины.
Вместо -1D вам нужно написать формулу.
Добавьте в метод main демонстрацию работы методов.
2. Загрузите файл в эту задачу.

Идеальный вес для мужчин = (рост в сантиметрах – 100) · 1,15.
Идеальный вес для женщин = (рост в сантиметрах – 110) · 1,15.
*/
public class Fit {
    public static double manWeight (double height) {
        return (height - 100) * 1.15;
    }

    public static double womanWeight (double height) {
        return (height - 110) * 1.15;
    }

    public static void main (String[] args) {
        double man = manWeight(100);
        double woman = womanWeight( 100);
        System.out.println ("Man 100 is " + man);
        System.out.println ("Woman 100 is " + woman);
    }

}
