package ru.job4j.tracker;

public class ReplaceAction implements UserAction{
    @Override
    public String name() {
        return "=== Edit item ===";
    }

    @Override
    public boolean execute(Input input, Tracker tracker) {
        String id = input.askStr("Enter id to find:");
        String name = input.askStr("Enter name for a new ticket: ");
        Item item = new Item(name);
        boolean result = tracker.replace(id, item);
        System.out.println(result ? "Заявка заменена" : "Заявка не заменена");
        return result;
    }
}
