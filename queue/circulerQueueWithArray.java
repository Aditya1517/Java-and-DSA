package queue;


public class circulerQueueWithArray {
    static class queue {
        static int arr [];
        static int size;
        static int rear;
        static int front;

        queue(int n){
            arr = new int[n];
            size = n;
            rear = -1;
            front = -1;
        }

        public static boolean isEmpty(){
            return rear == -1 && front == -1;
        }

        public static boolean isFull(){
            return (rear+1)%size == front; // that is when rear and font are at same index
        }

        // add
        public static void add(int data){
            // chech if the queue is full or not
            if(isFull()){
                System.out.println("Queue is full");
                return;
            }

            // for adding first element
            if(front == -1){
                front = 0;
            }

            rear = (rear + 1)%size;
            arr[rear] = data;
        }

        // remove 
        public static int remove(){  // O(n) coz in remove we have to shift all the elements to left 
            if(isEmpty()){
                System.out.println("Queue is empty");
                return -1;
            }

            int result = arr[front];

            

            // if we remove last element i.e last == front
            if(rear == front){
                rear = front = -1;
            }
            else{
                front = (front+1)%size;
            }

            return front;
        }

        // peek 
        public static int peek(){
            if(isEmpty()){
                System.out.println("Queue is empty");
                return -1;
            }

            return arr[front];
        }
    }
    public static void main(String args[]){
        queue q = new queue(3);

        q.add(1);
        q.add(2);
        q.add(3);

        System.out.println(q.remove());
        q.add(4);
        System.out.println(q.remove());
        q.add(5);

        while (!q.isEmpty()) {
            System.out.print(q.peek()+" ");
            q.remove();
        }
    }
}
