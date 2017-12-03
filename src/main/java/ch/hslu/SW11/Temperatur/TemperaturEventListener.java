package ch.hslu.SW11.Temperatur;

import java.util.EventListener;

public interface TemperaturEventListener extends EventListener {

    void temperaturChange(TemperaturEvent evt);
}
