package ru.job4j.condition;

import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.assertThat;

class MaxTest {

    @Test
    void whenMax1To2Then2() {
        int left = 1;
        int right = 2;
        int result = Max.max(left, right);
        int expected = 2;
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void whenMax5To2Then5() {
        int left = 5;
        int right = 2;
        int result = Max.max(left, right);
        int expected = 5;
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void whenMax7To7Then7() {
        int left = 7;
        int right = 7;
        int result = Max.max(left, right);
        int expected = 7;
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void whenMax1To2To3Then3() {
        int left = 1;
        int right = 2;
        int third = 3;
        int result = Max.max(left, right, third);
        int expected = 3;
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void whenMax2To10To5Then10() {
        int left = 2;
        int right = 10;
        int third = 5;
        int result = Max.max(left, right, third);
        int expected = 10;
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void whenMax1To1To1Then1() {
        int left = 1;
        int right = 1;
        int third = 1;
        int result = Max.max(left, right, third);
        int expected = 1;
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void whenMax1To2To3To4Then4() {
        int left = 1;
        int right = 2;
        int third = 3;
        int fourth = 4;
        int result = Max.max(left, right, third, fourth);
        int expected = 4;
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void whenMax4To3To5To2Then5() {
        int left = 4;
        int right = 3;
        int third = 5;
        int fourth = 2;
        int result = Max.max(left, right, third, fourth);
        int expected = 5;
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void whenMax1To1To1To1Then1() {
        int left = 1;
        int right = 1;
        int third = 1;
        int fourth = 1;
        int result = Max.max(left, right, third, fourth);
        int expected = 1;
        assertThat(result).isEqualTo(expected);
    }
}