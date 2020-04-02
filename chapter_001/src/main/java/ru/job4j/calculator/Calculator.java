package ru.job4j.calculator;

/**
 * Class класс для операций арифметических вычислений.
 * @autor Samoylychev
 * @since 01.04.2020
 * @version 1
 */

public class Calculator {
    /**
     * Method add сложение
     * @param first первое число
     * @param second второе число
     */
    public static void add(double first, double second) {
        double result =  first + second;
        System.out.println(first + "+" + second + " = " + result);
    }
    /**
     * Method div деление
     * @param first первое число
     * @param second второе число
     */
    public static void div(double first, double second) {
        double result =  first / second;
        System.out.println(first + "/" + second + " = " + result);
    }
    /**
     * Method multiply умножение
     * @param first первое число
     * @param second второе число
     */
    public static void multiply(double first, double second) {
        double result =  first * second;
        System.out.println(first + "*" + second + " = " + result);
    }
    /**
     * Method subtrack вычитание
     * @param first первое число
     * @param second второе число
     */
    public static void subtrack(double first, double second) {
        double result =  first - second;
        System.out.println(first + "-" + second + " = " + result);
    }

    /**
     * Main - примеры работы методов с конкретными числами
     * @param args
     */
    public static void main(String[] args) {
        add(1, 1);
        div(4, 2);
        multiply(2, 1);
        subtrack(10, 5);
    }

}