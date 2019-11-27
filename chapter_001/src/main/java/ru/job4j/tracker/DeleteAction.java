package ru.job4j.tracker;

public class DeleteAction implements UserAction {
    @Override
    public String name() {
        return "=== Delete item ===";
    }

    @Override
    public boolean execute(Input input, Tracker tracker) {
        String id = input.askStr("Enter id: ");
        boolean result = tracker.delete(id);
        System.out.println(result ? "Заявка удалена" : "Заявка не найдена");
        return true;
    }
}