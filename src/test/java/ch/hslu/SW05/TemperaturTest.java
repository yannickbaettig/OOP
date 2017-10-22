package ch.hslu.SW05;

import ch.hslu.SW05.Temperatur.*;
import org.junit.Test;

import static org.junit.Assert.assertEquals;


public class TemperaturTest {


    @Test
    public void testAggregatzustand(){
        Temperatur temperatur = new Temperatur(0f);

        Element stickstoff = new Stickstoff();
        Element blei = new Blei();
        Element quecksilber = new Quecksilber();

        String gasförmig = "gasförmig";
        String fest = "fest";
        String flüssig = "flüssig";

        assertEquals(gasförmig, stickstoff.getAggregatszustand(temperatur));
        assertEquals(fest, blei.getAggregatszustand(temperatur));
        assertEquals(flüssig, quecksilber.getAggregatszustand(temperatur));

    }
}
