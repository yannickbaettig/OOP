package ch.hslu.SW08.Temperatur.v2;


import ch.hslu.SW08.Temperatur.Temperatur;

import java.util.EnumMap;
import java.util.Map;

public class Blei extends Element {
    private static final EnumMap<AggregatTemperatur, Temperatur> CHANGEPOINT = new EnumMap<>(AggregatTemperatur.class);
    static {
        CHANGEPOINT.put(AggregatTemperatur.BOILINGPOINT, new Temperatur(1744f));
        CHANGEPOINT.put(AggregatTemperatur.FLUIDPOINT, new Temperatur(327f));
    }

    public Blei() {
        super("Pb", CHANGEPOINT);
    }
}
