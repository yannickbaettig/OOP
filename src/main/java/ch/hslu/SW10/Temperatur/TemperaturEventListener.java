package ch.hslu.SW10.Temperatur;

import java.util.EventListener;

public interface TemperaturEventListener extends EventListener {

    void temperaturChange(TemperaturEvent evt);
}
