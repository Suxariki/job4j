package ru.job4j.tracker;

import org.junit.Assert;
import org.junit.Test;
import static org.hamcrest.Matchers.is;
import static org.hamcrest.Matchers.nullValue;
import static org.junit.Assert.assertThat;

public class TrackerTest {
    @Test
    public void add() {
        Tracker tracker = new Tracker();
        Item item = new Item("test1");
        tracker.add(item);
        Item result = tracker.findById(item.getId());
        assertThat(result.getName(), is(item.getName()));
    }

    @Test
    public void findByName() {
        Tracker tracker = new Tracker();
        Item test1 = new Item("test1");
        tracker.add(test1);
        Item test2 = new Item("test2");
        tracker.add(test2);
        Item test3 = new Item("test1");
        tracker.add(test3);
        Item[] expected = {test1, test3};
        Item[] result = tracker.findByName(test1.getName());
        //сравниваем их
        assertThat(result, is(expected));
    }

    @Test
    public void findAll() {
        Tracker tracker = new Tracker();
        Item test1 = new Item("test1");
        tracker.add(test1);
        Item test2 = new Item("test2");
        tracker.add(test2);
        Item test3 = new Item("test3");
        tracker.add(test3);
        Item[] expected = {test1, test2, test3};
        Item[] result = tracker.findAll();
        assertThat(result, is(expected));
    }

    @Test
    public void whenReplaceNameThenReturnNewName() {
        Tracker tracker = new Tracker();
        Item previous = new Item("test1");
        tracker.add(previous);
        Item next = new Item("test2");
        tracker.replace(previous.getId(), next);
        Assert.assertThat(tracker.findById(previous.getId()).getName(), is("test2"));
    }

    @Test
    public void whenFirstDeleteThenSecond() {
        Tracker tracker = new Tracker();
        Item first = new Item("first");
        tracker.add(first);
        Item second = new Item("second");
        tracker.add(second);
        tracker.delete(first.getId());
        Item[] expect = {second};
        Assert.assertThat(tracker.findAll(), is(expect));
    }



    @Test
    public void findByIdTest() {
        Tracker tracker = new Tracker();
        Item first = new Item("test1");
        Item second = new Item("test");
        Item third = new Item("test");
        tracker.add(first);
        tracker.add(second);
        tracker.add(third);
        String out = second.getId();
        assertThat(tracker.findById(out), is(second));
    }

    @Test
    public void findByIdTestNull() {
        Tracker tracker = new Tracker();
        Item first = new Item ("1");
        Item second = new Item ("2");
        tracker.add(first);
        tracker.add(second);
        String out = "123";
        assertThat(tracker.findById(out), is (nullValue()));
    }
}