// import java.util.*;

// public class basics
// {
//     public static void main(String[] args) {
        // write a program for reverse a number and also for printing a given number (apna collage)
//         Scanner sc = new Scanner(System.in);
//         System.out.println("Enter a number:-");
//         int n = sc.nextInt();
//         int rev = 0;
//         while(n>0){
//             int last_digit = n%10;
//             rev = (rev*10) + last_digit;
//             n = n/10;
//         }
//         System.out.println("Reversed number is :- "+rev);
//         sc.close();
//     }
// }

import java.util.Scanner;

public class basics
{
    public static void main(String[] args) {
        // is a given nubmer prime or not
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number:-");
        int n = sc.nextInt();
        if(n==2){
            System.out.println("Number entered is a prime nubmer");
        }else{
            boolean isprime = true;
            for(int i =2;i<n-1;i++){
                if(n%i==0){
                    isprime = false;
                }
            }
            if(isprime==true){
                System.out.println("Number entered is prime");
            }
        }
        // we can further optimize this code using math.sqrt(n) this calculates square root of n and helps us finding more optimized ans

        

        sc.close();
        
    }
}