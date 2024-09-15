package heapsAndPriortyQueue;

import java.util.*;

public class priorityQueue
{

    static class Student implements Comparable <Student> {
        String name;
        int rank;
        
        Student(String name , int rank){
            this.name = name;
            this.rank = rank;
        }

        @Override
        public int compareTo(Student s2){
            return this.rank - s2.rank;  // hrer we are taking value as s2 because we are considring that s1 object will be craated by constructor and we are comparing with that 
        }
        // this how we compare objects of the class
    }
    public static void main(String[] args) {
        PriorityQueue <Integer> pq = new PriorityQueue<>();
        // to reverse the order of the the pq we pass argument as Comparator.reverseOrder() in the new PriorityQueue<>()
        
        pq.add(3);
        pq.add(4);
        pq.add(7);
        pq.add(1);

        // time for adding in pq is O(log(n))

        while (!pq.isEmpty()) {
            System.out.print(pq.peek()+" ");   // for peek O(1)
            pq.remove();   // remove O(log(n))
        }

        System.out.println();
        System.out.println();

        PriorityQueue <Student> pq1 = new PriorityQueue<>();

        pq1.add(new Student("A", 4));
        pq1.add(new Student("B", 2));
        pq1.add(new Student("C", 3));
        pq1.add(new Student("D", 1));

        while (!pq1.isEmpty()) {
            System.out.println(pq1.peek().name + "->" + pq1.peek().rank);
            pq1.remove();
        }

    }
}
