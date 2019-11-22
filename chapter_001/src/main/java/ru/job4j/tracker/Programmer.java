package ru.job4j.tracker;

public class Programmer extends Engineer {
    private String language;

    public Programmer(String name, String surname, String education, String birthday, String cursedWordsVocabulary, String language) {
        super(name, surname, education, birthday, cursedWordsVocabulary);
        this.language = language;
    }

    public String getLanguage() {
        return this.language;
    }

    public void makeSomeCode() {

    }
}
