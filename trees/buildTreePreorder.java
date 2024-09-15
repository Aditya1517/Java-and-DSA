package trees;

import java.util.LinkedList;
import java.util.Queue;

// Class representing a node in the binary tree
class Node {
    int data;       // Value of the node
    Node left;      // Pointer to the left child
    Node right;     // Pointer to the right child

    // Constructor to create a new node with given data
    Node(int data) {
        this.data = data;
        this.left = null;
        this.right = null;
    }
}

// Class representing the binary tree and various operations
class BinaryTree {
    static int idx = -1;   // Static index to keep track of the array position during tree construction

    // Method to build the binary tree from an array representation (preorder)
    public static Node buildTree(int nodes[]) {
        idx++;  // Move to the next index in the array
        
        // Base case: If the current element is -1, return null (indicating no node here)
        if (nodes[idx] == -1) {
            return null;
        }

        // Create a new node with the current element
        Node newNode = new Node(nodes[idx]);

        // Recursively build the left and right subtrees
        newNode.left = buildTree(nodes);
        newNode.right = buildTree(nodes);

        // Return the constructed node
        return newNode;
    }

    // Preorder traversal (Root -> Left -> Right)
    public static void preorder(Node root) {   // Time complexity: O(n)
        if (root == null) {
            return; // Base case: If the node is null, return
        }
        System.out.print(root.data + " "); // Visit the root node
        preorder(root.left);               // Recur on the left subtree
        preorder(root.right);              // Recur on the right subtree
    }

    // Inorder traversal (Left -> Root -> Right)
    public static void inorder(Node root) {   // Time complexity: O(n)
        if (root == null) {
            return; // Base case: If the node is null, return
        }
        inorder(root.left);                // Recur on the left subtree
        System.out.print(root.data + " "); // Visit the root node
        inorder(root.right);               // Recur on the right subtree
    }

    // Postorder traversal (Left -> Right -> Root)
    public static void postorder(Node root) {   // Time complexity: O(n)
        if (root == null) {
            return; // Base case: If the node is null, return
        }
        postorder(root.left);              // Recur on the left subtree
        postorder(root.right);             // Recur on the right subtree
        System.out.print(root.data + " "); // Visit the root node
    }

    // Level order traversal (Breadth-First)
    public static void levelOrder(Node root) {
        if (root == null) {
            return; // If the tree is empty, return
        }

        Queue<Node> q = new LinkedList<>(); // Queue to hold nodes at each level
        q.add(root); // Start with the root node
        q.add(null); // Add a null marker to indicate end of the current level

        while (!q.isEmpty()) {
            Node currNode = q.remove(); // Remove the front node from the queue

            if (currNode == null) { // If the node is null, we've reached the end of a level
                System.out.println(); // Move to the next line
                if (q.isEmpty()) {
                    break; // If the queue is empty, we're done
                } else {
                    q.add(null); // Add a new null marker for the next level
                }
            } else {
                System.out.print(currNode.data + " "); // Print the current node's data

                // Add the left and right children to the queue (if they exist)
                if (currNode.left != null) {
                    q.add(currNode.left);
                }
                if (currNode.right != null) {
                    q.add(currNode.right);
                }
            }
        }
    }
}

// Main class to demonstrate the tree building and traversal methods
class BuildTreePreorder {
    public static void main(String[] args) {
        // Array representation of the binary tree (preorder traversal)
        int nodes[] = { 1, 2, 4, -1, -1, 5, -1, -1, 3, -1, 6, -1, -1 };

        // Reset the index before building the tree
        BinaryTree.idx = -1;

        // Build the binary tree from the given array
        BinaryTree tree = new BinaryTree();
        Node root = tree.buildTree(nodes);

        // Print the root data to verify the tree construction
        System.out.println("Root of the tree: " + root.data);

        // Print the traversals of the tree
        System.out.print("Preorder traversal: ");
        tree.preorder(root);
        System.out.println();

        System.out.print("Inorder traversal: ");
        tree.inorder(root);
        System.out.println();

        System.out.print("Postorder traversal: ");
        tree.postorder(root);
        System.out.println();

        System.out.println("Level Order traversal:");
        tree.levelOrder(root);
    }
}
