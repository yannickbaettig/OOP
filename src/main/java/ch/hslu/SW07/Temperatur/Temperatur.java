package ch.hslu.SW07.Temperatur;

import java.util.Objects;

public class Temperatur implements Comparable<Temperatur> {

    private float celsius;
    private final float kelvinOffSet = 273.15f;
    private final float fahreinheitOffSet = 32;
    private final float fahreinheitFaktor = 1.8f;

    public Temperatur(float celsius){
        this.celsius = celsius;
    }

    public Temperatur(){}

    public float celsiusToKelvin(){
        return getCelsius() + kelvinOffSet;
    }

    public float celsiusToFahreinheit(){
        return getCelsius() * fahreinheitFaktor + fahreinheitOffSet;
    }

    public void addTemperatur(float temperatur){
        setCelsius(celsius + temperatur);
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
}
