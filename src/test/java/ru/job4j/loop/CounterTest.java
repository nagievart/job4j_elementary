package ru.job4j.loop;

import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.assertThat;

import static org.junit.jupiter.api.Assertions.*;

class CounterTest {

    @Test
    void WhenStart0Finish5Sum25() {
        int start = 0;
        int finish = 5;
        int expected = 15;
        int result = Counter.sum(start, finish);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void WhenStart0Finish1000Sum500500() {
        int start = 0;
        int finish = 1000;
        int expected = 500500;
        int result = Counter.sum(start, finish);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void WhenStart5Finish0Sum0() {
        int start = 5;
        int finish = 0;
        int expected = 0;
        int result = Counter.sum(start, finish);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void WhenStart0Finish10SumOfEven30() {
        int start = 0;
        int finish = 10;
        int expected = 30;
        int result = Counter.sumByEven(start, finish);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void WhenStart1Finish1SumOfEven0() {
        int start = 1;
        int finish = 1;
        int expected = 0;
        int result = Counter.sumByEven(start, finish);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void WhenStart10Finish1SumOfEven0() {
        int start = 10;
        int finish = 1;
        int expected = 0;
        int result = Counter.sumByEven(start, finish);
        assertThat(result).isEqualTo(expected);
    }
}