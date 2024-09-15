package stack;

public class stackWithLL {

    static class Node{
        int  data;
        Node next;
        Node(int data){
            this.data = data;
            this.next = null;
        }
    }

    static class stackwithll {

        static Node head = null;

        public static boolean isEmpty(){
            return head==null;
        }

        public static void push(int data){
            Node nweNode = new Node(data);
            if(isEmpty()){
                head = nweNode;
            }

            nweNode.next = head;
            head = nweNode;
        }

        // pop
        public static int pop(){
            if(isEmpty()){
                return -1;
            }

            int top = head.data;
            head = head.next;
            return top;
        }

        // peek
        public static int peek(){
            if(isEmpty()){
                return -1;
            }

            return head.data;
        }

    }
    public static void main(String args[]){
        stackwithll s = new stackwithll();
        s.push(1);
        s.push(2);
        s.push(3);

        while(!s.isEmpty()){
            System.out.println(s.peek());
            s.pop();
        }
    }
}