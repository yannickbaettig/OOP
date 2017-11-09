package ch.hslu.SW07;


import ch.hslu.SW07.Temperatur.Element;
import ch.hslu.SW07.Temperatur.Quecksilber;
import ch.hslu.SW07.Temperatur.Stickstoff;
import ch.hslu.SW07.Temperatur.Temperatur;
import nl.jqno.equalsverifier.EqualsVerifier;
import nl.jqno.equalsverifier.Warning;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class ElementTest {


    @Test
    public void testEqualsVerifier() throws Exception {
        EqualsVerifier.forClass(Element.class).suppress(Warning.NONFINAL_FIELDS).suppress(Warning.ALL_FIELDS_SHOULD_BE_USED).usingGetClass().verify();
    }

    @Test
    public void testEquals1() throws Exception {
        Element element = new Quecksilber();
        Element element1 = new Quecksilber();

        assertTrue(element.equals(element1));
    }

    @Test
    public void testEquals2() throws Exception {
        Quecksilber quecksilber = new Quecksilber();
        Element quecksilber1 = new Quecksilber();

        assertTrue(quecksilber.equals(quecksilber1));
    }

}