package ru.job4j.condition;

public class Max {
    public static int max(int left, int right) {
        boolean condition = left > right;
        int result = condition ? left : right;
        return result;
    }

    public static int equals(int left, int right) {
        boolean condition = left == right;
        int result = condition ? left : right;
        return result;
    }

    public static int max(int left, int right, int third) {
        return max(third, max(left, right));
    }

    public static int max(int left, int right, int third, int forth) {
        return max(forth, max(left, right, third));
    }

}