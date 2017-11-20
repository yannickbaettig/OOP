package ch.hslu.SW09.Temperatur;


import ch.hslu.SW09.Temperatur.Temperatur;
import nl.jqno.equalsverifier.EqualsVerifier;
import nl.jqno.equalsverifier.Warning;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

import static org.junit.Assert.assertEquals;
import static org.mutabilitydetector.unittesting.MutabilityAssert.assertImmutable;

public class TemperaturTest {

    @Rule
    public ExpectedException thrown = ExpectedException.none();

    @Test
    public void testEquals() throws Exception {
        EqualsVerifier.forClass(Temperatur.class).suppress(Warning.NONFINAL_FIELDS).suppress(Warning.ALL_FIELDS_SHOULD_BE_USED).usingGetClass().verify();
    }

    @Test
    public void testHashcode() throws Exception {
        Temperatur temperatur = Temperatur.createFromKelvin(20);
        Temperatur temperatur1 = Temperatur.createFromKelvin(20);

        int expected = temperatur.hashCode();
        int actual = temperatur1.hashCode();

        assertEquals(expected,actual);
    }

    @Test
    public void testCompareTo() throws Exception {
        Temperatur temperatur = Temperatur.createFromCelsius(20);
        Temperatur temperatur1 = Temperatur.createFromCelsius(30);

        int expected = -1; // kleiner
        int actual = temperatur.compareTo(temperatur1);

        assertEquals(expected, actual);
    }

    @Test
    public void testStatic() throws Exception {
        float actual = Temperatur.kelvinToCelsius(273.15f);
        float expected = 0;

        assertEquals(expected, actual, 0.1f);
    }

    @Test
    public void testIllegalArgumentException() throws Exception {
        thrown.expect(IllegalArgumentException.class);
        thrown.expectMessage("ungültige Temperatur");
        Temperatur.createFromKelvin(-1);
    }

    @Test
    public void testTemperaturIsImmutable() {
        assertImmutable(Temperatur.class);
    }


}