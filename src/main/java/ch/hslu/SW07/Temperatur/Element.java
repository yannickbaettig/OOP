package ch.hslu.SW07.Temperatur;

import java.util.Objects;

public class Element {
    private String id;
    private float boilingPoint;
    private float fluidPoint;

    protected Element(String id, float boilingPoint, float fluidPoint) {
        this.id = id;
        this.boilingPoint = boilingPoint;
        this.fluidPoint = fluidPoint;
    }

    public String getAggregatszustand(Temperatur temperatur) {
        if (temperatur.getCelsius() < fluidPoint){
            return "fest";
        } else if (temperatur.getCelsius() < boilingPoint){
            return "flüssig";
        } else {
            return "gasförmig";
        }
    }

    @Override
    public String toString() {
        return "Element{" + getClass().getSimpleName() +
                ", abbreviation = '" + id + '\'' +
                ", boilingPoint = " + boilingPoint +
                ", fluidPoint = " + fluidPoint +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Element element = (Element) o;
        return Float.compare(element.boilingPoint, boilingPoint) == 0 &&
                Float.compare(element.fluidPoint, fluidPoint) == 0 &&
                Objects.equals(id, element.id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, boilingPoint, fluidPoint);
    }
}
