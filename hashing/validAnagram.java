import java.util.*;

public class validAnagram {
    public static boolean isAnagram(String s,String t){
        HashMap <Character,Integer> map = new HashMap<>();

        for(int i=0;i<s.length();i++){
            map.put(s.charAt(i), map.getOrDefault(s.charAt(i),0)+1);
        }
        // getOrDefault :- this getOrDefault function sets default value it the key is not present or if key is present then it increases the frequency

        for(int i=0;i<t.length();i++){
            char ch = t.charAt(i);
            if(map.get(ch) != null){
                if(map.get(ch) == 1){
                    map.remove(ch);
                }
                else{
                    map.put(ch, map.get(ch)-1);
                }
            }
            else{
                return false;
            }
        }
        return map.isEmpty();
    }
    public static void main(String[] args) {
        // to chech the word of a pharase is anagram or not we will first add word and its frequency of first sting in hashmap and for other string we will remove it and if hashmap is empty then it is anagram


        String s = "race";
        String t = "care";

        System.out.println(isAnagram(s, t));

    }
}
