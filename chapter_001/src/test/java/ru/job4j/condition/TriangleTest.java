package ru.job4j.condition;

import org.junit.Assert;
import org.junit.Test;

public class TriangleTest {
    @Test
    public void triangleExist() {
        Triangle triangle = new Triangle(new Point(2, 0), new Point(3, 5), new Point(1, 0));
        double area = triangle.area();
        Assert.assertEquals(2.5, area, 0.1);
    }

    @Test
    public void triangleNotExist() {
        Triangle triangle = new Triangle(new Point(0, 0), new Point(0, 0), new Point(5, 5));
        double area = triangle.area();
        Assert.assertEquals(-1,area,0.1);
    }
}