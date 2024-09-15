// package DP;

public class fibonacci {
    public static int fib(int n,int f[]){
        if(n==0 || n==1){
            return n;
        }

        // as in fibonacci we calculate fib of any number so much times and waste out time ; instead we will store it in an array and use it directly
        // and by doing this time complexity becomes linear fron exponential

        if(f[n] != 0){  // this means fib is already calculated
            return f[n];
        }

        f[n] = fib(n-1, f) + fib(n-2, f);

        return f[n];
    }
    public static void main(String[] args) {
        int n = 10;

        int f[] = new int[n+1];

        System.out.println(fib(n,f));
    }
}
