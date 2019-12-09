package ru.job4j.tracker;

public class Surgeon extends Doctor {
    private boolean isHandsWashed;

    public Surgeon(String name, String surname, String education, String birthday, String clinic, boolean isHandsWashed) {
        super(name, surname, education, birthday, clinic);
        this.isHandsWashed = isHandsWashed;
    }

    public boolean getIsHandWashed() {
        return this.isHandsWashed;
    }

    public void doSurgery() {

    }
}
