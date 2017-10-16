package ch.hslu.SW04;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class LineTest {

    @Test
    public void testLine(){
        Line line = new Line(new Point(1,2), new Point(2,4));

        assertEquals(1,line.getStartPoint().getX());
        assertEquals(2,line.getStartPoint().getY());

        line.setStartPoint(new Point(-1,3));
        assertEquals(-1,line.getStartPoint().getX());
        assertEquals(3,line.getStartPoint().getY());


        line.getEndPoint().setX(4);
        line.getEndPoint().setY(5);

        assertEquals(4,line.getEndPoint().getX());
        assertEquals(5,line.getEndPoint().getY());
    }

}
