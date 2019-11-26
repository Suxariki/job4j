package ru.job4j.tracker;

public class FindItemNameAction implements UserAction {
    @Override
    public String name() {
        return "=== Find item by name";
    }

    @Override
    public boolean execute(Input input, Tracker tracker) {
        boolean rsl = false;
        String name = input.askStr("Enter name: ");
        Item[] result = tracker.findByName(name);
        if (result.length > 0) {
            for (Item item : result) {
                System.out.println("Имя заявки: " + item.getName() + " ID заявки: " + item.getId());
                rsl = true;
            }
        } else System.out.println("Заявки не найдены");
        return rsl;
    }

}


