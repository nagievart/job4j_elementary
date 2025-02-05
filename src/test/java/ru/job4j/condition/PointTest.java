package ru.job4j.condition;

import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.*;

class PointTest {

    @Test
    void distanceWhen00to20Then2() {
        Point a = new Point(0, 0);
        Point b = new Point(2, 0);
        double output = a.distance(b);
        double expected = 2;
        assertThat(output).isEqualTo(expected, withPrecision(0.01));
    }

    @Test
    void distanceWhen00to60Then6() {
        Point a = new Point(0, 0);
        Point b = new Point(6, 0);
        double output = a.distance(b);
        double expected = 6;
        assertThat(output).isEqualTo(expected, withPrecision(0.01));
    }

    @Test
    void distanceWhen15to64Then5Dot099() {
        Point a = new Point(1, 5);
        Point b = new Point(6, 4);
        double output = a.distance(b);
        double expected = 5.099;
        assertThat(output).isEqualTo(expected, withPrecision(0.01));
    }
}