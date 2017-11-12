package ch.hslu.SW08.Temperatur.v2;

import ch.hslu.SW08.Temperatur.v2.Element;
import ch.hslu.SW08.Temperatur.Temperatur;

import java.util.EnumMap;

public class Quecksilber extends Element {
    private static final EnumMap<AggregatTemperatur, Temperatur> CHANGEPOINT = new EnumMap<>(AggregatTemperatur.class);
    static {
        CHANGEPOINT.put(AggregatTemperatur.BOILINGPOINT, new Temperatur(357f));
        CHANGEPOINT.put(AggregatTemperatur.FLUIDPOINT, new Temperatur(-38f));
    }

    public Quecksilber() {
        super("Hg", CHANGEPOINT);
    }

    @Override
    public String toString() {
        return super.toString() + ", Achtung Giftig";
    }


}
