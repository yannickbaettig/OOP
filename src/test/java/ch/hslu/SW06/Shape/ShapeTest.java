package ch.hslu.SW06.Shape;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class ShapeTest {

    @Before
    public void setUp() throws Exception {
        Shape shape1 = new Rectangle(1,1,1,1);
        Shape shape2 = new Circle(1,1,3);

        shape1.move(2,2);
        shape2.move(2,2);

        Circle circle = (Circle) shape2;
        circle.getDiameter();

    }

    @After
    public void tearDown() throws Exception {
    }
    @Test
    public void move() throws Exception {
    }

    @Test
    public void getPerimeter() throws Exception {
    }

    @Test
    public void getArea() throws Exception {
    }

}