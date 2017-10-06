package ch.hslu.SW03;

import ch.hslu.SW03.Point;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PointTest {

    @Test
    public void testQuadrant(){
        Point point_1 = new Point(2,3);
        Point point_0 = new Point(0,-3);
        Point point_4 = new Point(1,-3);

        int QUADRANT_1 = 1;
        int QUADRANT_2 = 2;
        int QUADRANT_3 = 3;
        int QUADRANT_4 = 4;
        int QUADRANT_0 = 0;


        assertEquals(QUADRANT_1, point_1.getQuadrant());
        assertEquals(QUADRANT_0, point_0.getQuadrant());
        assertEquals(QUADRANT_4, point_4.getQuadrant());
    }
}
