package ch.hslu.SW02;

public class Temperatur {

    private float celsius;


    public Temperatur(float celsius){
        this.celsius = celsius;
    }

    public Temperatur(){

    }

    public float celsiusToKelvin(){
        return getCelsius() + 273.15f;
    }

    public float celsiusToFahreinheit(){
        return getCelsius() * 1.8f + 32;
    }

    public float getCelsius() {
        return celsius;
    }

    public void setCelsius(float celsius) {
        this.celsius = celsius;
    }

}
