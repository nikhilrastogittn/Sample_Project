package multi_threading;

import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;

public class AtomicExample {

    public static void main(String[] args) throws InterruptedException {

        SharedCounter sharedCounter = new SharedCounter();

        var t1=new Thread(() -> {
            System.out.println("Thread 1 Started");
            for (int i = 0; i < 50000; i++) {
                sharedCounter.increment();
            }
            System.out.println("Thread 1 completed");
        });

        var t2=new Thread(() -> {
            System.out.println("Thread 2 Started");
            for (int i = 0; i < 50000; i++) {
                sharedCounter.increment();
            }
            System.out.println("Thread 2 Completed");


        });

        t1.start();
        t2.start();
        t1.join();
        t2.join();

        System.out.println("Final Count:"+sharedCounter.getCount());


    }
}

class SharedCounter {

    // Race condition
//    private int count;


//    public  void increment() {
//        count++;
//    }
//
//    public int getCount() {
//        return count;
//    }


    // Use of atomic Class
//
//    private final AtomicInteger count=new AtomicInteger(0);
//
//
//    public  void increment() {
//        count.incrementAndGet();
//    }
//
//    public int getCount() {
//        return count.get();
//    }


//     Use Of synchronized keyword
    private int count;


    public  void increment() {
        synchronized (SharedCounter.class){
            count++;

        }
    }

    public int getCount() {
        return count;
    }


}
