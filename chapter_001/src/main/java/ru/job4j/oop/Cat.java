package ru.job4j.oop;

public class Cat {

    private String food;
    private String name;

    public void show() {
        System.out.println(this.name + " съел " + this.food);
    }

    public void eat(String meal) {
        this.food = meal;
    }

    public void giveNick(String nick) {
        this.name = nick;
    }


    public static void main(String[] args) {
        Cat gav = new Cat();
        gav.giveNick("Гав");
        gav.eat("kotleta");
        gav.show();
        Cat black = new Cat();
        black.giveNick("Черный");
        black.eat("fish");
        black.show();
    }
}