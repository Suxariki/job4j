package ru.job4j.io;

import java.util.Scanner;

public class Matches {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        boolean turn = false;
        int matches = 11;
        while (matches > 0) {
            System.out.println("Первый игрок возьмите 1-3 спички");
            int take = Integer.parseInt(in.nextLine());
            if ((take > 0) & (take < 4) & (take <= matches)) {
                turn = true;
                matches -= take;
                System.out.println("Осталось " + matches + " спичек");
            } else {
                System.out.println("Возьмите 1-3 спички");
                continue;
            }
            if (matches == 0) {
                break;
            } else {
                System.out.println("Второй игрок возьмите 1-3 спички");
                int take1 = Integer.parseInt(in.nextLine());
                if ((take1 > 0) & (take1 < 4) & (take1 <= matches)) {
                    turn = false;
                    matches -= take1;
                    System.out.println("Осталось " + matches + " спичек");
                } else {
                    System.out.println("Возьмите 1-3 спички");
                }
            }
            if (turn) {
                System.out.println("Первый игрок победил");
            } else {
                System.out.println("Второй игрок победил");
            }
        }
    }
}
