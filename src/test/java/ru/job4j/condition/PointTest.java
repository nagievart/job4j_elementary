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
}