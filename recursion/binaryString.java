// package recursion;

// print all the binary strings of size N without consiqutive ones

// company :- paytm

public class binaryString {
    public static void printBinaryString(int n, int lastPlace , String str){

        if(n==0){
            System.out.println(str);
            return;
        }

        if(lastPlace == 0){
            printBinaryString(n-1, 0, str+"0");
            printBinaryString(n-1, 1, str+"1");
        }
        else{
            printBinaryString(n-1, 0, str+"0");
        }
    }
    public static void main(String args[]){
        printBinaryString(4, 0, "");
    }
}
