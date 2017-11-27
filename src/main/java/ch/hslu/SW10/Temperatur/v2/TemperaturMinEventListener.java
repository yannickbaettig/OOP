package ch.hslu.SW10.Temperatur.v2;

import java.util.EventListener;

public interface TemperaturMinEventListener extends EventListener {

    void temperaturMinChange(TemperaturMinEvent evt);
}
