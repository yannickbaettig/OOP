package ch.hslu.Repetition.Streams;



import ch.hslu.Repetition.Temperatur.Temperatur;

import java.time.LocalDateTime;
import java.util.Objects;

public class MeasuringPoint implements Comparable<MeasuringPoint>{
    private Temperatur temperatur;
    private LocalDateTime timeStamp;
    private Moisture moisture;

    public MeasuringPoint(Temperatur temperatur, LocalDateTime timeStamp, Moisture moisture){
        this.temperatur = temperatur;
        this.timeStamp = timeStamp;
        this.moisture = moisture;
    }

    public Temperatur getTemperatur() {
        return temperatur;
    }

    public LocalDateTime getTimeStamp() {
        return timeStamp;
    }

    public Moisture getMoisture() {
        return moisture;
    }

    public int compareTo(MeasuringPoint o){
        return (Float.compare(temperatur.getCelsius(), o.getTemperatur().getCelsius()));
    }

    public int hashCode(){
        return Objects.hash(temperatur,timeStamp,moisture);
    }

    public boolean equals(Object o){
        if (this == o){ return true; }
        if (!(o instanceof MeasuringPoint)){ return false; }
        MeasuringPoint point = (MeasuringPoint) o;
        return (Objects.equals(temperatur,point.temperatur) && Objects.equals(timeStamp,point.timeStamp) && Objects.equals(moisture,point.moisture));
    }

    @Override
    public String toString(){
        return "Temperatur: " +temperatur +"Time: "+timeStamp+ "Moisture: "+ moisture;
    }

}
