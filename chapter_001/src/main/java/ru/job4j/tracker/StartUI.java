package ru.job4j.tracker;


public class StartUI implements Input {

    public void init(Input input, Tracker tracker) {
        boolean run = true;
        while (run) {
            this.showMenu();
            System.out.print("Select: ");
            int select = Integer.parseInt(input.askStr(""));
            if (select == 0) {
                System.out.println("=== Create a new Item ====");
                System.out.print("Enter name: ");
                String name = input.askStr("");
                Item item = new Item(name);
                tracker.add(item);
            } else if (select == 1) {
                System.out.println("=== Show all items ====");
                if (tracker.findAll().length > 0) {
                    for (Item item : tracker.findAll()) {
                        System.out.println("Id заявки: " + item.getId() + " Имя заявки: " + item.getName());
                    }
                } else {
                    System.out.println("Заявок не найдено");
                }
            } else if (select == 2) {
                System.out.println("=== Edit item ===");
                System.out.println("Enter id to find: ");
                String id = input.askStr("");
                System.out.println("Enter name for a new ticket: ");
                String name = input.askStr("");
                Item item = new Item(name);
                String msg = tracker.replace(id, item) ? "Заявка заменена" : "Заявка не заменеа";
                System.out.println(msg);
            }
            else if (select == 3) {
                System.out.println("=== Delete Item ===");
                System.out.println("Enter id to delete: ");
                String id = input.askStr("");
                String msg = tracker.delete(id) ? "Заявка удалена" : "Заявка не найдена";
                System.out.println(msg);
            }
            else if (select == 4) {
                System.out.println("=== Find item by Id ===");
                System.out.println("Enter Id");
                String id = input.askStr("");
                Item item = tracker.findById(id);
                if (item != null) {
                    System.out.println("Имя заявки: " + item.getName());
                } else System.out.println("Заявка не найдена");
            }
            else if (select == 5) {
                System.out.println("=== Find item by name ===");
                System.out.println("Enter name");
                String name = input.askStr("");
                Item[] result = tracker.findByName(name);
                if (result.length > 0) {
                    for (Item item : result) {
                        System.out.println("Имя заявки: " + item.getName() + " ID заявки: " + item.getId());
                    }
                }
                else System.out.println("Заявки не найдены");
            }
            else if (select == 6) {
                run = false;
            }
        }
    }

    private void showMenu() {
        System.out.println("Menu.\n"
                + "0. Add new Item\n"
                + "1. Show all items\n"
                + "2. Edit item\n"
                + "3. Delete item\n"
                + "4. Find item by Id\n"
                + "5. Find items by name\n"
                + "6. Exit Program\n");
    }


    public static void main(String[] args) {
        Input input = new ConsoleInput();
        Tracker tracker = new Tracker();
        new StartUI().init(input, tracker);
    }

    @Override
    public String askStr(String question) {
        return null;
    }

    @Override
    public int askInt(String question) {
        return 0;
    }
}