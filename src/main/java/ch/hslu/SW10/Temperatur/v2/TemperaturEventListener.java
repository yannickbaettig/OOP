package ch.hslu.SW10.Temperatur.v2;

import ch.hslu.SW10.Temperatur.v2.TemperaturEvent;

import java.util.EventListener;

public interface TemperaturEventListener extends EventListener {

    void temperaturChange(TemperaturEvent evt);
}
