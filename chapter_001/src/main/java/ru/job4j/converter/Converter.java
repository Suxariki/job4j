package ru.job4j.converter;

public class Converter {

    public static int rubleToEuro(int value) {
        return value / 70;
    }

    public static int rubleToDollar(int value) {
        return value/60;
    }

    public static int dollarToRuble (int value) {

        return value*60;
    }

    public static int euroToRuble(int value) {
        return value*70;
    }

    public static void main(String[] args) {
        int euro = rubleToEuro(140);
        int dollar = rubleToDollar(120);
        int rublesFromDollar = dollarToRuble(6);
        int rublesFromEuro = euroToRuble(5);

        System.out.println("140 rubles are " + euro + " euro.");
        System.out.println("120 rubles are " + dollar + " dollar.");
        System.out.println("6 dollars is " + rublesFromDollar + " rubles.");
        System.out.println("5 euros is " + rublesFromEuro + " rubles");
    }
}