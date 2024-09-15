import java.util.ArrayList;

public class buildBST {
    static class Node {
        int data;
        Node left;
        Node right;

        Node(int data){
            this.data = data;
        }
    }

    public static Node insert(Node root, int val){
        if(root == null){
            root = new Node(val);
            return root;
        }
        if(root.data > val){
            // left subtree
            root.left = insert(root.left, val);
        }
        else {
            // right subtree
            root.right = insert(root.right, val);
        }

        return root;
    }

    public static void inorder(Node root){
        if(root == null){
            return;
        }
        inorder(root.left);
        System.out.print(root.data + " ");
        inorder(root.right);
    }

    public static boolean search(Node root, int key){
        if(root == null){
            return false;
        }

        if(root.data == key){
            return true;
        }

        if(root.data > key){
            return search(root.left, key);
        }
        else {
            return search(root.right, key);
        }
    }

    public static Node delete(Node root , int val){
        if(root == null) {
            return null;
        }

        if(root.data < val){
            root.right = delete(root.right, val);
        }
        else if (root.data > val){
            root.left = delete(root.left, val);
        }
        else {
            // case 1: no child
            if(root.left == null && root.right == null){
                return null;
            }

            // case 2: single child
            if(root.left == null){
                return root.right;
            }
            else if(root.right == null){
                return root.left;
            }

            // case 3: two children
            Node IS = findInorderSuccessor(root.right); // inorder successor is left-most node in right subtree
            root.data = IS.data;
            root.right = delete(root.right, IS.data);
        }

        return root;
    }

    public static Node findInorderSuccessor(Node root){
        while (root.left != null) {
            root = root.left;
        }

        return root;
    }

    public static void printInRange(Node root , int k1 , int k2){
        if(root == null){
            return;
        }
        
        if(root.data >= k1 && root.data <= k2){
            printInRange(root.left, k1, k2);
            System.out.print(root.data + " ");
            printInRange(root.right, k1, k2);
        } else if (root.data < k1){
            printInRange(root.right, k1, k2);
        } else {
            printInRange(root.left, k1, k2);
        }
    }

    public static void printRoot2Leaf(Node root , ArrayList<Integer> path){

        if(root == null){
            return;
        }

        path.add(root.data);
        
        if(root.left == null && root.right == null){
            printPath(path);
        }

        printRoot2Leaf(root.left, path);
        printRoot2Leaf(root.right, path);

        path.remove(path.size()-1);
    }

    public static void printPath(ArrayList<Integer> path){
        for(int i=0;i<path.size();i++){
            System.out.print(path.get(i)+" ");
        }
        System.out.println("Null");
    }
    public static void main(String[] args){
        int values[] = {8 , 5, 3, 1, 4, 6, 10, 11, 14};

        Node root = null;

        for(int i = 0; i < values.length; i++){
            root = insert(root, values[i]);
        }

        System.out.print("Inorder traversal: ");
        inorder(root);
        System.out.println(); // to move to the next line after inorder traversal

        // Searching for key 1
        if(search(root, 1)){
            System.out.println("Key 1 is found in the BST.");
        } else {
            System.out.println("Key 1 is not found in the BST.");
        }

        // Deleting node with value 5
        root = delete(root, 5);

        // Inorder traversal after deletion
        System.out.print("Inorder after deletion of 5: ");
        inorder(root);
        System.out.println();

        // Printing nodes in range 5 to 12
        System.out.print("Nodes in range 5 to 12: ");
        printInRange(root, 5, 12);
        System.out.println();

        // Printing root to leaf paths
        System.out.println("Root to leaf paths:");
        printRoot2Leaf(root, new ArrayList<>());
    }
}
