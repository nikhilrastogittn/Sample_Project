package multi_threading;

import java.util.ArrayList;
import java.util.List;

public class VirtualThreadExample {
    public static void main(String[] args) throws InterruptedException {

        final int numberOfThreads = 10_00_000;
        List<Thread> threadList = new ArrayList<>();

        Runnable objRunnable = () -> {

            System.out.println("Fetching data from API");
            try {
                Thread.sleep(10000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("Data fetched from API");
        };

        for (int i = 0; i < numberOfThreads; i++) {
            Thread thread = Thread.ofVirtual().unstarted(objRunnable);

            // CPU capacity and memory
            //Platform threads typically have a large thread stack and other resources
            thread.setDaemon(true);
            thread.setName("Thread" + i);
            thread.start();

            String str = String.format("Thread number %s", (Integer) i);
            System.out.println(str);
            threadList.add(thread);

        }

        for (Thread thr : threadList) {
            thr.join();
            System.out.println(thr.getName() + "Completed");
        }
    }
}
