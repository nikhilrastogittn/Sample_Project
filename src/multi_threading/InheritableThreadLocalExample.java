package multi_threading;

public class InheritableThreadLocalExample {

    private static InheritableThreadLocal inheritableThreadLocal = new InheritableThreadLocal<>();

    public static void main(String[] args) throws InterruptedException {

        inheritableThreadLocal.set("Test 1234");

        var t1 = new Thread(() -> {

            System.out.println(Thread.currentThread().getName() + ":" + inheritableThreadLocal.get());
            inheritableThreadLocal.set("ABC1234");
            System.out.println(Thread.currentThread().getName() + ":" + inheritableThreadLocal.get());
        });

        t1.start();
        t1.join();

        System.out.println(Thread.currentThread().getName() + ":" + inheritableThreadLocal.get());

    }

}
