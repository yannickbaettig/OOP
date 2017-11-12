package ch.hslu.SW08.v2;



import ch.hslu.SW08.Temperatur.Aggregatzustand;
import ch.hslu.SW08.Temperatur.Temperatur;
import ch.hslu.SW08.Temperatur.v2.Element;
import ch.hslu.SW08.Temperatur.v2.Quecksilber;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ElementTest {

    @Test
    public void testAggregatzustandSolidV2() throws Exception {
        Element element = new Quecksilber();
        Temperatur temperatur = new Temperatur(-50);
        String expected = Aggregatzustand.SOLID.getValue();

        String actual = element.getAggregatszustand(temperatur).getValue();
        System.out.println(element.getAggregatzustandText(temperatur));

        assertEquals(expected, actual);
    }


    @Test
    public void testAggregatzustandFluidV2() throws Exception {
        Element element = new Quecksilber();
        Temperatur temperatur = new Temperatur(0);
        String expected = Aggregatzustand.LIQUID.getValue();

        String actual = element.getAggregatszustand(temperatur).getValue();
        System.out.println(element.getAggregatzustandText(temperatur));

        assertEquals(expected, actual);
    }


    @Test
    public void testAggregatzustandGasV2() throws Exception {
        Element element = new Quecksilber();
        Temperatur temperatur = new Temperatur(400);
        String expected = Aggregatzustand.GAS.getValue();

        String actual = element.getAggregatszustand(temperatur).getValue();
        System.out.println(element.getAggregatzustandText(temperatur));

        assertEquals(expected, actual);
    }
}