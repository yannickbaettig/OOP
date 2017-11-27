package ch.hslu.SW10.Temperatur;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.NoSuchElementException;

public class TemperaturVerlauf extends ArrayList<Temperatur>{
    private final static Logger LOG = LogManager.getLogger(TemperaturVerlauf.class);
    private List<TemperaturEventListener> changeListeners = new ArrayList<>();

    public float getMaxTemperatur(){
        float max = 0;
        try {
            max = this.stream().max(Comparator.naturalOrder()).get().getCelsius();
        } catch (NoSuchElementException e) {
            LOG.error("Keine Temperatur vorhanden ", e);
        }
        return max;
    }

    public float getMinTemperatur(){
        float min = 0;
        try {
            min = this.stream().min(Comparator.naturalOrder()).get().getCelsius();
        } catch (NoSuchElementException e) {
            LOG.error("Keine Temperatur vorhanden ", e);
        }
        return min;
    }

    public float getAverageTemperatur(){
        float sum = 0;
        try {
            sum = (float) this.stream().mapToDouble(Temperatur::getCelsius).average().getAsDouble();
        } catch (NoSuchElementException e) {
            LOG.error("Keine Temperatur vorhanden ", e);
        }
        return sum;
    }

    public void addWithTemperaturCheck(Temperatur temperatur) {
        if (!this.isEmpty()) {
            if (temperatur.getCelsius() > this.getMaxTemperatur()) {
                TemperaturEvent event = new TemperaturEvent(this, TemperaturType.MAX, temperatur);
                fireTemperaturEvent(event);
            }
            if (temperatur.getCelsius() < this.getMinTemperatur()) {
                TemperaturEvent event = new TemperaturEvent(this, TemperaturType.MIN, temperatur);
                fireTemperaturEvent(event);
            }
        }
        this.add(temperatur);
    }

    @Override
    public String toString() {
        return "Anzahl Temperaturen: " + size() + ", Durchschnittstemperatur: " + getAverageTemperatur() +", Max Temperatur: " + getMaxTemperatur() + ", Min Temperatur: " + getMinTemperatur();
    }

    public void addTemperaturEventListener(TemperaturEventListener listener) {
        if (listener != null) {
            changeListeners.add(listener);
        }
    }

    public void removeTemperaturEventListener(TemperaturEventListener listener) {
        if (listener != null) {
            changeListeners.remove(listener);
        }
    }

    public void fireTemperaturEvent(TemperaturEvent event) {
        for (TemperaturEventListener listener : changeListeners) {
            listener.temperaturChange(event);
        }
    }

}
