package ru.job4j.condition;

import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.*;

class PointTest {

    @Test
    void distanceWhen00to20Then2() {
        int x1 = 0;
        int x2 = 0;
        int y1 = 0;
        int y2 = 2;
        double expected = 2;
        double output = Point.distance(x1, x2, y1, y2);
        assertThat(output).isEqualTo(expected, withPrecision(0.01));
    }

    @Test
    void distanceWhen00to60Then6() {
        int x1 = 0;
        int x2 = 0;
        int y1 = 0;
        int y2 = 6;
        double expected = 6;
        double output = Point.distance(x1, x2, y1, y2);
        assertThat(output).isEqualTo(expected, withPrecision(0.01));
    }

    @Test
    void distanceWhen15to64Then4Dot47() {
        int x1 = 1;
        int x2 = 6;
        int y1 = 5;
        int y2 = 4;
        double expected = 4.47;
        double output = Point.distance(x1, x2, y1, y2);
        assertThat(output).isEqualTo(expected, withPrecision(0.01));
    }

}