package ru.job4j.converter;

/*
1. Доработайте требуемый функционал.
2. Добавьте в эту задачу файл ru.job4j.converter.Converter.
3. Выставите ответственного Петр Арсентьева.
*/

public class Converter {

    public static int rubleToEuro (int value) {
        return value / 70;
    }

    public static int rubleToDollar (int value) {
        return value / 60;
    }

    public static int euroToRuble (int value) {
        return value * 70;
    }

    public static int dollarToRuble (int value) { return value * 60; }

    public static void main(String[] args) {

        int in = 140;


        int expectedRtoE = 2;
        int outRtoE = rubleToEuro(in);
        boolean passedRtoE = expectedRtoE == outRtoE;
        int euro  = rubleToEuro(140);
        System.out.println ("140 rubles are " + euro + " euro. Test result = " + passedRtoE);

        int expectedRtoD = 2;
        int outRtoD = rubleToDollar(in);
        boolean passedRtoD = expectedRtoD == outRtoD;
        int dollar = rubleToDollar(140);
        System.out.println ("140 rubles are " + dollar + " dollars. Test result = " + passedRtoD);

        int expectedDtoR = 8400;
        int outDtoR = dollarToRuble(in);
        boolean passedDtoR = expectedDtoR == outDtoR;
        int rubleD = dollarToRuble (140);
        System.out.println ("140 dollars are " + rubleD + " rubles. Test result = " + passedDtoR);

        int expectedEtoR = 9800;
        int outEtoR = euroToRuble(in);
        boolean passedEtoR = expectedEtoR == outEtoR;
        int rubleE = euroToRuble (140);
        System.out.println ("140 euro are " + rubleE + " rubles. Test result = " + passedEtoR);
    }

}
