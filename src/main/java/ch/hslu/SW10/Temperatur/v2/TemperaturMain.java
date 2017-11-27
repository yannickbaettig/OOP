package ch.hslu.SW10.Temperatur.v2;

import ch.hslu.SW10.Temperatur.v2.TemperaturEingabe;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class TemperaturMain {
    private static final Logger LOG = LogManager.getLogger(TemperaturEingabe.class);

    public static void main(String[] args) {
        TemperaturEingabe temperaturEingabe = new TemperaturEingabe();
        temperaturEingabe.consoleInput();
    }
}
