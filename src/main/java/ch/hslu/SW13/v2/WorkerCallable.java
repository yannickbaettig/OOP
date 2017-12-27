package ch.hslu.SW13.v2;

import java.util.concurrent.Callable;

public class WorkerCallable implements Callable <Integer> {
    private Worker worker;

    public WorkerCallable(Worker worker) {
        this.worker = worker;
    }

    @Override
    public Integer call() throws Exception {
        return worker.processWork();
    }
}
