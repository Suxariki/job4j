package ru.job4j.tracker;

import java.util.Arrays;
import java.util.Random;

/**
 * @version $Id$
 * @since 0.1
 */
public class Tracker {
    /**
     * Массив для хранение заявок.
     */
    private final Item[] items = new Item[100];

    /**
     * Указатель ячейки для новой заявки.
     */
    private int position = 0;

    /**
     * Метод, реализующий добавление заявки в хранилище
     * @param item новая заявка
     */
    public Item add(Item item) {
        item.setId(this.generateId());
        this.items[this.position++] = item;
        return item;
    }

    /**
     * Метод, реализующий удаление заявки по id
     * @param id id заявки
     * @return Удалось ли провести операцию
     */

    public boolean delete(String id) {
        boolean result = false;
        for (int i = 0; i < this.position; i++) {
            if (this.items[i] != null && this.items[i].getId().equals(id)) {
                this.items[i] = null;
                this.position--;
                System.arraycopy(this.items, i + 1, this.items, i, this.items.length - i - 1);
                result = true;
                break;
            }
        }
        return result;
    }

    /**
     * Метод, реализующий замену заявки на другую по id
     * @param id id заявки
     * @param item item для замены
     * @return Удалось ли провести операцию
     */

    public boolean replace(String id, Item item) {
        boolean result = false;
        int i = indexById(id);
        if (item != null && i != -1) {
            item.setId(id);
            this.items[i] = item;
            result = true;
        }
        return result;
    }


    /**
     * Метод, возвращающий массив без null
     * @return Массив без null
     */

    public Item[] findAll() {
        return Arrays.copyOf(this.items, this.position);
    }

    /**
     * Метод, возвращающий массив item с одинаковым именем key
     * @param key
     * @return Массив с одинаковыми Name
     */

    public  Item[] findByName(String key) {
        Item[] result = new Item[this.position];
        int j = 0;
        for (int i = 0; i != this.position; i++) {
            if (items[i].getName().equals(key)) {
              result[j++] = this.items[i];
            }
        }
        return Arrays.copyOf(result, j);
    }

    /**
     * Метод, возвращающий объект с искомым id
     * @param id
     * @return Объект с искомым id
     */

    public Item findById(String id) {
        int indexResult = indexById(id);
        if (indexResult != -1) {
            return this.items[indexResult];
        } else {
            return null;
        }
    }

    /**
     * Метод, возвращающий индекс объекста с искомым id
     * @param id
     * @return индекс с искомым id
     */

    public int indexById(String id) {
        int index = -1;
        for (int i = 0; i < this.position; i++) {
            if (this.items[i].getId().equals(id)) {
                index = i;
            }
        }
        return index;
    }

    /**
     * Метод генерирует уникальный ключ для заявки.
     * Так как у заявки нет уникальности полей, имени и описание. Для идентификации нам нужен уникальный ключ.
     * @return Уникальный ключ.
     */
    private String generateId() {
        Random rm = new Random();
        return String.valueOf(rm.nextLong() + System.currentTimeMillis());
    }
}