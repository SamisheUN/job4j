package ru.job4j.loop;

public class CheckPrimeNumber {
    public static boolean check(int number) {
        boolean prime;
        prime = false;
        for (int index = 2; index <= number; index++) {
            if (number % index == 0 && index < number || number == 1) {
                prime = false;
                break;
            } else {
                prime = true;
            }
            }
        return prime;
        }

}

