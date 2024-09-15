package backTracking;

public class permutation {
    public static void findPermutaion(String str,String ans){
        // base case
        if(str.length()==0){
            System.out.println(ans);
            return;
        }

        // recurssion
        for(int i=0;i<str.length();i++){
            char curr = str.charAt(i);
            // now we have to delete that char at i so we will use substring method
            String newStr = str.substring(0, i) + str.substring(i+1);  // here we have created a new Stirng because if make changes in the present string that changes will be reflected in loop as well
            // here char at i gets deleted because endIndex is non inclusive
            findPermutaion(newStr, ans+curr);
        }
    }
    public static void main(String args[]){
        String str = "abc";
        findPermutaion(str, "");  // ans is passed as empty string
    }
}
