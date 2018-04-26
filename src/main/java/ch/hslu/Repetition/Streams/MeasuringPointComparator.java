package ch.hslu.Repetition.Streams;

import java.util.Comparator;

public class MeasuringPointComparator implements Comparator<MeasuringPoint> {

    public int compare(MeasuringPoint m1, MeasuringPoint m2){
        int compare = m1.getTemperatur().compareTo(m2.getTemperatur());
        if (compare == 0){
            compare = m1.getMoisture().compareTo(m2.getMoisture());
        }
        if (compare == 0){
            compare = m1.getTimeStamp().compareTo(m2.getTimeStamp());
        }
        return compare;
    }
}
