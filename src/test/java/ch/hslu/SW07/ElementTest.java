package ch.hslu.SW07;

import ch.hslu.SW06.Temperatur.Element;
import ch.hslu.SW06.Temperatur.Quecksilber;
import org.junit.Test;

public class ElementTest {


    @Test
    public void testToString() throws Exception {
        Element element = new Quecksilber();
        System.out.println(element.toString());
    }

}