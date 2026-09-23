package multi_threading;

import java.util.concurrent.*;

public class ThreadPoolExecutorExample {
    public static void main(String[] args) {

        ExecutorService threadPoolExecutor = new ThreadPoolExecutor(
                1,
                5,
                0L,
                TimeUnit.MILLISECONDS,
                new LinkedBlockingQueue<>(2)
        );

        for (int i = 1; i <= 5; i++) {
            int taskId = i;
            threadPoolExecutor.submit(() -> {
                try {
                    Thread.sleep(1000);
                } catch (Exception e) {
                    e.printStackTrace();
                }
                System.out.println("Thread Pool Executor" +
                        "Thread Task" + taskId +
                        "Executed by Thread:"+
                        Thread.currentThread().getName()
                );
            });
        }
        threadPoolExecutor.shutdown();

    }
}
