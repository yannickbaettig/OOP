package ch.hslu.SW02;

import org.junit.Assert.*;
import org.junit.Test;

import static org.junit.Assert.assertEquals;


public class TemperaturTest {

    @Test
    public void testCalculation(){
        Temperatur temperatur = new Temperatur(20f);

        float fahreinheit = temperatur.celsiusToFahreinheit();
        float kelvin = temperatur.celsiusToKelvin();
        assertEquals(68f, fahreinheit, 0f);
        assertEquals(293.15f, kelvin, 0f);

        System.out.println("Fahreinheit: " + fahreinheit);
        System.out.println("Kelvin: " + kelvin);

    }
}
