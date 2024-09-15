// deque = double ended queuw
// dequeue = removing elements from the queue
// enqueue = adding elements in the queue

package queue;

import java.util.*;

public class deque {
    public static void main(String args[]){
        Deque<Integer> q = new LinkedList<>();

        q.addFirst(1);
        q.addFirst(2);
        System.out.println(q);

        q.removeFirst();
        System.out.println(q);

        q.addLast(3);
        q.addLast(4);
        System.out.println(q);

        q.removeLast();
        System.out.println(q);

        System.out.println("1st element =" + q.getFirst());
        System.out.println("last element =" + q.getLast());
    }
}
