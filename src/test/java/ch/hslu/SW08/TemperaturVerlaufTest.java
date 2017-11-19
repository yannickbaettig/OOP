package ch.hslu.SW08;


import ch.hslu.SW08.Temperatur.Temperatur;
import ch.hslu.SW08.Temperatur.TemperaturVerlauf;
import nl.jqno.equalsverifier.EqualsVerifier;
import nl.jqno.equalsverifier.Warning;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TemperaturVerlaufTest {

    @Test
    public void testAdd() throws Exception {
        TemperaturVerlauf temperaturVerlauf = new TemperaturVerlauf();
        int expected = 2;

        temperaturVerlauf.add(new Temperatur(20));
        temperaturVerlauf.add(new Temperatur(30));

        assertEquals(expected,temperaturVerlauf.size());
    }

    @Test
    public void testClear() throws Exception {
        TemperaturVerlauf temperaturVerlauf = new TemperaturVerlauf();
        int expected = 0;

        temperaturVerlauf.add(new Temperatur(20));
        temperaturVerlauf.add(new Temperatur(30));
        temperaturVerlauf.clear();

        assertEquals(expected, temperaturVerlauf.size());
    }

    @Test
    public void testGetMaxTemperatur() throws Exception {
        TemperaturVerlauf temperaturVerlauf = new TemperaturVerlauf();
        float expected = 30f;

        temperaturVerlauf.add(new Temperatur(30));
        temperaturVerlauf.add(new Temperatur(20));
        temperaturVerlauf.add(new Temperatur(15));
        temperaturVerlauf.add(new Temperatur(0));

        float actual = temperaturVerlauf.getMaxTemperatur();

        assertEquals(expected, actual, 0.1f);
    }


    @Test
    public void testGetMinTemperatur() throws Exception {
        TemperaturVerlauf temperaturVerlauf = new TemperaturVerlauf();
        float expected = -15f;

        temperaturVerlauf.add(new Temperatur(30));
        temperaturVerlauf.add(new Temperatur(20));
        temperaturVerlauf.add(new Temperatur(00));
        temperaturVerlauf.add(new Temperatur(-15));

        float actual = temperaturVerlauf.getMinTemperatur();

        assertEquals(expected, actual, 0.1f);
    }

    @Test
    public void testGetAverageTemperatur() throws Exception {
        TemperaturVerlauf temperaturVerlauf = new TemperaturVerlauf();
        float expected = 10f;

        temperaturVerlauf.add(new Temperatur(10));
        temperaturVerlauf.add(new Temperatur(20));
        temperaturVerlauf.add(new Temperatur(10));
        temperaturVerlauf.add(new Temperatur(0));

        float actual = temperaturVerlauf.getAverageTemperatur();

        assertEquals(expected, actual, 0.1f);
    }

    @Test
    public void testNoEntry() throws Exception {
        TemperaturVerlauf temperaturVerlauf = new TemperaturVerlauf();
        float expected = 0;

        float actual = temperaturVerlauf.getMaxTemperatur();

        assertEquals(expected, actual, 0.1f);
    }

}