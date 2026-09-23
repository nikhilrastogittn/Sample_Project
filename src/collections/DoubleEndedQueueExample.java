package collections;

import java.util.ArrayDeque;

public class DoubleEndedQueueExample {

    public static void main(String[] args) {

        ArrayDeque<Integer> deque = new ArrayDeque<>();
        deque.offer(12);
        deque.offer(23);
        deque.offerFirst(123);

        // offer()=offerLast()
        deque.offerLast(1);

        System.out.println(deque);

        System.out.println(deque.poll());

        System.out.println(deque.peekFirst());
        System.out.println(deque.pollFirst());

        System.out.println(deque.peekLast());
        System.out.println(deque.pollLast());




    }

}
