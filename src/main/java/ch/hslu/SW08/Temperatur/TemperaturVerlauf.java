package ch.hslu.SW08.Temperatur;

import java.util.*;

public class TemperaturVerlauf {
    private List<Temperatur> temperaturs = new ArrayList<>();

    public void add(Temperatur temperatur){
        temperaturs.add(temperatur);
    }

    public void clear(){
        temperaturs.clear();
    }

    public int getCount(){
        return temperaturs.size();
    }

    public float getMaxTemperatur(){
        float max = 0;
        try {
            max = temperaturs.stream().max(Comparator.naturalOrder()).get().getCelsius();
        } catch (NoSuchElementException e) {
           System.out.println("Keine Temperatur vorhanden " + e);
        }
        return max;
    }

    public float getMinTemperatur(){
        float min = 0;
        try {
            min = temperaturs.stream().min(Comparator.naturalOrder()).get().getCelsius();
        } catch (NoSuchElementException e) {
            System.out.println("Keine Temperatur vorhanden " + e);
        }
        return min;
    }

    public float getAverageTemperatur(){
        float sum = 0;
        try {
            for (Temperatur temperatur: temperaturs) {
                sum += temperatur.getCelsius();
            }
        } catch (NoSuchElementException e) {
            System.out.println("Keine Temperatur vorhanden " + e);
        }
        return sum / temperaturs.size();
    }



}
