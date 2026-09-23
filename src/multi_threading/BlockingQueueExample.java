package multi_threading;

import java.util.concurrent.*;

public class BlockingQueueExample {

    public static void main(String[] args) {

        BlockingQueue<Integer> integerBlockingQueue = new ArrayBlockingQueue<>(10);

        ExecutorService executorService = Executors.newFixedThreadPool(5);


        executorService.submit(() -> {

            System.out.println("Producing elements to queue for processing");
            for (int i = 0; i < 10; i++) {
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
                System.out.println("produced elements:" + i);
                integerBlockingQueue.offer((Integer) i);
            }

            System.out.println("producing done");
        });

        executorService.submit(() -> {

            System.out.println("Consuming elements from queue ");

            while (true) {

                Thread.sleep(1000);

                Integer val = integerBlockingQueue.poll();
                if (val != null)
                    System.out.println("consumed element:" + val);
            }
        });


    }
}
