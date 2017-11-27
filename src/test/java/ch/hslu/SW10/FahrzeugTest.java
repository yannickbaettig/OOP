package ch.hslu.SW10;

import ch.hslu.SW10.Fahrzeug.Fahrzeug;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class FahrzeugTest {

    @Test
    public void testFahrzeug(){
        Fahrzeug fahrzeug = new Fahrzeug();

        fahrzeug.switchOn();
        fahrzeug.switchOff();
    }

}
