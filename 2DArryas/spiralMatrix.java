// this quetion is asked in google , microsoft , amazon , oracle , adobe , apple

import java.util.*;

public class spiralMatrix {
    public static void printSpriralMatrix(int matrix[][]){
        int startRow = 0;
        int startCol = 0;
        int endRow = matrix.length-1;
        int endCol = matrix[0].length-1;

        while (startRow<=endRow && startCol<=endCol) {  // here if we not put equal to sign then it can cause proble when the columns and rows are odd 

            //top boundry :- row is fix and column is variable
            for(int j=startRow;j<=endCol;j++){
                System.out.print(matrix[startRow][j]+" ");
            }

            // right boundry :- column is fix and row is variable
            for(int i=startRow+1;i<=endRow;i++){
                System.out.print(matrix[i][endCol]+" ");
            }

            // bottom boundry :- row is fix and column is variable
            for(int j=endCol-1;j>=startCol;j--){
                if(startRow==endRow){  // this condition is for odd number of row so that row will not reapeat
                    break;
                }
                System.out.print(matrix[endRow][j]+" ");
            }
            
            // left boundry :- column is fix and row is variable
            for(int i=endRow-1;i>=startRow+1;i--){ 
                if(startCol==endCol){  // this condition is for odd number of column so that row will not reapeat
                    break;
                }
                System.out.println(matrix[i][startCol]+" ");
            }

            startRow++;
            startCol++;
            endRow--;
            endCol--;
        }
        System.out.println();
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

        System.out.println("Spiral matrix is:-");
        printSpriralMatrix(matrix);

        sc.close();
    }
}