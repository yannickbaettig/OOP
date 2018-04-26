package ch.hslu.Repetition.Temperatur;

import java.util.EventListener;

public interface TemperaturMaxListener extends EventListener{

    public void temperaturMaxChange(TemperaturMaxEvent evt);
}
