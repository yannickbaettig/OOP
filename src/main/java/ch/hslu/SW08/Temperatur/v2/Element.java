package ch.hslu.SW08.Temperatur.v2;

import ch.hslu.SW08.Temperatur.Aggregatzustand;
import ch.hslu.SW08.Temperatur.Temperatur;

import java.util.EnumMap;
import java.util.Objects;

public class Element {
    private String id;
    private EnumMap<AggregatTemperatur, Temperatur> changePoint;

    public Element(String id, EnumMap<AggregatTemperatur, Temperatur> changePoint) {
        this.id = id;
        this.changePoint = changePoint;
    }

    public Aggregatzustand getAggregatszustand(Temperatur temperatur) {
        if (temperatur.compareTo(changePoint.get(AggregatTemperatur.FLUIDPOINT)) < 0  ){
            return Aggregatzustand.SOLID;
        } else if (temperatur.compareTo(changePoint.get(AggregatTemperatur.BOILINGPOINT)) < 0){
            return Aggregatzustand.LIQUID;
        } else {
            return Aggregatzustand.GAS;
        }
    }

    public String getAggregatzustandText(Temperatur temperatur) {
        return id + " ist bei " + temperatur.getCelsius() + "° " + getAggregatszustand(temperatur).getValue();
    }

    @Override
    public String toString() {
        return "Element{" +
                "id='" + id + '\'' +
                ", changePoint=" + changePoint +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Element element = (Element) o;
        return Objects.equals(id, element.id) &&
                Objects.equals(changePoint, element.changePoint);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, changePoint);
    }
}
