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

    @Test
    void distance3dWhen111to51015Then17Dot11() {
        Point a = new Point(1, 1, 1);
        Point b = new Point(5, 10, 15);
        double output = a.distance3d(b);
        double expected = 17.11;
        assertThat(output).isEqualTo(expected, withPrecision(0.01));
    }

    void distance3dWhen51015to017Then13Dot03() {
        Point a = new Point(5, 10, 15);
        Point b = new Point(0, 1, 7);
        double output = a.distance3d(b);
        double expected = 13.03;
        assertThat(output).isEqualTo(expected, withPrecision(0.01));
    }

    void distance3dWhen000to000Then0() {
        Point a = new Point(0, 0, 0);
        Point b = new Point(0, 0, 0);
        double output = a.distance3d(b);
        double expected = 0;
        assertThat(output).isEqualTo(expected, withPrecision(0.01));
    }
}