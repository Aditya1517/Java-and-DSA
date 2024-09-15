package backTracking;

public class sudokusolver {

    public static boolean isSafe(int sudoku[][],int row,int col,int digit){
        // check for column :- means column will be constant 
        for(int i=0;i<=8;i++){
            if(sudoku[i][col]==digit){
                return false;
            }
        }

        // check for row :- means row will be constant 
        for(int j=0;j<=8;j++){
            if(sudoku[row][j]==digit){
                return false;
            }
        }

        // check grid wise :- for indentifying in which grid it belongs we have to find starting row (sr) and starting column (sc)
        // gird
        int sr = (row/3)*3;
        int sc = (col/3)*3;
        
        // now by using sr and sc we will find the grid and this will become 3x3 grid
        for(int i=sr;i<sr+3;i++){
            for(int j=sc;j<sc+3;j++){
                if(sudoku[i][j]==digit){
                    return false;
                }
            }
        }

        // since we have not got any flase there , so it is safe to place the digit there 
        return true;
    }

    public static boolean sudokuSolver(int sudoku[][],int row , int col){
        // base case 
        if(row==9){
            return true;
        }

        // recurssion
        int nextRow = row , nextCol = col+1;
        if(col+1 == 9) {
            nextRow = row + 1;
            nextCol = 0;
        }

        if(sudoku[row][col] != 0){  // this condition is for all non zero elements
            sudokuSolver(sudoku, nextRow, nextCol);
        }

        for(int digit=1;digit<=9;digit++){
            if(isSafe(sudoku,row,col,digit)){
                sudoku[row][col] = digit;
                if(sudokuSolver(sudoku, nextRow, nextCol)){  // means sudokuSolver return true then return true
                    return true;
                }
                // but if sudoluSolver return false then make the sudoku[row][col] = 0
                sudoku[row][col] = 0;
            
            }
        }
        return false;
    }

    public static void printSudoku(int sudoku[][]){
        for(int i=0;i<9;i++){
            for(int j=0;j<9;j++){
                System.out.print(sudoku[i][j]);
            }
            System.out.println();
        }
    }

    public static void main(String args[]){
        int sudoku [][] = {{0,0,8,0,0,0,0,0,0},
                           {4,9,0,1,5,7,0,0,2},
                           {0,0,3,0,0,4,1,9,0},
                           {1,8,5,0,6,0,0,2,0},
                           {0,0,0,0,2,0,0,6,0},
                           {9,6,0,4,0,5,3,0,0},
                           {0,3,0,0,7,2,0,0,4},
                           {0,4,9,0,3,0,0,5,7},
                           {8,2,7,0,0,9,0,1,3}};

        if(sudokuSolver(sudoku, 0, 0)){
            System.out.println("Solution exists");
            printSudoku(sudoku);
        }
        else{
            System.out.println("Solution does not exist");
        }
    }
}
