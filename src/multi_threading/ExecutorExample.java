package multi_threading;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ExecutorExample {

    public static void main(String[] args) {
        ExecutorService singleThreadExecutor = Executors.newSingleThreadExecutor();
        System.out.println("Single Thread Executor");
        for (int i = 0; i <= 5; i++) {
            int taskId = i;
            singleThreadExecutor.execute(() -> {
                System.out.println("Single Thread Task:" + taskId + "executed by"
                        + Thread.currentThread().getName());
            });
        }

        singleThreadExecutor.shutdown();

        ExecutorService fixedThreadPool = Executors.newFixedThreadPool(3);
        System.out.println("\n Fixed Thread Pool:");

        for (int i = 1; i <= 5; i++) {
            final int taskId = i;
            fixedThreadPool.submit(() -> {
                System.out.println("Fixed Thread Task " + taskId
                        + "executed by Thread:" + Thread.currentThread().getName());
            });
        }

        fixedThreadPool.shutdown();


        ExecutorService cachedThreadPool = Executors.newCachedThreadPool();

        System.out.println("Cached Thread Pool:");

        for (int i = 0; i <= 5; i++) {
            int taskId = i;

            cachedThreadPool.submit(() -> {
                System.out.println("Cached Thread Task:" + taskId
                        + "executed by Thread:" + Thread.currentThread().getName());

            });
        }

        cachedThreadPool.shutdown();


    }
}
