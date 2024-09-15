// asked in microsoft , amazon and samsung

import java.util.*;

public class diagonalSum { 
    public static int diagonalsum(int matrix[][]){  
        int sum = 0;
    // brute force approch
    // this method calculates the sum in O(n^2)
        // for(int i=0;i<matrix.length;i++){
        //     for(int j=0;j<matrix[0].length;j++){
                 // for diagonal matrix
        //         if(i==j){
        //             sum += matrix[i][j];
        //         }
        //         else if((i+j)==matrix.length){
        //             sum += matrix[i][j];
        //         }
        //     }
        // }

    // optimised approch
    // time complexity is O(n)
    for(int i=0;i<matrix.length;i++){
        // primary diagonal (i+j) i.e (i,i)
        sum += matrix[i][i];
        // secondary diagonal i+j = n-1 i.e j=n-1-i
        if(i != matrix.length-1-i){
            sum += matrix[i][matrix.length-1-i];
        }
    }

        return sum;
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter value of row:-");
        int row = sc.nextInt();
        System.out.println("Enter value of column:-");
        int column = sc.nextInt();

        int matrix[][] = new int[row][column];

        System.out.println("Enter values in matrix:-");
        for(int i=0;i<row;i++){
            for(int j=0;j<column;j++){
                matrix[i][j] = sc.nextInt();
            }
        }

        System.out.println("your matrix is:-");
        for(int i=0;i<row;i++){
            for(int j=0;j<column;j++){
                System.out.print(matrix[i][j]+" ");
            }
            System.out.println();
        }
        sc.close();
    }
}
