package ch.hslu.SW10.v3;

import ch.hslu.SW10.Fahrzeug.v3.Fahrzeug;
import org.junit.Test;

public class FahrzeugTest {

    @Test
    public void testFahrzeug(){
        Fahrzeug fahrzeug = new Fahrzeug();

        fahrzeug.switchOn();
        fahrzeug.switchOff();
    }

}
