package tries;

public class uniqueSubstring {
    static class Node{
        Node children[] = new Node[26]; 
        boolean eow = false; // eow = end of word :- this will become true when we reach at end of the word

        Node(){
            for(int i=0;i<children.length;i++){
                children[i] = null;
            }
        }
    }

    public static Node root = new Node();


    // insert in a trie
    public static void insert(String word){
        Node curr = root;

        for(int level=0;level<word.length();level++){  //O(l) = l is level  
            int idx = word.charAt(level) - 'a';  // this will give index which have to store in a children array

            if(curr.children[idx] == null){
                curr.children[idx] = new Node();
            }
            curr = curr.children[idx];
        }

        curr.eow = true;
    }

    public static int countNodes(Node root){
        if(root == null){
            return 0;
        }

        int count = 0;

        for(int i=0;i<26;i++){
            if(root.children[i] != null){
                count += countNodes(root.children[i]);
            }
        }
        return count+1;
    }

    public static void main(String[] args) {
        String str = "ababa";

        // 1. find all suffixes 
        // 2. insert them in a trie
        for(int i=0;i<str.length();i++){
            String suffix = str.substring(i);
            insert(suffix);
        }


        // 3. count number of nodes
        System.out.println(countNodes(root));

    }
}
