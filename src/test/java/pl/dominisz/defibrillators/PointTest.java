package pl.dominisz.defibrillators;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * http://dominisz.pl
 * 28.03.2018
 */
public class PointTest {

    private Point zeroPoint;

    @BeforeEach
    void setup() {
        zeroPoint = new Point(0, 0);
    }

    @Test
    void testDistanceTo() {
        //obliczymy odległość od punktu (0, 0) do (100, 100)
        double x = (100 - 0) * Math.cos((0 + 100) / 2);
        double y = (100 - 0);
        double d = Math.sqrt(x * x + y * y) * 6371;

        Point anotherPoint = new Point(100, 100);
        assertEquals(d, zeroPoint.distanceTo(anotherPoint));
    }

    @Test
    void testDistanceToItself() {
        assertEquals(0, zeroPoint.distanceTo(zeroPoint));
    }

}
