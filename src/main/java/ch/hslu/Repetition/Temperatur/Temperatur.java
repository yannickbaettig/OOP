package ch.hslu.Repetition.Temperatur;

import java.util.Objects;

public class Temperatur implements Comparable<Temperatur>{
    private static final float MIN_CELSIUS = -273.15f;
    private static final float MIN_KELVIN = 0f;
    private static final float KELVIN_OFFSET = 273.15f;
    private float celsius;

    private Temperatur(float celsius) {
        this.celsius = celsius;
    }

    public static Temperatur createFromCelsius (float celsius) {
        if (celsius < MIN_CELSIUS) {
            throw new IllegalArgumentException();
        } else {
            return new Temperatur(celsius);
        }
    }

    public static Temperatur createFromKelvin (float kelvin) {
        if (kelvin < MIN_KELVIN){
            throw new IllegalArgumentException();
        } else {
            return new Temperatur(kelvinToCelsius(kelvin));
        }
    }

    public static float celsiusToKelvin(float celsius) {
        return (celsius + KELVIN_OFFSET);
    }

    public static float kelvinToCelsius(float kelvin) {
        return (kelvin - KELVIN_OFFSET);
    }

    public float getKelvin(){
        return (celsiusToKelvin(this.celsius));
    }

    public float getCelsius() {
        return celsius;
    }

    public int hashCode(){
       return Objects.hash(this.celsius);
    }

    public boolean equals(Object obj){
        if(this == obj){
            return true;
        }

        if(!(obj instanceof Temperatur)){
            return false;
        }

        Temperatur temp = (Temperatur) obj;

        return (Objects.equals(this.celsius, temp.celsius));
    }

    public int compareTo(Temperatur temp){
        return (Float.compare(this.celsius,temp.celsius));
    }

    @Override
    public String toString(){
        return "Celsius: "+ getCelsius()+ " Kelvin: " + getKelvin();
    }

}
