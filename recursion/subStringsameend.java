public class subStringsameend {
    public static int printStringStartEnd(String str,int i,int j,int n){
        if(n==1){
            return 1;
        }

        if(n<=0){
            return 0;
        }

        int res = printStringStartEnd(str, i+1, j, n-1)+printStringStartEnd(str, i, j+1, n-1)+printStringStartEnd(str, i+1, j-1, n-2);

        if(str.charAt(i)==str.charAt(j)){
            res++;
        }

        return res;
    }
    public static void main(String args[]){
        String str = "abaab";   
        int n = str.length();
        System.out.println(printStringStartEnd(str, 0, n-1, n));
    }
}
