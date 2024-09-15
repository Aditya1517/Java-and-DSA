// import java.util.*;

public class pairInArray {

    public static void pairs(int number[]){
        int total_pairs = 0;
        for(int i =0;i<number.length;i++){
            int curr = number[i];
            for(int j=i+1;j<number.length;j++){
                System.out.print("("+curr+","+number[j]+")");
                total_pairs++;
            }
            System.out.println();
        }
        System.out.println(total_pairs);
    }
    public static void main(String args[]){
        int number[]={1,2,3,4,5,6,7};
        pairs(number);
    }
}
