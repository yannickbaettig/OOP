package ch.hslu.SW10.Temperatur.v2;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.NoSuchElementException;

public class TemperaturVerlauf extends ArrayList<Temperatur>{
    private List<TemperaturMinEventListener> minChangeListeners = new ArrayList<>();
    private List<TemperaturMaxEventListener> maxChangeListeners = new ArrayList<>();

    public float getMaxTemperatur(){
        float max = 0;
        try {
            max = this.stream().max(Comparator.naturalOrder()).get().getCelsius();
        } catch (NoSuchElementException e) {
           System.out.println("Keine Temperatur vorhanden " + e);
        }
        return max;
    }

    public float getMinTemperatur(){
        float min = 0;
        try {
            min = this.stream().min(Comparator.naturalOrder()).get().getCelsius();
        } catch (NoSuchElementException e) {
            System.out.println("Keine Temperatur vorhanden " + e);
        }
        return min;
    }

    public float getAverageTemperatur(){
        float sum = 0;
        try {
            sum = (float) this.stream().mapToDouble(Temperatur::getCelsius).average().getAsDouble();
        } catch (NoSuchElementException e) {
            System.out.println("Keine Temperatur vorhanden " + e);
        }
        return sum;
    }

    public void addWithTemperaturCheck(Temperatur temperatur) {
        if (!this.isEmpty()) {
            if (temperatur.getCelsius() > this.getMaxTemperatur()) {
                TemperaturMaxEvent event = new TemperaturMaxEvent(this, temperatur);
                fireTemperaturMaxEvent(event);
            }
            if (temperatur.getCelsius() < this.getMinTemperatur()) {
                TemperaturMinEvent event = new TemperaturMinEvent(this, temperatur);
                fireTemperaturMinEvent(event);
            }
        }
        this.add(temperatur);
    }

    @Override
    public String toString() {
        return "Anzahl Temperaturen: " + size() + ", Durchscnittstemperatur: " + getAverageTemperatur() +", Max Temperatur: " + getMaxTemperatur() + ", Min Temperatur: " + getMinTemperatur();
    }

    public void addTemperaturMaxEventListener(TemperaturMaxEventListener listener) {
        if (listener != null) {
            maxChangeListeners.add(listener);
        }
    }

    public void removeTemperaturMaxEventListener(TemperaturMaxEventListener listener) {
        if (listener != null) {
            minChangeListeners.remove(listener);
        }
    }

    public void fireTemperaturMaxEvent(TemperaturMaxEvent event) {
        for (TemperaturMaxEventListener listener : maxChangeListeners) {
            listener.temperaturMaxChange(event);
        }
    }

    public void addTemperaturMinEventListener(TemperaturMinEventListener listener) {
        if (listener != null) {
            minChangeListeners.add(listener);
        }
    }

    public void removeTemperaturMinEventListener(TemperaturMinEventListener listener) {
        if (listener != null) {
            minChangeListeners.remove(listener);
        }
    }

    public void fireTemperaturMinEvent(TemperaturMinEvent event) {
        for (TemperaturMinEventListener listener : minChangeListeners) {
            listener.temperaturMinChange(event);
        }
    }

}
