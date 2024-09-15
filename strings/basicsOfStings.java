package strings;

import java.util.*;

public class basicsOfStings {

    public static void main(String args[]) {
        // char arr[] = { 'a', 'v', 's' };
        // String str = "abcd";
        // String str1 = new String("abcd");

        // strings are immutable , i.e then can not be changed once created

        // Scanner sc = new Scanner(System.in);

        // System.out.println("Enter a string:-");
        // String str2 = sc.next();  // here this function only takes a word upto space after the this do not take words
        // System.out.print("You entered a string:- "+str2);

        // System.out.println("Enter a string with space:-");
        // String str3 = sc.nextLine();  // this function takes many words
        // System.out.print("You entered a string:- "+str3);
        // System.out.println("Length of the string you enterd is "+str3.length());  // string_name.length() is the function we use to calculate the lenght of the function 
        // System.out.println(str3.charAt(0));  // this function tells which char is present at the given index and also by using loop we can print each letter of string charAt(i) 
        // and if we have given a specific condition then we can pick each letter by this method and check the condition  

        // String str4 = "tony";
        // String str5 = new String("tony");

        // System.out.println(str4.equals(str5));   // this how we compare strings

        // System.out.println(str4.substring(0,3));  // this how we obtain substring



        // comparing strings lexicographically
        // System.out.println("here capital and small cases are condidered "+str4.compareTo(str5));

        // System.out.println("here capital and small cases are not condidered "+str4.compareToIgnoreCase(str5));

        String fruits[] = {"mango","apple","banana"};
        String largest = fruits[0];
        for(int i=1;i<fruits.length;i++){
            if(largest.compareToIgnoreCase(fruits[i])<0){
                largest = fruits[i];
            }
        }
        System.out.println(largest);

    }
}
