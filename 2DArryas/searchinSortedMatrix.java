import java.util.*;

public class searchinSortedMatrix {
    public static void searchInSortedMatrix(int matrix[][] , int key){
        // approch is staircase search
        // time complexity is O(m+n)
        int row = 0;
        int column = matrix[0].length-1;
        while (row<matrix.length && column>0) {
            if(key == matrix[row][column]){
                System.out.println("key found at ("+row+","+column+")");
                return;
            }
            else if(key < matrix[row][column]){
                column--;
            }
            else if(key > matrix[row][column]){
                row++;
            }
        }
        System.out.println("key not found");
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

        System.out.println("Enter a key you want to find:-");
        int key = sc.nextInt();
        searchInSortedMatrix(matrix, key);
        
        sc.close();
    }
}
