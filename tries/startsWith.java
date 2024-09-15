package tries;

public class startsWith {
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

    public static boolean startWith(String prefix){
        Node curr = root;

        for(int i=0;i<prefix.length();i++){
            int idx = prefix.charAt(i) - 'a';

            if(curr.children[idx]==null){
                return false;
            }

            curr = curr.children[idx];
        }

        return true;
    }
    public static void main(String[] args) {
        String words[] = {"i","like","sam","samsung","mobile","ice","the","a","there","their","any","thee"};

        for(int i=0;i<words.length;i++){
            insert(words[i]);
        }

        System.out.println(startWith("sam"));
    }
}
