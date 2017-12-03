package ch.hslu.SW11;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.io.*;

public class StreamMain {
    private static final Logger LOG = LogManager.getLogger(StreamMain.class);

    public static void main(String[] args) {
        try {
            FileOutputStream fileOutputStream = new FileOutputStream("/Users/yannickbattig/Projekte/OOP_Uebungen/src/test/resources/test.txt");
            DataOutputStream dataOutputStream = new DataOutputStream(fileOutputStream);
            dataOutputStream.writeInt(67);
            dataOutputStream.writeChar(67);
            dataOutputStream.close();
            fileOutputStream.close();
        } catch (IOException e){
            LOG.error("File not Found " + e);
        }

        //schliesst automatisch
        try (FileWriter fileWriter = new FileWriter("/Users/yannickbattig/Projekte/OOP_Uebungen/src/test/resources/test2.txt");){
            fileWriter.write("test");
        } catch (IOException e){
            LOG.error("File not Found " + e);
        }


        try {
            FileInputStream fileInputStream = new FileInputStream("/Users/yannickbattig/Projekte/OOP_Uebungen/src/test/resources/test.txt");
            DataInputStream dataInputStream = new DataInputStream(fileInputStream);
            int i = dataInputStream.readInt();
            char c = dataInputStream.readChar();
            LOG.info(i +" "+ c );
            fileInputStream.close();
            dataInputStream.close();
        } catch (IOException e){
            LOG.error("File not Found " + e);
        }

    }
}
