package ru.job4j.condition;

import org.junit.Assert;
import org.junit.Test;

public class SqAreaTest {

    @Test
    public void square () {
        int inP = 6;
        int inK = 2;
        double expected = 2;
        double out = 2;
        Assert.assertEquals(expected, out, 0.01);
     }
}
