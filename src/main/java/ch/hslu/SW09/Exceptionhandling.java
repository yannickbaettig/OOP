package ch.hslu.SW09;

import ch.hslu.SW09.Temperatur.Temperatur;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.util.Scanner;

public class Exceptionhandling {
    private static final Logger LOG = LogManager.getLogger(Exceptionhandling.class);

    public static void main(String[] args) {
        String input;
        Scanner scanner = new Scanner(System.in);
        do {
            LOG.info("Bitte Temperatur (°C) eingeben ('exit' zum Beenden): ");
            input = scanner.next();
            try {
                Temperatur temperatur = Temperatur.createFromCelsius(Float.valueOf(input));
                LOG.info(temperatur.getCelsius());
            } catch (IllegalArgumentException e) {
                LOG.error("keine gültige Temperatur ", e);
            }
        } while (!input.equals("exit"));
        LOG.info("Programm beendet.");
    }

}
