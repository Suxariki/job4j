package ru.job4j.io;

import java.util.Random;
import java.util.Scanner;

public class MagicBall {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Я великий Оракул. Что ты хочешь узнать? ");
        String question = input.nextLine();
        int random = new Random().nextInt(3);
        if (random == 0) {
            System.out.println("Да");
        }
        else if (random == 2) {
            System.out.println("Нет");
        }
        else System.out.println("Не знаю");
    }
}
