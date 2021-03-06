package ru.job4j.condition;

import org.junit.Test;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class MaxTest {
    @Test
    public void whenMax1To2Then2() {
        int result = Max.max(1, 2);
        assertThat(result, is(2));
    }

    @Test
    public void whenMax4to2Then4() {
        int result = Max.max(4,2);
        assertThat(result,is(4));
    }

    @Test
    public void whenEquals() {
        int result = Max.equals(4,4);
        assertThat(result, is(4));
    }

    @Test
    public void when123() {
        int result = Max.max(1,2,3);
        assertThat(result, is(3));
    }

    @Test
    public void when1234() {
        int result = Max.max(1,2,3,4);
        assertThat(result,is(4));
    }
}