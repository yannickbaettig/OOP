package ch.hslu.SW08.Temperatur;

public enum Aggregatzustand {
    SOLID("fest"),LIQUID("flüssig"),GAS("gasförmig") ;

    private final String value;

    Aggregatzustand(final String aggregatzustand) {
        this.value = aggregatzustand;
    }

    public String getValue() {
        return value;
    }
}
