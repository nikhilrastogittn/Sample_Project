package collections;

import java.util.LinkedList;
import java.util.Queue;

public class QueueExample {


    public static void main(String[] args){

        Queue<Integer> queue=new LinkedList<>();

        // add elements in queue
        queue.add(123);
        // add elements in queue
        queue.offer(12);
        // note : add throw exception if element unable to add while offer return false

        queue.offer(24);
        queue.offer(36);

        System.out.println(queue);

        // pulling out the element from queue
        System.out.println(queue.element());

        // get element which is ready to pull out
        System.out.println(queue.peek());

        //note if queue is empty peek() return null while element() throw exception


        // pulling out the element from queue
        System.out.println(queue.poll());

        // pulling out the element from queue
        System.out.println(queue.remove());

        // note if queue is empty poll() return null while remove() throw exception()





    }

}
