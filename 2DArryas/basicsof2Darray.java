import java.util.*;

public class basicsof2Darray {
    public static boolean search(int matrix[][],int key){
        for(int i=0;i<matrix.length;i++){
            for(int j=0;j<matrix.length;j++){
                if(matrix[i][j]==key){
                    System.out.println("Found at index ("+i+","+j+")");
                    return true;
                }
            }
        }
        System.out.println("Key not found");
        return false;
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
        search(matrix, key);

        sc.close();
    }
}
