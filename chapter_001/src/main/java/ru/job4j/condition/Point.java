package ru.job4j.condition;

public class Point {
    public static double distance(int x1, int y1, int x2, int y2) {
        return Math.sqrt(Math.pow((x2 - x1),2) + Math.pow((y2 - y1),2));
    }

    public static void main(String[] args) {
        double result = distance(0, 0, 2, 0);
        double result2 = distance(1,2,3,4);
        double result3 = distance(654,894,482816,484882);
        System.out.println("result (0, 0) to (2, 0) " + result);
        System.out.println("result (1, 2) to (3, 4) " + result2);
        System.out.println("result (654, 894) to (482816, 484882) "+ result3);
    }
}