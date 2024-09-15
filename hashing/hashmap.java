// package hashing;

import java.util.*;

public class hashmap {
    public static void main(String[] args) {

        // creation
        HashMap <String,Integer> hm = new HashMap<>();
        

        // insert O(1)
        hm.put("India", 100);
        hm.put("China", 150);
        hm.put("USA", 50);

        System.out.println(hm);

        // get O(1)
        int populations = hm.get("India");

        System.out.println(populations);

        System.out.println(hm.get("Indonesia"));  // null

        // containsKey - O(1)
        System.out.println(hm.containsKey("India"));  // true
        System.out.println(hm.containsKey("Indonisia"));  // false

        // remove  // O(1)
        System.out.println(hm.remove("China"));  // removes key and value and return the value of that key
        System.out.println(hm);

        // size O(1)
        System.out.println(hm.size());

        // Empty O(1)
        System.out.println(hm.isEmpty());

        // clear :- clears all the hashmap
        hm.clear();
        System.out.println(hm.isEmpty());

    }
}
