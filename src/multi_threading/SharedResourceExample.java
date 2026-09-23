package multi_threading;

class SharedResource {


    // Synchronized and Volatile key word use case for instance variable visibility.


//    private volatile boolean flag = false;
//
//    public boolean isFlag() {
//        return flag;
//    }
//
//    public void setFlag(boolean flag) {
//        this.flag = flag;
//    }

    private  boolean flag = false;

    public synchronized boolean isFlag() {
        return flag;
    }

    public synchronized void setFlag(boolean flag) {
        this.flag = flag;
    }


}

public class SharedResourceExample {

    public static void main(String[] args) {

        SharedResource sharedResource = new SharedResource();

        // Thread 1
        new Thread(() -> {
            try {
                System.out.println("Thread 1 logic started");
                Thread.sleep(1000);
                System.out.println("Thread 1 login completed");
                sharedResource.setFlag(true);
                System.out.println("Flag set by Thread 1");
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }).start();

        new Thread(() -> {
            System.out.println("Thread 2 started");
            while (!sharedResource.isFlag()) {

            }
            System.out.println("Thread 2 logic completed");
        }).start();


    }

}
