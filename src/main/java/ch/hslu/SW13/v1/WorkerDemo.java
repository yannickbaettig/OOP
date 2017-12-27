package ch.hslu.SW13.v1;

public class WorkerDemo {

    public static void main(final String[] args){
        Worker worker1 = new Worker();
        Worker worker2 = new Worker();
        Worker worker3 = new Worker();


        long start = System.currentTimeMillis();

        worker1.processWork();
        worker2.processWork();
        worker3.processWork();

        long end = System.currentTimeMillis();

        System.out.println((end-start) / 1000);





        final Thread thread = new Thread(worker1::processWork);
        final Thread thread2 = new Thread(worker2::processWork);
        final Thread thread3 = new Thread(worker3::processWork);

        thread.start();
        thread2.start();
        thread3.start();

        long start1 = System.currentTimeMillis();
        try {
            thread.join();
            thread2.join();
            thread3.join();
            long end1 = System.currentTimeMillis();
            System.out.println((end1-start1) / 1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }


    }

}
