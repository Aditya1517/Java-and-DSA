// package recursion;

// import oops.staticKeyWord;

public class recursionBasics {
    public static void printDecring(int n){

        if(n==1){
            System.out.println(n);
            return;
        }

        System.out.println(n+" ");
        printDecring(n-1);
        
    }

    public static void printIncresing(int n){
        if(n==1){
            System.out.print(n+" ");
            return;
        }
        printIncresing(n-1);
        System.out.print(n+" ");
    }

    public static int factorial(int n){
        if(n==0){
            return 1;
        }
        // int fnm1 = factorial(n-1);
        int fn = n*factorial(n-1);
        return fn;
    }

    public static int sum(int n){
        if(n==1){
            return 1;
        }
        
        int sumnm1 = sum(n-1);
        int sumn = n+sumnm1;
        return sumn;
    }

    public static int fibonacci(int n){
        
        if(n<=1){
            return n;
        }

        return fibonacci(n-2)+fibonacci(n-1);
        // time complexity for fibonacci series is O(2^n)
    }

    public static int NthpowerOfX(int x,int n){
        if(n==0){
            return 1;
        }
        return x*NthpowerOfX(x, n-1);
    }

    public static int NthpowerOfXOptimized(int x, int n) {
        if (n == 0) {
            return 1;
        }
        
        int temp = NthpowerOfXOptimized(x, n / 2);
        
        if (n % 2 == 0) {
            return temp * temp;
        } else {
            return x * temp * temp;
        }
    }
    

    public static void main(String args[]){

        // printDecring(10);

        // printIncresing(10);

        // System.out.println(factorial(5));

        // System.out.println(sum(5));

        // System.out.println(fibonacci(5));

        // System.out.println(NthpowerOfX(1, 1000));

        System.out.println(NthpowerOfXOptimized(1, 1000000000));  // really really faster than privious 
        
    }
}
