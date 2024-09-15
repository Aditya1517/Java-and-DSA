package queue;

import java.util.*;

// jcf = java collection framework

public class queueJCF {
    public static void main(String args[]) {
        Queue<Integer> q = new LinkedList<Integer>();

        q.add(1);
        q.add(2);
        q.add(3);

        while (!q.isEmpty()) {
            System.out.println(q.peek());
            q.remove();
        }

    }
}


// in the above code we have written "Queue<Integer> q = new LinkedList<Integer>();" and not like "Queue<Integer> q = new Queue<Integer>();" because in java collection framework queue is not a class it is a interface and we can not make objects of interface thats why we make class by which we can implement queue like linkedlist