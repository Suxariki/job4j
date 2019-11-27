package ru.job4j.strategy;

public class Triangle implements Shape {
    public String draw() {
        StringBuilder pic = new StringBuilder();
        pic.append("  X  \n");
        pic.append(" XXX \n");
        pic.append("XXXXX");

        return pic.toString();
    }
}
