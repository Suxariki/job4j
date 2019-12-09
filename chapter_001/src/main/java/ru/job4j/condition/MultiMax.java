package ru.job4j.condition;

public class MultiMax {
    public int max(int first, int second, int third) {
        int result = first;
        if (second > result && second > third) {
            result = second;
        } else {
            if (third > result && third > second) {
                result = third;
            } else {
                if (first == second && second == third) {
                    result = first;
                }
            }
        }
        return result;
    }
}