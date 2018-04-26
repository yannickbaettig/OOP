package ch.hslu.Repetition.Temperatur;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.util.Scanner;

public class TemperaturEingabe {
    private static final Logger LOG = LogManager.getLogger(TemperaturEingabe.class);
    private TemperaturVerlauf temperaturVerlauf;

    public TemperaturEingabe() {
        temperaturVerlauf = new TemperaturVerlauf();
        temperaturVerlauf.addTemperaturMaxListener(new TemperaturMaxListener() {
            @Override
            public void temperaturMaxChange(TemperaturMaxEvent evt) {
                handleMaxEvent(evt);
            }
        });
        temperaturVerlauf.addTemperaturMinListener(new TemperaturMinListener() {

            public void temperaturMinChange(TemperaturMinEvent evt){
                handleMinEvent(evt);
            }
        });
    }

    public void consoleInput(){
        String input;
        Scanner scanner = new Scanner(System.in);

        do {
            LOG.info("Bitte Temperatur (°C) eingeben ('exit' zum Beenden): ");
            input = scanner.next();
            if (!input.equals("exit")){
                try {
                    Temperatur temp = Temperatur.createFromCelsius(Float.valueOf(input));
                    temperaturVerlauf.addWithTemperaturCheck(temp);
                    LOG.info(temp.getCelsius());
                } catch (IllegalArgumentException e){
                    LOG.error("keine gültige Eingabe ", e);
                }
            }
        }while (!input.equals("exit"));
        LOG.info("Prgoramm beendet");
        LOG.info(temperaturVerlauf.toString());
    }

    private void handleMaxEvent(TemperaturEvent evt){
        LOG.info("New Max Temperatur" + evt.getTemp().getCelsius());
    }

    private void handleMinEvent(TemperaturEvent evt){
        LOG.info(" New Min Temperatur" + evt.getTemp().getCelsius());
    }
}
