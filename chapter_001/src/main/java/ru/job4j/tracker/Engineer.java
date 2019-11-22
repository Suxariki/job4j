package ru.job4j.tracker;

public class Engineer extends Profession {
    private String cursedWordsVocabulary;

    public Engineer(String name, String surname, String education, String birthday, String cursedWordsVocabulary) {
        super(name, surname, education, birthday);
        this.cursedWordsVocabulary = cursedWordsVocabulary;
    }

    public String getCursedWordsVocabulary() {
        return this.cursedWordsVocabulary;
    }

    public void doChart() {

    }
}
