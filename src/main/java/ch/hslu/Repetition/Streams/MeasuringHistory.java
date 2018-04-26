package ch.hslu.Repetition.Streams;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.NoSuchElementException;

public class MeasuringHistory extends ArrayList<MeasuringPoint> {
    MeasuringPointComparator comparator = new MeasuringPointComparator();

    public MeasuringPoint getHighestPoint() {
        try{
            MeasuringPoint max = this.get(0);
            for (MeasuringPoint m : this){
                if (comparator.compare(m,max) > 0){
                    max = m;
                }
            }
            return max;
        }catch (NoSuchElementException | IndexOutOfBoundsException | NullPointerException e){
            System.out.println("Fehler");
            return null;
        }
    }

    public MeasuringPoint getLowestPoint() {
        MeasuringPoint min = this.get(0);
        try{
            min = this.stream().min(comparator).get();
        }catch (NoSuchElementException | NullPointerException e){
            System.out.println("Fehler");
        }
        return min;
    }


    public float getAverageTemperatur() {
        float average = 0;
        float sum = 0;
        try {
            for (MeasuringPoint m: this) {
                sum += m.getTemperatur().getCelsius();
            }
            average = sum / this.size();
        } catch (NoSuchElementException e) {
            System.out.println("Fehler");
        }
        return average;
    }
}

