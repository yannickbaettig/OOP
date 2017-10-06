package ch.hslu.SW02;

import ch.hslu.SW03.Element;

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
    public String aggregatszustand(String element){
        String aggregatszustand;
        switch (element){
            case "N":
                aggregatszustand = aggreagatElement(-196f,-210f);
                break;
            case "Hg":
                aggregatszustand = aggreagatElement(357f,-38f);
                break;
            case "Pb":
                aggregatszustand = aggreagatElement(1744f,327f);
                break;
            default:
                aggregatszustand  = "kein Element";
        }
        return aggregatszustand;
    }

    private String aggreagatElement(float boilingpoint, float fluidpoint){
        if (celsius < fluidpoint){
            return "fest";
        } else if (celsius < boilingpoint){
            return "flüssig";
        } else {
            return "gasförmig";
        }
    }

    public String getAggreagtZustand(Element element){
        if (celsius < element.getFluidPoint()){
            return "fest";
        } else if (celsius < element.getBoilingPoint()){
            return "flüssig";
        } else {
            return "gasförmig";
        }
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
