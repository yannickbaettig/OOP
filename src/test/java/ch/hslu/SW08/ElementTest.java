package ch.hslu.SW08;


import ch.hslu.SW08.Temperatur.*;
import nl.jqno.equalsverifier.EqualsVerifier;
import nl.jqno.equalsverifier.Warning;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ElementTest {

    @Test
    public void testAggregatzustandSolid() throws Exception {
        Element element = new Quecksilber();
        Temperatur temperatur = new Temperatur(-50);
        String expected = Aggregatzustand.SOLID.getValue();

        String actual = element.getAggregatszustand(temperatur).getValue();
        System.out.println(element.getAggregatzustandText(temperatur));

        assertEquals(expected, actual);
    }


    @Test
    public void testAggregatzustandFluid() throws Exception {
        Element element = new Quecksilber();
        Temperatur temperatur = new Temperatur(0);
        String expected = Aggregatzustand.LIQUID.getValue();

        String actual = element.getAggregatszustand(temperatur).getValue();
        System.out.println(element.getAggregatzustandText(temperatur));

        assertEquals(expected, actual);
    }


    @Test
    public void testAggregatzustandGas() throws Exception {
        Element element = new Quecksilber();
        Temperatur temperatur = new Temperatur(400);
        String expected = Aggregatzustand.GAS.getValue();

        String actual = element.getAggregatszustand(temperatur).getValue();
        System.out.println(element.getAggregatzustandText(temperatur));

        assertEquals(expected, actual);
    }
}