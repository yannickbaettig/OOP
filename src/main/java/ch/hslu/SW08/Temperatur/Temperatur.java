package ch.hslu.SW08.Temperatur;

import java.util.Objects;

public final class Temperatur implements Comparable<Temperatur> {

    private float celsius;
    private final static float KELVIN_OFFSET = 273.15f;
    private final static float FAHREINHEIT_OFF_SET = 32;
    private final static float FAHREINHEIT_FAKTOR = 1.8f;

    public Temperatur(float celsius){
        this.celsius = celsius;
    }

    public Temperatur(Temperatur temperatur){
        this.celsius = temperatur.getCelsius();
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

    public void addTemperatur(float celsius){
        this.celsius += celsius;
    }

    public float getKelvin() {
        return celsius + KELVIN_OFFSET;
    }

    public void setKelvin(float kelvin) {
        celsius = kelvin - KELVIN_OFFSET;
    }

    public float getCelsius() {
        return this.celsius;
    }

    public void setCelsius(float celsius) {
        this.celsius = celsius;
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
