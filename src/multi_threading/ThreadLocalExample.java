package multi_threading;

public class ThreadLocalExample {

    private static ThreadLocal threadLocal=new ThreadLocal<>();

    public static void main(String[] args){

        threadLocal.set(Thread.currentThread().getName()+":"+"my name is nikhil");

        new Thread(()->{
            System.out.println(Thread.currentThread().getName()+":"+threadLocal.get());
            threadLocal.set("hello from india");
            System.out.println(Thread.currentThread().getName()+":"+threadLocal.get());
            threadLocal.remove();
            System.out.println(Thread.currentThread().getName()+":"+threadLocal.get());

        }).start();

        System.out.println(threadLocal.get());

    }

}
