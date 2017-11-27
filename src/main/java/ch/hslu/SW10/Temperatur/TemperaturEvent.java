package ch.hslu.SW10.Temperatur;

import java.util.EventObject;

public class TemperaturEvent extends EventObject {
    private TemperaturType type;
    private Temperatur temperatur;

    /**
     * Constructs a prototypical Event.
     *
     * @param source The object on which the Event initially occurred.
     * @throws IllegalArgumentException if source is null.
     */
    public TemperaturEvent(Object source, TemperaturType type, Temperatur temperatur) {
        super(source);
        this.temperatur = temperatur;
        this.type = type;
    }

    public TemperaturType getType() {
        return type;
    }

    public Temperatur getTemperatur() {
        return temperatur;
    }
}
