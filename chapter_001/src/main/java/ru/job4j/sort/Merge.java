package ru.job4j.sort;

import java.util.Arrays;

public class Merge {

    public int[] merge(int[] left, int[] right) {
        int[] rsl = new int[left.length + right.length];
        int i = 0;
        int leftShift = 0;
        int rightShift = 0;
        while (i < rsl.length) {
            if (leftShift == left.length) {
                rsl[i] = right[rightShift];
                rightShift++;
            }
            else if (rightShift == right.length) {
                rsl[i] = left[leftShift];
                leftShift++;
            }
            else if (left[leftShift] <= right[rightShift]) {
                rsl[i] = left[leftShift];
                leftShift++;
            }
            else if (right[rightShift] <= left[leftShift]) {
                rsl[i] = right[rightShift];
                rightShift++;
            }
            i++;
        }

        return rsl;
    }

    public static void main(String[] args) {
        Merge process = new Merge();
        int[] rsl = process.merge(
                new int[] {1, 3, 5},
                new int[] {2, 4}
        );
        System.out.println(Arrays.toString(rsl));
    }
}
