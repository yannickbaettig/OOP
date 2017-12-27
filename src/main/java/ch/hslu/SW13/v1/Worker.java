package ch.hslu.SW13.v1;

import com.sun.org.apache.xml.internal.security.utils.JavaUtils;

import java.sql.Timestamp;
import java.time.LocalDateTime;

public class Worker {

    public int processWork(){

        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        return 0;
    }
}
