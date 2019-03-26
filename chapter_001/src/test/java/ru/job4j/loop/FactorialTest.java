package ru.job4j.loop;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class FactorialTest {
    @Test
    public void whenCalculateFactorialForFiveThenOneHundreedTwenty() {
        Factorial calc = new Factorial();
        int result = calc.calc(5);
        int expected = 120;
        assertThat(result, is(expected));
    }


    @Test
    public void whenCalculateFactorialForZeroThenOne() {
        Factorial calc = new Factorial();
        int result = calc.calc(0);
        int expected = 1;
        assertThat(result, is(expected));

    }
}