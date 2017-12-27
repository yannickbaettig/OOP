package ch.hslu.SW13.v2;

public class Worker {

    public int processWork(){
        long start = System.currentTimeMillis();
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        long end = System.currentTimeMillis();

        return (int)((end-start) / 1000);
    }
}
