package ru.job4j.calculator;

import org.junit.Test;

import static org.junit.Assert.*;

public class FitTest {

    @Test
    public void whenMan171Then81() {
    short in = 171;
    double expected = 81.65;
    double out = Fit.manWeight(in);
    assertEquals(expected, out, 0.01);
    }

    @Test
    public void whenWoman171Then70() {
        short in = 171;
        double expected = 70.15;
        double out = Fit.womanWeight(in);
        assertEquals(expected, out, 0.01);
    }
}