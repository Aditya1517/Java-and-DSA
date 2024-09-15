package trees;

// import java.util.*;

class Node {
    int data;
    Node left;
    Node right;

    Node(int data) {
        this.data = data;
        this.left = null;
        this.right = null;
    }
}

public class treeHeight {
    static class Node {
        int data;
        Node left;
        Node right;
    
        Node(int data) {
            this.data = data;
            this.left = null;
            this.right = null;
        }
    }


    // height of a tree 
    public static int height(Node root){
        if(root == null){
            return 0;
        }

        int lh = height(root.left);
        int rh = height(root.right);

        return Math.max(lh, rh)+1;
    }


    // number of nodes
    public static int count(Node root){
        if(root == null){
            return 0;
        }

        int leftCount = count(root.left);
        int rightCount = count(root.right);

        return leftCount + rightCount + 1;
    }


    // sum of roots
    public static int sum(Node root){
        if(root == null){
            return 0;
        }

        int leftsum = sum(root.left);
        int rightsum = sum(root.right);

        return leftsum + rightsum + root.data;
    }


    // diameter of a tree 1st approch
    public static int diameter1(Node root){   // O(n^2)
        if(root == null){
            return 0;
        }

        int leftdia = diameter1(root.left);
        int lefthit = height(root.left);

        int rightdia = diameter1(root.right);
        int righthit = height(root.right);

        int selddia = lefthit + righthit + 1;

        return Math.max(selddia, Math.max(rightdia, leftdia));
    }

    // diameter of a tree 2nd approch

    static class Info {
        int diam;
        int ht;

        public Info(int diam,int ht){
            this.diam = diam;
            this.ht = ht;
        }
        
    }
    public static Info diameter2(Node root){
        if(root == null){
            return new Info(0, 0);
        }
        
        Info leftInfo = diameter2(root.left);
        Info rightInfo = diameter2(root.right);

        int diam = Math.max(Math.max(leftInfo.diam, rightInfo.diam), leftInfo.ht +rightInfo.ht +1);

        int ht = Math.max(leftInfo.ht, rightInfo.ht) + 1;

        return new Info(diam, ht);
    }
    public static void main(String args[]){
        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.left = new Node(4);
        root.left.right = new Node(5);  
        root.right.left = new Node(6);
        root.right.right = new Node(7);

        System.out.println(height(root));

        System.out.println(count(root));

        System.out.println(sum(root));

        System.out.println(diameter1(root));

        System.out.println(diameter2(root).diam);
    }
}
