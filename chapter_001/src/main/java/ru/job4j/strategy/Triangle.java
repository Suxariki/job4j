package ru.job4j.strategy;

public class Triangle implements Shape {
    public String draw() {
        StringBuilder pic = new StringBuilder();
        pic.append("  X  ");
        pic.append(" XXX ");
        pic.append("XXXXX");

        return pic.toString();
    }
}
