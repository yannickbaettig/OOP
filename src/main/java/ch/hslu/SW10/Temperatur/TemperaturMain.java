package ch.hslu.SW10.Temperatur;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.util.Scanner;

public class TemperaturMain {
    private static final Logger LOG = LogManager.getLogger(TemperaturEingabe.class);

    public static void main(String[] args) {
        TemperaturEingabe temperaturEingabe = new TemperaturEingabe();
        temperaturEingabe.consoleInput();
    }
}
