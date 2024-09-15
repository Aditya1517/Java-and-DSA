package heapsAndPriortyQueue;
import java.util.*;

public class heap {
    static class Heap {
        ArrayList<Integer> arr = new ArrayList<>();

        public void add(int data) {
            // Add at last index
            arr.add(data);

            int child = arr.size() - 1;
            int parent = (child - 1) / 2;

            // Swap till parent is greater than child
            while (child > 0 && arr.get(child) < arr.get(parent)) {
                int temp = arr.get(child);
                arr.set(child, arr.get(parent));
                arr.set(parent, temp);

                child = parent;
                parent = (child - 1) / 2;
            }
        }

        public int peek() {
            if (arr.isEmpty()) {
                throw new NoSuchElementException("Heap is empty");
            }
            return arr.get(0);
        }

        public int remove() {
            if (arr.isEmpty()) {
                throw new NoSuchElementException("Heap is empty");
            }

            int data = arr.get(0);

            // Step 1: Swap first and last value
            int temp = arr.get(0);
            arr.set(0, arr.get(arr.size() - 1));
            arr.set(arr.size() - 1, temp);

            // Step 2: Delete last element
            arr.remove(arr.size() - 1);

            // Step 3: Heapify
            heapify(0);

            return data;
        }

        private void heapify(int i) {
            int left = 2 * i + 1;
            int right = 2 * i + 2;

            int minidx = i;  // i is root

            if (left < arr.size() && arr.get(minidx) > arr.get(left)) {
                minidx = left;
            }

            if (right < arr.size() && arr.get(minidx) > arr.get(right)) {
                minidx = right;
            }

            if (minidx != i) {
                // Swap
                int temp = arr.get(i);
                arr.set(i, arr.get(minidx));
                arr.set(minidx, temp);

                heapify(minidx);
            }
        }

        public boolean isEmpty() {
            return arr.size() == 0;
        }
    }

    public static void main(String[] args) {
        Heap h = new Heap();
        h.add(3);
        h.add(4);
        h.add(1);
        h.add(5);

        while (!h.isEmpty()) {
            System.out.println(h.peek());
            h.remove();
        }
    }
}

// this works exactly same as priority queue which we created using JCF
