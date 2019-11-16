package ru.job4j.array;

import org.junit.Test;

import static org.hamcrest.Matchers.is;
import static org.junit.Assert.*;

public class EndsWithTest {

    @Test
    public void whenStartWithPrefixThenTrue() {
        char[] word = {'H', 'e', 'l', 'l', 'o'};
        char[] post = {'l', 'o'};
        boolean result = EndsWith.endsWith(word, post);
        assertThat(result, is(true));
    }

    @Test
    public void whenNotStartWithPrefixThenFalse() {
        char[] word = {'H', 'e', 'l', 'l', 'o'};
        char[] post = {'l', 'a'};
        boolean result = EndsWith.endsWith(word, post);
        assertThat(result, is(false));
    }
    @Test
    public void TestSmthg() {
        char[] word = {'K', 'a', 'v', 'a', 'b','a', 'n', 'g', 'a'};
        char[] post = {'g', 'a'};
        boolean result = EndsWith.endsWith(word, post);
        assertThat(result, is(true));
    }

    @Test
    public void TestSmthgWrong() {
        char[] word = {'K', 'a', 'v', 'a', 'b','a', 'n', 'g', 'a'};
        char[] post = {'g', 'g'};
        boolean result = EndsWith.endsWith(word, post);
        assertThat(result, is(false));
    }
}