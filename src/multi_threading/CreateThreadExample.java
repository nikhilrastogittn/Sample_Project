package multi_threading;

public class CreateThreadExample {

    public static Object SharedObject = new Object();

    public static void main(String[] args) {

        System.out.println("Hello World");
        MyThread myThread = new MyThread();
        myThread.start();

        Thread myThread2 = new Thread(() -> {
            System.out.println("Thread 2 is running");
            System.out.println("Shared Object hashcode (Thread 2):" + SharedObject.hashCode());
        });

        myThread2.start();

        Runnable myRunnable = new Runnable() {
            @Override
            public void run() {
                System.out.println("Thread 3 is running");
                System.out.println("Shared Object hashcode (Thread 3):" + SharedObject.hashCode());
                System.out.println("Thread Name:"+Thread.currentThread().getName());
                System.out.println("Thread State:"+Thread.currentThread().getState());
            }
        };

        Thread myThread3 = new Thread(myRunnable);

        myThread3.start();

        Runnable myRunnable2 = () -> {
            System.out.println("Thread 4 is running");
            try {
                Thread.sleep(2000);
            } catch (Exception e) {
                System.out.println("Exception in sleep:" + e.getMessage());
            }
            System.out.println(Thread.currentThread().getName());
            System.out.println(Thread.currentThread().getState());
        };

        Thread myThread4 = new Thread(myRunnable2);

        myThread4.setDaemon(true);

        myThread4.start();


        System.out.println("Main Thread ended");


    }
}

class MyThread extends Thread {

    @Override
    public void run() {
        System.out.println("Thread 1 is running");
    }
}
