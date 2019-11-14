package ru.job4j.ru.job4j;

import java.util.Date;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello");
        Date current = new Date(2018, 17, 3);
        int year = current.getYear();
        System.out.println("this current year is "+current);
        boolean job = false;
    }
}
