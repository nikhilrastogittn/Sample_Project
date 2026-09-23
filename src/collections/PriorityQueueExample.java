package collections;

import java.util.Comparator;
import java.util.PriorityQueue;
import java.util.Queue;

public class PriorityQueueExample {

    public static void main(String[] args){

        Queue<Integer> priorityQueue=new PriorityQueue<>();

        priorityQueue.offer(29);
        priorityQueue.offer(12);
        priorityQueue.offer(45);
        priorityQueue.offer(1);

        // note : default highest priority given to smallest value.
        System.out.println(priorityQueue);

        System.out.println(priorityQueue.poll());
        System.out.println(priorityQueue);
        System.out.println(priorityQueue.peek());


        Queue<Integer> priorityQueue2=new PriorityQueue<>(Comparator.reverseOrder());

        priorityQueue2.offer(29);
        priorityQueue2.offer(12);
        priorityQueue2.offer(45);
        priorityQueue2.offer(1);

        System.out.println(priorityQueue2);

        System.out.println(priorityQueue2.poll());



    }

}
