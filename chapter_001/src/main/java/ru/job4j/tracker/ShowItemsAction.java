package ru.job4j.tracker;

public class ShowItemsAction implements UserAction{
    @Override
    public String name() {
        return "=== Show all items ===";
    }

    @Override
    public boolean execute(Input input, Tracker tracker) {
        boolean result = false;
        if (tracker.findAll().length > 0) {
            for (Item item : tracker.findAll()) {
                System.out.println("Id заявки: " + item.getId() + " Имя заявки: " + item.getName());
                result = true;
            }
        }
        else {
            System.out.println("Заявок не найдено");
        }
        return result;
    }
}
