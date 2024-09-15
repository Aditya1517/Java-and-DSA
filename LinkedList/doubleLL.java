package LinkedList;

public class doubleLL {
    public class Node {
        int data;
        Node prev;
        Node next;
        
        Node(int data){
            this.data = data;
            this.prev = null;
            this.next = null;
        }
    }

    public static Node head;
    public static Node tail;
    public static int size;


    // add First
    public void addFirst(int data){
        Node newNode = new Node(data);
        size++;
        if(head==null){
            head = tail = newNode;
            return;
        }

        newNode.next = head;
        head.prev = newNode;
        head = newNode;
    }


    // remove first
    public void removeFirst(){

        if(head == null){
            System.out.println("DLL is empty");
            return;
        }

        if(size == 1){
            int val = head.data;
            head = tail = null;
            size--;
            System.out.println("Value deleted is "+val);
        }

        int val = head.data;
        head = head.next;
        head.prev = null;

        System.out.println("Value deleted is "+val);

        size--;
    }

    public void printDLL() {
        Node temp = head;

        System.out.println("null");
        while (temp != null) {
            System.out.print(temp.data + "<->");
            temp = temp.next;
        }
        System.out.println("null");
    }

    public static void main(String args[]) {
            doubleLL dll = new doubleLL();

            dll.addFirst(3);
            dll.addFirst(2);
            dll.addFirst(1);
            dll.addFirst(0);

            dll.printDLL();
            System.out.println("Size of DLL is "+size);

            dll.removeFirst();
            dll.printDLL();
            System.out.println("Size of DLL is "+size);
    }
}
