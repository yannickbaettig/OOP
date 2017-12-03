package ch.hslu.SW11.Temperatur;

import java.time.LocalDateTime;
import java.util.Objects;

public class MeasuringPoint implements Comparable<MeasuringPoint>{
    private LocalDateTime timestamp;
    private Temperatur temperatur;
    private Moisture moisture;

    public MeasuringPoint(LocalDateTime timestamp, Temperatur temperatur, Moisture moisture) {
        this.timestamp = timestamp;
        this.temperatur = temperatur;
        this.moisture = moisture;
    }

    @Override
    public String toString() {
        return "timestamp= " + timestamp +
                ", temperatur= " + temperatur +
                ", moisture= " + moisture;
    }


    public LocalDateTime getTimestamp() {
        return timestamp;
    }

    public Temperatur getTemperatur() {
        return temperatur;
    }

    public Moisture getMoisture() {
        return moisture;
    }

    @Override
    public int compareTo(MeasuringPoint o) {
        return Float.compare(temperatur.getCelsius(), o.getTemperatur().getCelsius());
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        MeasuringPoint that = (MeasuringPoint) o;
        return Objects.equals(timestamp, that.timestamp) &&
                Objects.equals(temperatur, that.temperatur) &&
                Objects.equals(moisture, that.moisture);
    }

    @Override
    public int hashCode() {
        return Objects.hash(timestamp, temperatur, moisture);
    }
}
