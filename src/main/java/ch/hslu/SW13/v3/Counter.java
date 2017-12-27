package ch.hslu.SW13.v3;

public final class Counter {

    private long count;

    public synchronized void increment() {
        long temp = this.count;
        temp++;
        Thread.yield();
        this.count = temp;
    }

    public long getCount() {
        return this.count;
    }
}