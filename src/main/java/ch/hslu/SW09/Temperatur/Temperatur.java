package ch.hslu.SW09.Temperatur;

import java.util.Objects;

public final class Temperatur implements Comparable<Temperatur> {

    private static final float MIN_CELSIUS = -273.15f;
    private static final int MIN_KELVIN = 0;
    private final static float KELVIN_OFFSET = 273.15f;
    private final static float FAHREINHEIT_OFF_SET = 32;
    private final static float FAHREINHEIT_FAKTOR = 1.8f;

    private final float celsius;

    private Temperatur(float celsius){
        this.celsius = celsius;
    }

/*    public Temperatur(float temperatur, Unit unit) {
        this.celsius = temperatur - unit.getOffset();
    }
*/

    private Temperatur(Temperatur temperatur){
        this.celsius = temperatur.getCelsius();
    }

    public static Temperatur createFromCelsius (float celsius){
        if (celsius < MIN_CELSIUS){
            throw new IllegalArgumentException("ungültige Temperatur");
        }
        return new Temperatur(celsius);
    }

    public static Temperatur createFromKelvin (float kelvin){
        if (kelvin < MIN_KELVIN){
            throw new IllegalArgumentException("ungültige Temperatur");
        }
        return new Temperatur(kelvinToCelsius(kelvin));
    }

    public static float celsiusToKelvin(float celsius){
        return celsius + KELVIN_OFFSET;
    }

    public static float kelvinToCelsius(float kelvin){
        return kelvin - KELVIN_OFFSET;
    }

    public static float celsiusToFahreinheit(float celsius){
        return celsius * FAHREINHEIT_FAKTOR + FAHREINHEIT_OFF_SET;
    }

    public static float fahreinheitToCelsius(float fahreinheit){
        return (fahreinheit - FAHREINHEIT_OFF_SET) * FAHREINHEIT_FAKTOR;
    }

/*
    public void addTemperatur(float celsius){
        this.celsius += celsius;
    }
*/

    public float getKelvin() {
        return celsius + KELVIN_OFFSET;
    }

    public float getCelsius() {
        return this.celsius;
    }


    @Override
    public int hashCode() {
        return Objects.hash(celsius);
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj == null || obj.getClass() != this.getClass()) {
            return false;
        }

        final Temperatur temperatur = (Temperatur) obj;

        return (0 == Float.compare(celsius,temperatur.celsius));
    }

    @Override
    public int compareTo(Temperatur o) {
        return Float.compare(celsius, o.celsius);
    }

    @Override
    public String toString() {
        return "Celsius: " + celsius + "\n" +"Kelvin: " + getKelvin();
    }
}
