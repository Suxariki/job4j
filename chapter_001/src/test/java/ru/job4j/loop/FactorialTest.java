package ru.job4j.loop;

import org.junit.Assert;
import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class FactorialTest {
    @Test
    public void whenCalculateFactorialForFiveThenOneHundreedTwenty() {
        //напишите здесь тест, проверяющий, что факториал для числа 5 равен 120.
        Factorial fact = new Factorial();
        int result = fact.calc(5);
        Assert.assertEquals(result,120);
    }

    @Test
    public void whenCalculateFactorialForZeroThenOne() {
        Factorial fact = new Factorial();
        int result = fact.calc(0);
        Assert.assertEquals(result,1);
    }

    @Test
    public void whenCalculateFactorialFromOneThenOne() {
        Factorial fact = new Factorial();
        int result = fact.calc(1);
        Assert.assertEquals(result,1);
    }
}