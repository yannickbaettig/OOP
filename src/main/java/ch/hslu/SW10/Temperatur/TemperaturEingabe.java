package ch.hslu.SW10.Temperatur;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.util.Scanner;

public class TemperaturEingabe implements TemperaturEventListener{
    private static final Logger LOG = LogManager.getLogger(TemperaturEingabe.class);

    public static void main(String[] args) {
        TemperaturVerlauf temperaturVerlauf = new TemperaturVerlauf();
        temperaturVerlauf.addTemperaturEventListener(new TemperaturEingabe());
        String input;
        Scanner scanner = new Scanner(System.in);
        do {
            LOG.info("Bitte Temperatur (°C) eingeben ('exit' zum Beenden): ");
            input = scanner.next();
            if (!input.equals("exit")){
                try {
                    Temperatur temperatur = Temperatur.createFromCelsius(Float.valueOf(input));
                    temperaturVerlauf.addWithTemperaturCheck(temperatur);
                    LOG.info(temperatur.getCelsius());
                } catch (IllegalArgumentException e) {
                    LOG.error("keine gültige Temperatur ", e);
                }
            }
        } while (!input.equals("exit"));
        LOG.info("Programm beendet.");
        LOG.info(temperaturVerlauf.toString());
    }

    @Override
    public void temperaturChange(TemperaturEvent evt) {
        if (evt.getType() == TemperaturType.MAX) {
            handleMaxTemperaturEvent(evt);
        }
        if (evt.getType() == TemperaturType.MIN) {
            handleMinTemperaturEvent(evt);
        }
    }

    private void handleMaxTemperaturEvent(TemperaturEvent evt) {
        LOG.info("Neue Max Temperatur: "+ evt.getTemperatur().getCelsius());
    }

    private void handleMinTemperaturEvent(TemperaturEvent evt) {
        LOG.info("Neue Min Temperatur: "+ evt.getTemperatur().getCelsius());
    }
}
