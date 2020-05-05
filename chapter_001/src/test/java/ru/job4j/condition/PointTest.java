package ru.job4j.condition;

import org.junit.Assert;
import org.junit.Test;

public class PointTest {

    @Test
    public void distance() {
        int inX1 = 5;
        int inY1 = 10;
        int inX2 = 15;
        int inY2 = 20;
        double expected = 7.07;
        double out = Point.distance(inX1, inX2, inY1, inY2);
        Assert.assertEquals(expected, out, 0.01);
    }

}
