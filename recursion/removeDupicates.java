// package recursion;

public class removeDupicates {
    public static void removedupicates(String str, int idx,StringBuilder sb,boolean map[]){
            if(idx == str.length()){
                System.out.println(sb);
                return;
            }

            // kaam
            char currentChar = str.charAt(idx);
            if(map[currentChar - 'a'] == true){
                // duplicate
                removedupicates(str, idx+1, sb, map);
            }
            else{
                map[currentChar - 'a'] = true;
                removedupicates(str, idx, sb.append(currentChar), map);
            }
    }
    public static void main(String args[]){
        String str = "appnnacollage";
        removedupicates(str, 0, new StringBuilder(), new boolean[26]);

    }
}
