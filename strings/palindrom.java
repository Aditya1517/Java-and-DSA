package strings;
import java.util.*;

public class palindrom {
    public static void isPalindrom(String str){
        for(int i=0;i<(str.length())/2;i++){
            if(str.charAt(i) != str.charAt(str.length()-1-i)){
                System.out.println("String entered is not a palindrom");
                return;
            }
        }
        System.out.println("String entered is palindrom");

    }
    public static void main(String args[]){

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a string:-");
        String str = sc.nextLine();

        isPalindrom(str);

    }
}
