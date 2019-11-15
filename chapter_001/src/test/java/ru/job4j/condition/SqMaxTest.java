package ru.job4j.condition;

import org.junit.Test;
import static org.hamcrest.Matchers.is;
import static org.junit.Assert.assertThat;

public class SqMaxTest {


    @Test
    public void maxTestFirst() {
        SqMax firstMax = new SqMax();
        int result = firstMax.max(8,2,3,4);
        assertThat(result,is(8) );
    }

    @Test
    public void maxTestSecond() {
        SqMax secondMax = new SqMax();
        int result = secondMax.max(1,12,3,4);
        assertThat(result,is(12) );
    }

    @Test
    public void maxTestThirs() {
        SqMax thirdMax = new SqMax();
        int result = thirdMax.max(1,2,80,5);
        assertThat(result,is(80));
    }

    @Test
    public void maxTestForth() {
        SqMax forthMax = new SqMax();
        int result = forthMax.max(1,2,3,4);
        assertThat(result,is(4) );
    }
}
