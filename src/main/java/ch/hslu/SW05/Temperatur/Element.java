package ch.hslu.SW05.Temperatur;

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

}
