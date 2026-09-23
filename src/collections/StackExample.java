package collections;

import java.util.Stack;

public class StackExample {

    public static void main(String[] argsS) {

        Stack<String> animals = new Stack<>();
        animals.push("Lion");
        animals.push("Dog");
        animals.push("Horse");
        animals.push("Cat");
        System.out.println("Stack : " + animals);

        System.out.println("Top Element:" + animals.peek());

        System.out.println("Pop:" + animals.pop());
        System.out.println("Top Element:" + animals.peek());

        System.out.println("First element:" + animals.firstElement());

        //Exception in thread "main" java.lang.ArrayIndexOutOfBoundsException: 20 >= 3
//        System.out.println("First element:"+animals.elementAt(20));

        // checking element is present or not in the index.
        // if present give 1 otherwise -1
        System.out.println(animals.indexOf("Dog",1));

    }

}
