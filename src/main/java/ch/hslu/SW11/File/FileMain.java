package ch.hslu.SW11.File;

import ch.hslu.SW11.Temperatur.MeasuringHistory;
import ch.hslu.SW11.Temperatur.Temperatur;
import ch.hslu.SW11.Temperatur.MeasuringPoint;
import ch.hslu.SW11.Temperatur.Moisture;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.io.*;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class FileMain {
    private static final Logger LOG = LogManager.getLogger(FileMain.class);
    private  static final File FILE = new File("/Users/yannickbattig/Projekte/OOP_Uebungen/src/test/resources/netatmo-export-201608-201610.csv");


    public static void main(String[] args) {
        MeasuringHistory measuringHistory = new MeasuringHistory();
        String line;
        String seperator = ";";
        try (BufferedReader bufferedReader = new BufferedReader(new FileReader(FILE))) {
            while ((line = bufferedReader.readLine()) != null) {
                String[] split = line.split(seperator);
                LocalDateTime timestamp = LocalDateTime.parse(split[1], DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm:ss"));
                Temperatur temperatur = Temperatur.createFromCelsius(Float.valueOf(split[2]));
                Moisture moisture = new Moisture(Integer.valueOf(split[3]));
                MeasuringPoint measuringPoint = new MeasuringPoint(timestamp,temperatur,moisture);
                measuringHistory.add(measuringPoint);
            }
        } catch (IOException e) {
            LOG.error(e.getMessage(), e);
        }

        LOG.info("Highest Point: " +measuringHistory.getHighestPoint());
        LOG.info("Lowest Point: " +measuringHistory.getLowestPoint());
        LOG.info("Average Temperatur: " + measuringHistory.getAverageTemperatur());

    }
}
