package ch.hslu.SW08;


import ch.hslu.SW08.Temperatur.Temperatur;
import nl.jqno.equalsverifier.EqualsVerifier;
import nl.jqno.equalsverifier.Warning;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TemperaturTest {


    @Test
    public void testEquals() throws Exception {
        EqualsVerifier.forClass(Temperatur.class).suppress(Warning.NONFINAL_FIELDS).suppress(Warning.ALL_FIELDS_SHOULD_BE_USED).usingGetClass().verify();
    }

    @Test
    public void testHashcode() throws Exception {
        Temperatur temperatur = new Temperatur(20);
        Temperatur temperatur1 = new Temperatur(20);
        System.out.println(temperatur.toString());

        assertEquals(temperatur.hashCode(),temperatur1.hashCode());
    }

    @Test
    public void testCompareTo() throws Exception {
        Temperatur temperatur = new Temperatur(20);
        Temperatur temperatur1 = new Temperatur(30);

        int expected = -1; // kleiner

        assertEquals(expected, temperatur.compareTo(temperatur1));
    }

}