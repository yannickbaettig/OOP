package ch.hslu.SW11.Temperatur;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.util.ArrayList;
import java.util.NoSuchElementException;

public class MeasuringHistory extends ArrayList<MeasuringPoint>{
    private final static Logger LOG = LogManager.getLogger(TemperaturVerlauf.class);

    public MeasuringPoint getHighestPoint(){
        MeasuringPoint max = null;
        try {
            max = this.stream().max(MeasuringPoint::compareTo).get();
        } catch (NoSuchElementException e) {
            LOG.error("Keine Temperatur vorhanden ", e);
        }
        return max;
    }

    public MeasuringPoint getLowestPoint(){
        MeasuringPoint min = null;
        try {
            min = this.stream().min(MeasuringPoint::compareTo).get();
        } catch (NoSuchElementException e) {
            LOG.error("Keine Temperatur vorhanden ", e);
        }
        return min;
    }

    public float getAverageTemperatur(){
        float average = 0;
        float sum = 0;
        try {
            for (MeasuringPoint m: this) {
                sum += m.getTemperatur().getCelsius();
            }
            average = sum / this.size();
        } catch (NoSuchElementException e) {
            LOG.error("Keine Temperatur vorhanden ", e);
        }
        return average;
    }
}
