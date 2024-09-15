package LinkedList;

// import sorting.selectionSorting;

public class LinkedList {
    public static class Node {
        int data;
        Node next;
        
        // constructor
        public Node (int data){
            this.data = data;
            this.next = null;
        }
    }

    // every linked list has its head and tail , but length of the linked list is one then both the head and tail should point at the same node and if many nodes are there then head and tail are differents 

    public static Node head;
    public static Node tail;
    public static int size;  // java will initialize its value as 0 by default

    // addFirst 
    public void addFirst(int data){
        // step 1 :- create new node
        Node newNode = new Node(data);
        
        size++;

        // if the linkedList in empty 
        if(head == null){
            head = tail = newNode;
            return;
        }

        // step 2 :- newNode's next = head
        newNode.next = head; // link has been created 

        // step 3 :- head = newNode
        head = newNode;
    }

    // we are not using static keyword here because main function is static function and in static function we can only call static function , but now we will call the fucntions using objects of linkedList(ll)

    public void addLast(int data){
        // step 1 :- create a new node
        Node newNode = new Node(data);

        size++;

        // step 2 
        
        if(head == null){
            head = tail = newNode;
            return;
        }

        // step 3
        tail.next = newNode;
        tail = newNode;
    }

    // print linked list
    public void printLL(){

        Node temp = head;

        if(temp == null){
            System.out.println("LL is empty");
            return;
        }
        
        while (temp != null){
            System.out.print(temp.data + " ->");
            temp = temp.next;
        }
        System.out.println("null");
    }

    // add in the middle of 
    public void add(int index,int data){

        if(index==0){
            addFirst(data);
            return;
        }

        // create new node 
        Node newNode = new Node(data);
        
        size++;

        Node temp = head;
        int i = 0;

        while (i < index-1){
            temp = temp.next;
            i++;
        }

        // i = index -1 ; i.e temp = prev
        newNode.next = temp.next;
        temp.next = newNode;
    }

    // removeFirst
    public int removeFirst(){
        
        if(size==0){
            System.out.println("LL is empty");
            return Integer.MIN_VALUE;
        } else if (size == 1){
            int val = head.data;
            head = tail = null;

            size = 0;

            return val;
        }

        // value to be deleted is head's data
        int val = head.data;

        // step 2
        head = head.next;

        size--;

        return val;
    }

    // remove last 
    public int removeLast(){
        if(size==0){
            System.out.println("LL is empty");
        } else if (size == 1){
            int val = head.data;
            head = tail = null ;
            size = 0;
            return val;
        }

        // prev = size - 2;

        Node prev = head;
        for(int i=0;i<size-2;i++){
            prev = prev.next;
        }

        int val = prev.next.data;  // i.e tail's data
        prev.next = null;
        tail = prev;

        size--;

        return val;
    }

    // liner search
    public int itrSearch(int key){
        int i = 0;
        Node temp = head;
        while (temp != null){
            if(temp.data == key){
                return i;
            }
            temp = temp.next;
            i++;
        }
        return -1;
    }

    // recursive search
    public int recSearch(int key){
        return helper(head,key);
    }
    // helper function for recSearch
    public int helper(Node head,int key){
        // base case
        if(head == null){
            return -1;
        }

        if(head.data == key){
            return 0;
        }

        int idx = helper(head.next, key);

        if(idx == -1){
            return -1;
        }

        return idx+1;
    }

    // reverse a LL
    public void reverse(){
        Node prev = null;
        Node curr = tail = head ; // as we are reversing the LL so tail will be same as head and assignment of the vaules in java is from right to left 
        Node next;

        while (curr != null) {
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }

        head = prev ;
    }

    // delete nth node from last (amazon , flipcart , qualacamm )
    public void deleteNthnodefromEnd(int n){
        // calculate size of the LL
        int Size = 0;
        Node temp = head ;
        while (temp != null) {
            temp = temp.next;
            Size++;
        }

        // if we want delte nth node from last i.t (size-n+1)th from start 
        // if want to delete last node form last i.e 1st from start i.e head 
        if(n==Size){
            head = head.next;
            return;
        }

        // other than we have to reach at the index at Size-n

        int i=1;
        int iToFind = Size-n;
        Node prev = head;

        while (i < iToFind) {
            prev = prev.next;
            i++;
        }

        prev = prev.next.next;
        return;

    }

    // check if the LL is palindrom 
    
    // step 1 : find the mid 
    public Node findMid(Node head){  // helper function
        Node slow = head;
        Node fast = head;

        // for even case fast = null and in odd case fast.next = null
        while(fast != null && fast.next !=null){
            slow = slow.next; // jumps by +1
            fast = fast.next.next; // jumps by +2
        }

        return slow;  // now we have reach to mid i.e slow in on the mid now  
    }

    public boolean checkPalindrom(){

        // corner case 
        if(head == null || head.next == null){  // zero and one element LL is always palindrom
            return true;
        }

        // step 1 : find mid
        Node midNode = findMid(head);

        // step 2 : reverse 2nd half
        Node prev = null;
        Node curr = midNode;
        Node next;

        while(curr != null){
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }

        Node right =  prev;  // right half head
        Node left = head;

        // step 3 : check left half and right half 
        while(right != null){
            if(left.data != right.data){
                return false;
            }
            left = left.next;
            right = right.next;
        }
        return true;
    }

    
    // detecting cycle in ll
    public static boolean isCycle(){
        Node slow = head;
        Node fast = head;

        while(fast != null && fast.next != null){
            slow = slow.next;   // +1 jump
            fast = fast.next.next;  // +2 jump

            if(slow == fast){
                return true;
            }
        }
        return false;
    }


    // removing a loop / cycle in LL
    public static void removeCycle(){

        // 1.detect cycle

        Node slow = head;
        Node fast = head;
        boolean cycle = false;

        while(fast != null && fast.next != null){
            slow = slow.next;
            fast = fast.next.next;
            if(fast == slow){
                cycle = true;
                break;
            }
        }

        if(cycle == false){
            return;
        }

        // 2.fing meeting point

        slow = head;
        Node prev = null;
        
        while (fast != slow){
            prev = fast;
            slow = slow.next;
            fast = fast.next;
        }

        // 3.remove  cycle -> last.next = null

        prev.next = null;
    }


    //merge sort

    // helper function for merge sort 
    private Node getMid(Node head){
        Node slow = head;
        Node fast = head.next;

        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow;
    }

    // merge function
    private Node merge(Node headL,Node headR){
        Node mergedLL = new Node(-1);
        Node temp = mergedLL;

        while (headL != null && headR != null) {
            if(headL.data <= headR.data){
                temp.next = headL;
                headL = headL.next;
                temp = temp.next;
            } else {
                temp.next = headR;
                headR = headR.next;
                temp = temp.next;
            }
        }
        // now to loops for remaining nodes 
        while(headL != null){
            temp.next = headL;
            headL = headL.next;
            temp = temp.next;
        }

        while(headR != null){
            temp.next = headR;
            headR = headR.next;
            temp = temp.next;
        }

        return mergedLL.next;
    }

    // merge sort on LL
    public Node mergeSort(Node head){

        // base case
        if(head == null || head.next == null){
            return head;
        }

        // fing mid
        Node mid = getMid(head);

        // left and right merge sort 
        Node rightHead = mid.next;
        mid.next = null;
        Node newLeft = mergeSort(head);
        Node newRight = mergeSort(rightHead);

        // merge 
        return merge(newLeft,newRight);
    }



    // zig zag LL
    public void zigzag(){
        // find mid
        Node slow = head;
        Node fast = head.next;
        while (fast != null && fast.next != null){
            slow = slow.next;
            fast = fast.next.next;
        }
        Node mid = slow;

        // reverse 2nd half
        Node curr = mid.next;
        mid.next = null;
        Node prev = null;
        Node next;

        while(curr != null){
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }

        tail = prev;

        Node left = head;
        Node right = prev;
        Node nextL,nextR;

        // alternate merge
        while(left != null && right != null){
            nextL = left.next;
            left.next = right;
            nextR = right.next;
            right.next = nextL;

            // updation
            left = nextL;
            right = nextR;
        }
    }


    public static void main(String args[]){
        // LinkedList ll = new LinkedList();
        // ll.addFirst(2);
        // ll.addFirst(1);
        // ll.addLast(3);
        // ll.addLast(4);

        // ll.add(2, 9);

        // ll.printLL();
        // // System.out.println(size);

        // ll.removeFirst();
        // ll.printLL();

        // ll.removeLast();
        // ll.printLL();

        // System.out.println(ll.itrSearch(2));
        // System.out.println(ll.itrSearch(10));

        // System.out.println(ll.recSearch(3));
        // System.out.println(ll.recSearch(10));

        // ll.reverse();
        // ll.printLL();

        // head = new Node(1);
        // Node temp = new Node(2);
        // head.next = temp;
        // head.next.next = new Node(3);
        // head.next.next.next = head;

        // System.out.println(isCycle());
        // removeCycle();
        // System.out.println(isCycle());

        LinkedList ll = new LinkedList();
        ll.addLast(1);
        ll.addLast(2);
        ll.addLast(3);
        ll.addLast(4);
        ll.addLast(5);

        ll.printLL();

        // ll.head = ll.mergeSort(ll.head);

        ll.zigzag();
        ll.printLL();

    }
}
