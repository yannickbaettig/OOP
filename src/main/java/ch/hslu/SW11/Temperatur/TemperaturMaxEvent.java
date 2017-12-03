package ch.hslu.SW11.Temperatur;

public class TemperaturMaxEvent extends TemperaturEvent {

    /**
     * Constructs a prototypical Event.
     *
     * @param source The object on which the Event initially occurred.
     * @throws IllegalArgumentException if source is null.
     */
    public TemperaturMaxEvent(Object source, Temperatur temperatur) {
        super(source, temperatur);
    }

}
