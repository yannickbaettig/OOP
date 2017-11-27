package ch.hslu.SW10.Temperatur.v2;

import java.util.EventListener;

public interface TemperaturMaxEventListener extends EventListener {

    void temperaturMaxChange(TemperaturMaxEvent evt);
}
