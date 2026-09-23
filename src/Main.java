import exception.FinallyExample;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.*;
import java.util.concurrent.atomic.AtomicInteger;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {


     char[] arr={'1','2','3'};
        System.out.println(new String(arr));

        Test t=new Test2(){};

        t.hello();

    }
}

interface Test{
    int abc=20;

    default void hello(){
        System.out.println(abc);
    }

}

interface Test2 extends Test{
    AtomicInteger abc=new AtomicInteger(30);
    default void hello(){
        abc.set(34);
        System.out.println(abc);
    }
}