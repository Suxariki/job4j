package ru.job4j.loop;

public class Factorial {
    public int calc(int n) {
        int result = 1;
        for (int i = 1; i<=n; i++) {

            if (n == 1 || n == 0){
                result = 1;
            }

            else result = result*i;
        }
        return result;
    }
}