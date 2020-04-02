package ru.job4j.loop;

public class Mortgage {
    public int year(int amount, int salary, double percent) {
        int year = 0;
        int sum = (int) ((int) amount + (amount * (percent / 100)));
        while (sum >= 0) {
            sum = (int) ((sum - salary) * (percent / 100));
            year++;
        }
        return year;
        }
    }
