// array is a list of elements of same type places in a contigius manner 
// size of array is static i.e we can not increase the size of array
// datatype arrya_name[] = new datatype [size]

// import java.util.*;

// when we pass arrya as an argument to a funtion , we pass it as a refrences i.e changes made in it will reflect in main funtion
// and when we pass by values , changes do not reflect in main function

public class array1
{

    public static void update(int marks[]){
        for(int i=0;i<marks.length;i++){
            marks[i]+=1;
        }
    }

    public static int largest_number(int number[]){
        int temp = number[0];
        for(int i=0;i<number.length;i++){
            if(temp<number[i]){
                temp = number[i];
            }
        }
        return temp;
    }

    public static void main(String[] args) {
        // creating an array
        // int mark[]=new int[50];

        // int marks[] = {97,98,99};
        // for(int i=0;i<marks.length;i++){
        //     System.out.print(marks[i]+" ");
        // }
        // System.out.println();
        // update(marks);          // this how we pass arrya as an argument to array
        // System.out.println();
        // for(int i=0;i<marks.length;i++){
        //     System.out.print(marks[i]+" ");
        // }

        int number[]={1,2,3,66,4,5,6,7,8,9,10};

        // String fruits[]={"apple","papaya","mango"};
        // length of the array
        // System.out.println("Length of the array is "+marks.length);
        int lar_num = largest_number(number);
        System.out.println("Largest number is "+lar_num);
    }
}