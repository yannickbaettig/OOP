package ch.hslu.Repetition.Temperatur;

import java.util.EventObject;

public class TemperaturEvent extends EventObject {
    private Temperatur temp;

    public TemperaturEvent (Object source, Temperatur temp) {
        super(source);
        this.temp = temp;
    }

    public Temperatur getTemp(){
        return this.temp;
    }
}
