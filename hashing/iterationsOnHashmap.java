// package hashing;

import java.util.*;

public class iterationsOnHashmap {
    public static void main(String[] args) {

        HashMap<String, Integer> hm = new HashMap<>();

        hm.put("India", 100);
        hm.put("China", 150);
        hm.put("USA", 50);
        hm.put("Indonesia", 6);
        hm.put("Nepal", 5);

        // Iterate : We use Set DS to iterate on hashmap
        Set<String> keys = hm.keySet();
        System.out.println(keys);

        System.out.println();

        for (String k : keys) {
            System.out.println("Key = " + k + " , Value = " + hm.get(k));
        }
    }
}
