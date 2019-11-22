package ru.job4j.tracker;

public class Dentist extends Doctor {
        private int teethCount;


    public Dentist(String name, String surname, String education, String birthday, String clinic, int teethCount) {
        super(name, surname, education, birthday, clinic);
        this.teethCount = teethCount;
    }

    public int getTeethCount() {
        return this.teethCount;
    }

    public void doDentistStuff() {

    }
}
