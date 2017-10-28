package ch.hslu.SW05;

import ch.hslu.SW05.Switchable.Fahrzeug;
import ch.hslu.SW05.Switchable.Named;
import ch.hslu.SW05.Switchable.Switchable;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class FahrzeugTest {

    @Test
    public void testFahrzeug(){
        Fahrzeug fahrzeug = new Fahrzeug();

        fahrzeug.switchOn();
        fahrzeug.switchOff();

        assertEquals(2,fahrzeug.getSwitchCount());
    }

}
