package ch.hslu.SW02;

import ch.hslu.SW03.Element;
import org.junit.Assert.*;
import org.junit.Test;

import static org.junit.Assert.assertEquals;


public class TemperaturTest {

    @Test
    public void testCalculation(){
        Temperatur temperatur = new Temperatur(30f);
        temperatur.addTemperatur(-10f);

        float fahreinheit = temperatur.celsiusToFahreinheit();
        float kelvin = temperatur.celsiusToKelvin();
        assertEquals(68f, fahreinheit, 0.01);
        assertEquals(293.15f, kelvin, 0.01);

        System.out.println("Fahreinheit: " + fahreinheit);
        System.out.println("Kelvin: " + kelvin);

    }

    @Test
    public void testAggregatzustand(){
        Temperatur temperatur = new Temperatur(400f);

        String erwarteterZustand = "gasförmig";
        String zustand = temperatur.aggregatszustand("Hg");
        assertEquals(erwarteterZustand, zustand);
    }

    @Test
    public void testAggregatzustand2(){
        Temperatur temperatur = new Temperatur(0f);

        Element elementN = new Element("N", "Stickstoff", -196f,-210f);
        Element elementHg = new Element("Hg", "Quecksilber",357f,-38f);
        Element elementPb = new Element("Pb", "Blei", 1744f,327f);

        String gasförmig = "gasförmig";
        String flüssig = "flüssig";
        String fest = "fest";

        String zustandN = temperatur.getAggreagtZustand(elementN);
        String zustandHg = temperatur.getAggreagtZustand(elementHg);
        String zustandPb = temperatur.getAggreagtZustand(elementPb);

        assertEquals(gasförmig, zustandN);
        assertEquals(flüssig, zustandHg);
        assertEquals(fest, zustandPb);
    }
}
