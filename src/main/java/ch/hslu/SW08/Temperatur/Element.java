package ch.hslu.SW08.Temperatur;

import java.util.Objects;

public class Element {
    private String id;
    private Temperatur boilingPoint;
    private Temperatur fluidPoint;

    protected Element(String id, Temperatur boilingPoint, Temperatur fluidPoint) {
        this.id = id;
        this.boilingPoint = boilingPoint;
        this.fluidPoint = fluidPoint;
    }

    public Aggregatzustand getAggregatszustand(Temperatur temperatur) {
        if (temperatur.compareTo(fluidPoint) < 0  ){
            return Aggregatzustand.SOLID;
        } else if (temperatur.compareTo(boilingPoint) < 0){
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
        return "Element{" + getClass().getSimpleName() +
                ", abbreviation = " + id +
                ", boilingPoint = " + boilingPoint.getCelsius() +
                ", fluidPoint = " + fluidPoint.getCelsius() +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Element element = (Element) o;
        return Objects.equals(id, element.id) &&
                Objects.equals(boilingPoint, element.boilingPoint) &&
                Objects.equals(fluidPoint, element.fluidPoint);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, boilingPoint, fluidPoint);
    }
}
