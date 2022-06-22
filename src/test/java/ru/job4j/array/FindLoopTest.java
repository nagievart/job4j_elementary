package ru.job4j.array;

import org.junit.Test;

import static org.junit.Assert.*;

public class FindLoopTest {

    @Test
    public void whenArrayHas5Then0() {
        int[] data = {5, 4, 3, 2};
        int el = 5;
        int result = FindLoop.indexOf(data, el);
        int expected = 0;
        assertEquals(expected, result);
    }

    @Test
    public void whenArrayHasNot10ThenMinus1() {
        int[] data = {1, 2, 3, 5};
        int el = 10;
        int result = FindLoop.indexOf(data, el);
        int expected = -1;
        assertEquals(expected, result);
    }

    @Test
    public void whenArrayHas10Then5() {
        int[] data = {0, 4, 3, 2, 5, 10};
        int el = 10;
        int result = FindLoop.indexOf(data, el);
        int expected = 5;
        assertEquals(expected, result);
    }

    @Test
    public void secondWhenArrayHas5Then0() {
        int[] data = new int[]{5, 10, 3};
        int el = 5;
        int result = FindLoop.indexOf(data, el);
        int expected = 0;
        assertEquals(expected, result);
    }

    @Test
    public void whenDiapasonHas2Then3() {
        int[] data = new int[]{5, 2, 10, 2, 4};
        int el = 2;
        int start = 2;
        int finish = 4;
        int result = FindLoop.indexInRange(data, el, start, finish);
        int expected = 3;
        assertEquals(expected, result);
    }

    @Test
    public void whenDiapasonHasNot8ThenMinus1() {
        int[] data = new int[]{8, 5, 2, 10, 2, 4, 15, 150};
        int el = 8;
        int start = 2;
        int finish = 5;
        int result = FindLoop.indexInRange(data, el, start, finish);
        int expected = -1;
        assertEquals(expected, result);
    }

    @Test
    public void whenDiapasonHas8Then5() {
        int[] data = new int[]{8, 5, 2, 10, 2, 8, 15, 150};
        int el = 8;
        int start = 2;
        int finish = 7;
        int result = FindLoop.indexInRange(data, el, start, finish);
        int expected = 5;
        assertEquals(expected, result);
    }
}