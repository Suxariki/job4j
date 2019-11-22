package ru.job4j.tracker;

public class Animal {
    public Animal(String name) {
        super();
        System.out.println("Object");
    }


    public static void main(String[] args) {
        Animal a = new Animal("");
        System.out.println();
        Predator p = new Predator("");
        System.out.println();
        Tiger t = new Tiger("");
    }
}
