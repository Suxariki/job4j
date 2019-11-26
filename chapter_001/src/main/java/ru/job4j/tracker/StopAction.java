package ru.job4j.tracker;

public class StopAction implements UserAction {
    @Override
    public String name() {
        return "=== Exit program ===";
    }

    /**
     * Метод, обеспечивающий закрытие программы
     * @param input
     * @param tracker
     * @return
     */
    @Override
    public boolean execute(Input input, Tracker tracker) {
        return false;
    }
}
