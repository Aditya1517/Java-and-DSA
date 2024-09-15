// package hashing;

import java.util.*;

public class treemap {
    public static void main(String[] args) {
        // Create a TreeMap instance
        TreeMap<String, Integer> tm = new TreeMap<>();

        // Add key-value pairs to the TreeMap
        tm.put("apple", 10);
        tm.put("banana", 20);
        tm.put("cherry", 30);
        tm.put("date", 25);
        tm.put("elderberry", 15);

        // Retrieve and print the value associated with a specific key
        System.out.println("Value for key 'banana': " + tm.get("banana"));

        // Check if a key exists in the TreeMap
        System.out.println("TreeMap contains 'cherry': " + tm.containsKey("cherry"));

        // Remove an entry from the TreeMap
        tm.remove("date");
        System.out.println("Entry for 'date' removed.");

        // Iterate over the entries in the TreeMap and print them
        System.out.println("Entries in the TreeMap:");
        for (Map.Entry<String, Integer> entry : tm.entrySet()) {
            System.out.println(entry.getKey() + " -> " + entry.getValue());
        }

        // Get the first and last keys in the TreeMap
        System.out.println("First key: " + tm.firstKey());
        System.out.println("Last key: " + tm.lastKey());

        // Get a sub-map of the entries
        System.out.println("Sub-map from 'banana' to 'elderberry':");
        SortedMap<String, Integer> subMap = tm.subMap("banana", "elderberry");
        for (Map.Entry<String, Integer> entry : subMap.entrySet()) {
            System.out.println(entry.getKey() + " -> " + entry.getValue());
        }
    }
}
