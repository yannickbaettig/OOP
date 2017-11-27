package ch.hslu.SW10.Temperatur.v2;

import java.util.EventObject;

public class TemperaturMaxEvent extends EventObject {
    private Temperatur temperatur;

    /**
     * Constructs a prototypical Event.
     *
     * @param source The object on which the Event initially occurred.
     * @throws IllegalArgumentException if source is null.
     */
    public TemperaturMaxEvent(Object source, Temperatur temperatur) {
        super(source);
        this.temperatur = temperatur;
    }

    public Temperatur getTemperatur() {
        return temperatur;
    }
}
