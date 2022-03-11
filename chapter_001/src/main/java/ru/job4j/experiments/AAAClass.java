package ru.job4j.experiments;

import java.util.ArrayList;
import java.util.List;

public class AAAClass {


    public static void main(String[] args) {
        List<Integer> s = new ArrayList<>();
        s.add(1); // = s.size() - i - 1 = 3 - /0,1,2/ - 1 = 3
        s.add(2);
        s.add(3);
        for (int i = 0; i < s.size(); i++) {
            s.set(i, s.size() - i - 1);
            System.out.println(s);
        }
    }
}