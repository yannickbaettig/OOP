package ch.hslu.Repetition.Temperatur;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.util.ArrayList;
import java.util.List;
import java.util.NoSuchElementException;

public class TemperaturVerlauf extends ArrayList<Temperatur> {
    List<TemperaturMaxListener> maxChangeListener = new ArrayList<>();
    List<TemperaturMinListener> minChangeListener = new ArrayList<>();
    private static final Logger LOG = LogManager.getLogger(TemperaturVerlauf.class);

    public Temperatur getMaxTemperatur(){
        Temperatur maxTemperatur = Temperatur.createFromCelsius(0);
        try {
             maxTemperatur = this.get(0);
            for(Temperatur temp: this) {
                if(temp.compareTo(maxTemperatur) > 0) {
                    maxTemperatur = temp;
                }
            }
        } catch (NoSuchElementException e){
            LOG.error(("Keine Temperatur vorhanden"));
        }
        return maxTemperatur;
        }


    public Temperatur getMinTemperatur(){
        Temperatur minTemperatur = Temperatur.createFromCelsius(0);

        try {
            minTemperatur = this.get(0);
            for(Temperatur temp: this) {
                if(temp.compareTo(minTemperatur) < 0) {
                    minTemperatur = temp;
                }
            }
        } catch (NoSuchElementException e){
            LOG.error(("Keine Temperatur vorhanden"));
        }
        return minTemperatur;
    }

    public Temperatur getAverageTemperatur(){
        float sum = 0;

        try {
            for(Temperatur temp: this) {
                sum += temp.getCelsius();
            }
        } catch (NoSuchElementException e){
            LOG.error(("Keine Temperatur vorhanden"));
        }

        float averageTemperatur = sum / this.size();
        return Temperatur.createFromCelsius(averageTemperatur);
    }

    public String toString(){
        return "Anzahl Temperaturen: " + size() + ", Durchschnittstemperatur: " + getAverageTemperatur() +", Max Temperatur: " + getMaxTemperatur() + ", Min Temperatur: " + getMinTemperatur();
    }

    public void addWithTemperaturCheck(Temperatur temp){
        if (!this.isEmpty()){
            if (temp.getCelsius() > getMaxTemperatur().getCelsius()) {
                fireTemperaturMaxEvent(new TemperaturMaxEvent(this, temp));
            }
            if (temp.getCelsius() < getMinTemperatur().getCelsius()) {
                fireTemperaturMinEvent(new TemperaturMinEvent(this, temp));
            }
        }
        this.add(temp);
    }


    public void addTemperaturMaxListener(TemperaturMaxListener listener){
        if (listener != null) {
            maxChangeListener.add(listener);
        }
    }

    public void removeTemperaturMaxListener(TemperaturMaxListener listener) {
        if(listener != null) {
            maxChangeListener.remove(listener);
        }
    }

    private void fireTemperaturMaxEvent(TemperaturMaxEvent evt) {
        for (TemperaturMaxListener listener : maxChangeListener){
            listener.temperaturMaxChange(evt);
        }
    }

    public void addTemperaturMinListener(TemperaturMinListener listener){
        if (listener != null) {
            minChangeListener.add(listener);
        }
    }

    public void removeTemperaturMaxListener(TemperaturMinListener listener) {
        if(listener != null) {
            minChangeListener.remove(listener);
        }
    }

    private void fireTemperaturMinEvent(TemperaturMinEvent evt) {
        for (TemperaturMinListener listener : minChangeListener){
            listener.temperaturMinChange(evt);
        }
    }

}
