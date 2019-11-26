package ru.job4j.tracker;

public class FindByIdAction implements UserAction{
    @Override
    public String name() {
        return "=== Find item by ID ===";
    }

    @Override
    public boolean execute(Input input, Tracker tracker) {
        boolean result = false;
        System.out.println("=== Find item by Id ===");
        String id = input.askStr("Enter Id: ");
        Item item = tracker.findById(id);
        if (item != null) {
            System.out.println("Имя заявки: " + item.getName());
            result = true;
        }
        else {
            System.out.println("Заявка не найдена");
        }
        return result;
    }
}
