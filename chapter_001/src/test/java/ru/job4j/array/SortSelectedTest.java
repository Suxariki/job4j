package ru.job4j.array;

import org.junit.Test;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class SortSelectedTest {
    @Test
    public void whenSort() {
        int[] input = new int[] {3, 4, 1, 2, 5};
        int result[] = SortSelected.sort(input);
        int[] expect = new int[] {1, 2, 3, 4, 5};
        assertThat(result, is(expect));
    }

    @Test
    public void whenSort1() {
        int[] input = new int[] {2, 841, 13, 25, 258,5};
        int result[] = SortSelected.sort(input);
        int[] expect = new int[] {2, 5, 13, 25, 258, 841};
        assertThat(result, is(expect));
    }

    @Test
    public void whenSort2() {
        int[] input = new int[] {8, 12, 16, 22, 20};
        int result[] = SortSelected.sort(input);
        int[] expect = new int[] {8, 12, 16, 20, 22};
        assertThat(result, is(expect));
    }
}