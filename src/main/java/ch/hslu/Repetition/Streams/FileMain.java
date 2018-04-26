package ch.hslu.Repetition.Streams;

import ch.hslu.Repetition.Temperatur.Temperatur;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class FileMain {
    private static final Logger LOG = LogManager.getLogger(ch.hslu.SW11.File.FileMain.class);
    private static final File FILE = new File("/Users/yannickbattig/Projekte/HSLU Projects/OOP_Uebungen/src/test/resources/netatmo-export-201608-201610.csv");

    public static void main(String[] args) {
        MeasuringHistory measuringHistory = new MeasuringHistory();
        String line;
        String seperator = ";";
        try(BufferedReader bufferedReader = new BufferedReader(new FileReader(FILE))){
            while ((line = bufferedReader.readLine()) != null){
              String[] split = line.split(seperator);
              LocalDateTime timeStamp = LocalDateTime.parse(split[1], DateTimeFormatter.ofPattern(("yyyy/MM/dd HH:mm:ss")));
              Temperatur temperatur = Temperatur.createFromCelsius(Float.valueOf(split[2]));
              Moisture moisture = new Moisture(Integer.valueOf(split[3]));
              MeasuringPoint measuringPoint = new MeasuringPoint(temperatur,timeStamp,moisture);
              measuringHistory.add(measuringPoint);
            }
        }catch (IOException e){
            LOG.error("File nicht verfügbar", e);
        }

        LOG.info("Highest Point: " +measuringHistory.getHighestPoint());
        LOG.info("Lowest Point: " +measuringHistory.getLowestPoint());
        LOG.info("Average Temperatur: " + measuringHistory.getAverageTemperatur());

    }
}
