package ch.hslu.SW11.Temperatur;

public class TemperaturMinEvent extends TemperaturEvent {

    /**
     * Constructs a prototypical Event.
     *
     * @param source The object on which the Event initially occurred.
     * @throws IllegalArgumentException if source is null.
     */
    public TemperaturMinEvent(Object source, Temperatur temperatur) {
        super(source, temperatur);
    }

}
