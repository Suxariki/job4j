package ru.job4j.array;

public class Matrix {
    public int[][] multiple(int size) {
        int[][] table = new int[size][size];
        for(int out = 0; out != size; out++) {
            for (int inn = 0; inn != size; inn++) {
                table[out][inn] = (out+1) * (inn+1);
            }
        }
        return table;
    }
}