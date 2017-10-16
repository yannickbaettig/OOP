package ch.hslu.SW04;

import ch.hslu.SW04.Fahrzeug;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class FahrzeugTest {

    @Test
    public void testFahrzeug(){
        Fahrzeug fahrzeug = new Fahrzeug();

        assertEquals(true, fahrzeug.isSwitchedOff());

        fahrzeug.switchOn();
        assertEquals(1500, fahrzeug.getMotor().getRpm());
        assertEquals(true, fahrzeug.isSwitchedOn());

        fahrzeug.switchOff();
        assertEquals(true, fahrzeug.isSwitchedOff());
        assertEquals(0,fahrzeug.getMotor().getRpm());
    }

}
