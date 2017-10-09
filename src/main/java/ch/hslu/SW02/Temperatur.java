package ch.hslu.SW02;

public class Temperatur {

    private float celsius;
    private final float kelvinOffSet = 273.15f;
    private final float fahreinheitOffSet = 32;
    private final float fahreinheitFaktor = 1.8f;

    public Temperatur(float celsius){
        this.celsius = celsius;
    }

    public Temperatur(){

    }

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

}
