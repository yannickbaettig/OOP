package ch.hslu.SW09.Temperatur;

public enum Unit {
    CELSIUS(0f), KELVIN(273.15f);

    private final float offset;

    Unit(float offset) {
        this.offset = offset;
    }

    public float getOffset(){
        return offset;
    }
}
