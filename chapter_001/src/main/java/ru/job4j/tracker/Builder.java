package ru.job4j.tracker;

public class Builder extends Engineer {
    private int countOfWorkers;

    public Builder(String name, String surname, String education, String birthday, String cursedWordsVocabulary, int countOfWorkers) {
        super(name, surname, education, birthday, cursedWordsVocabulary);
        this.countOfWorkers = countOfWorkers;
    }

    public int getCountOfWorkers() {
        return this.countOfWorkers;
    }

    public void build() {

    }
}
