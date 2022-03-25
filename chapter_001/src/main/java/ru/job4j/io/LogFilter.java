package ru.job4j.io;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.List;

public class LogFilter {
    public static void main(String[] args) {
        LogFilter logFilter = new LogFilter();
        List<String> log = logFilter.filter("log.txt");
        System.out.println(log);
    }

    public boolean isNumber(String str) {
        if (str == null || str.isEmpty()) {
            return false;
        }
        for (int i = 0; i < str.length(); i++) {
            if (!Character.isDigit(str.charAt(i))) {
                return false;
            }
        }
        return true;
    }

    public List<String> filter(String file) {
        List<String> rsl = new ArrayList<>();
        String[] arr;
        try (BufferedReader in = new BufferedReader(new FileReader("log.txt"))) {
            for (String line = in.readLine(); line != null; line = in.readLine()) {
                arr = line.split(" ");
                if (arr[arr.length - 2].equals("404") && isNumber(arr[arr.length - 1])) {
                    rsl.add(line + System.lineSeparator());
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return rsl;
    }
}
