package ch.hslu.SW13.v2;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.*;

public class WorkerDemo {
    private static final Logger LOG = LogManager.getLogger(WorkerDemo.class);

    public static void main(final String[] args) throws ExecutionException, InterruptedException {
        List<Callable<Integer>> workerList = new ArrayList<>();

        for (int i = 0; i <= 10; i++) {
            workerList.add(new WorkerCallable(new Worker()));
        }

        ExecutorService execSvc = Executors.newFixedThreadPool(10);

        List<Future<Integer>> futureList = new ArrayList<>();

        while (futureList.size() < 5) {
            for (Callable<Integer> worker : workerList) {
                Future<Integer> result = execSvc.submit(worker);
                futureList.add(result);
            }
        }

        for (Future<Integer> future: futureList) {
            LOG.info("Resultat von Worker: " + future.get());
        }

    }

}
