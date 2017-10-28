package ch.hslu.SW06.Temperatur;

import org.junit.Test;

public class ElementTest {
    @Test
    public void testGetAggregatszustand() throws Exception {
    }

    @Test
    public void testToString() throws Exception {
        Element element = new Quecksilber();
        System.out.println(element.toString());
    }

}