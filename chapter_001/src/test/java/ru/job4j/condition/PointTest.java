package ru.job4j.condition;

import org.junit.Assert;
import org.junit.Test;

public class PointTest {
    @Test
    public void distanceOf3() {
        Point a = new Point(0, 0, 0);
        Point b = new Point(2, 3, 5);
        double result = 6.164414002968976;
        double dist = a.distance3d(b);
        Assert.assertEquals(result, dist, 0.1);
    }

    @Test
    public void distanceIsFalse() {
        Point a = new Point(0, 0, 0);
        Point b = new Point(5, 8, 13);
        double result = 16.06237840420901;
        double dist = a.distance3d(b);
        Assert.assertEquals(result, dist, 0.1);

    }
}
