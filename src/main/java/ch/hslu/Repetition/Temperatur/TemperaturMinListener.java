package ch.hslu.Repetition.Temperatur;

import java.util.EventListener;

public interface TemperaturMinListener extends EventListener {

    public void temperaturMinChange(TemperaturMinEvent evt);
}
