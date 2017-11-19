package ch.hslu.SW08.Temperatur;

import java.util.*;

public class TemperaturVerlauf extends ArrayList<Temperatur>{

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



}
