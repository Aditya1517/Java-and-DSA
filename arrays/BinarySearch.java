import java.util.*;

public class BinarySearch {
    public static int binary_search(int number[],int key){
        int start=0;
        int end=number.length-1;
        while(start<=end){
            int mid = (start+end)/2;
            if(number[mid]==key){
                return mid;
            }
            else if(number[mid]<key){
                start=mid+1;
            }
            else{
                end=mid-1;
            }
        }
        return -1;
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a key which you want to find:");
        int key = sc.nextInt();
        int number[]={1,2,3,4,5,6,7,8,9,10};
        System.out.println("Number found at index "+binary_search(number, key));
        sc.close();
    }
}
