package ch.hslu.SW05;

import ch.hslu.SW05.Shape.Circle;
import ch.hslu.SW05.Shape.Rectangle;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ShapeTest {

    @Test
    public void testShape(){
        Rectangle rectangle = new Rectangle(5,4,3,4);
        Circle circle = new Circle(5,4,3);


        assertEquals(7.01, circle.getArea(),0.1);
        assertEquals(9.42,circle.getPerimeter(),0.1);
        assertEquals(12, rectangle.getArea(),0.1);
        assertEquals(14,rectangle.getPerimeter(),0.1);
    }

}
