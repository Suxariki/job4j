package ru.job4j.oop;

public class College {
    public static void main(String[] args) {
        /**
         * Понижающее приведение
         */
        Freshman freshman = new Freshman();
        Students stud = freshman;
        Object obj = freshman;
    }
}
