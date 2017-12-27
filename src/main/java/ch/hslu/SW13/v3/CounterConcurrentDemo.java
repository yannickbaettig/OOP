package ch.hslu.SW13.v3;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class CounterConcurrentDemo {
    private static final Logger LOG = LogManager.getLogger(CounterConcurrentDemo.class);


    public static void main(final String[] args) {
        final Counter counter = new Counter();
        final Thread[] threads = new Thread[3];
        for (int i = 0; i < threads.length; i++) {
            threads[i] = new Thread(new Worker(counter));
        }
        for (final Thread thread : threads) {
            thread.start();
        }
        waitForCompletion(threads);
        LOG.info("Zählerstand: " + counter.getCount());
    }

    private static void waitForCompletion(Thread[] threads) {
        for (Thread thread : threads){
            try {
                thread.join();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }


    private static final class Worker implements Runnable {
        private final Counter counter;

        Worker(final Counter counter) {
            this.counter = counter;
        }
        @Override
        public void run() {
            for (int i = 0; i < 10000; i++) {
                this.counter.increment();
            }
        }
    }

}


