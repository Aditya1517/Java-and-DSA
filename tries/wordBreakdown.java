package tries;

public class wordBreakdown {
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
    

    // search in a key
    public static boolean search(String key){
        Node curr = root;

        for(int level=0;level<key.length();level++){  //O(l) = l is level  
            int idx = key.charAt(level) - 'a';  // this will give index which have to store in a children array

            if(curr.children[idx] == null){
                return false;
            }
            curr = curr.children[idx];
        }

        return curr.eow == true;
    }

    public static boolean wordBreak(String key){
        if(key.length() == 0){
            return true;
        }
        for(int i=1;i<=key.length();i++){
            // we have initiated i as 1 coz if we do i=0 then for a substring (0,-1) this will coz error and to avoid error
            // key.substring(0, i);
            // key.substring(i); // here i acts as ending index 

            if(search(key.substring(0,i)) && wordBreak(key.substring(i))) {
                return true;
            }
        }

        return false;   
    }
    public static void main(String[] args) {
        String words[] = {"i","like","sam","samsung","mobile","ice"};

        for(int i=0;i<words.length;i++){
            insert(words[i]);
        }

        String key = "ilikesamsung";

        System.out.println(wordBreak(key));
    }
}


// 1. create a trie from key
// 2. divide a string into every possible part
