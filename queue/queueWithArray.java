package queue;

public class queueWithArray {
    static class queue {
        static int arr [];
        static int size;
        static int rear;

        queue(int n){
            arr = new int[n];
            size = n;
            rear = -1;
        }

        public static boolean isEmpty(){
            return rear==-1;
        }

        // add
        public static void add(int data){
            // chech if the queue is full or not
            if(rear == size-1){
                System.out.println("Queue is full");
                return;
            }

            rear = rear + 1;
            arr[rear] = data;
        }

        // remove 
        public static int remove(){  // O(n) coz in remove we have to shift all the elements to left 
            if(isEmpty()){
                System.out.println("Queue is empty");
                return -1;
            }

            int front = arr[0];

            // to remove elements from the queue shift all the elements 1 place to left because out front will always points towards arr[0]

            for(int i=0;i<rear;i++){
                arr[i] = arr[i+1];
            }
            rear = rear-1;

            return front;
        }

        // peek 
        public static int peek(){
            if(isEmpty()){
                System.out.println("Queue is empty");
                return -1;
            }

            return arr[0];
        }
    }
    public static void main(String args[]){
        queue q = new queue(5);

        q.add(1);
        q.add(2);
        q.add(3);

        while (!q.isEmpty()) {
            System.out.print(q.peek()+" ");
            q.remove();
        }
    }
}
