package backTracking;

public class nQueens {
    public static void nqueens(char board[][],int row){

        // base case 
        if(row == board.length){
            printBoard(board);
            count++;
            return;
        }

        // if we want only one possible solution then convert the function to boolean type and after the count return it as true then in the below loop place the if statement and in it call the nqueends problem and after this loop return flase that means there is no any possible solution and also change the main function as 
        /* if(nqueens(board , o)){
            sout(solution is poosibvle);
            printBoard(board);
        }
        else{
            sout(solutoni is not possible)
        } */

        // column loop
        for(int j=0;j<board.length;j++){
            if(isSafe(board,row,j)){
                board[row][j] = 'Q';    // and here we place the queen 
                nqueens(board, row+1);
                board[row][j] = 'X';     // here we unplace the queen       
            }

        }

    }

    public static boolean isSafe(char board[][],int row,int col){
        // vertical up
        for(int i = row-1;i>=0;i--){
            if(board[i][col] == 'Q'){
                return false;
            }
        }

        // diagonal left up
        for(int i=row-1,j=col-1;i>=0 && j>=0;i--,j--){
            if(board[i][j] == 'Q'){
                return false;   
            }
        }

        // diagonal right up
        for(int i=row-1 , j=col+1 ; i>=0 && j<board.length;i--,j++){
            if(board[i][j] == 'Q'){
                return false;
            }
        }

        return true;
    }

    public static void printBoard(char board[][]){
        System.out.println("________");
        for(int i=0;i<board.length;i++){
            for(int j=0;j<board.length;j++){
                System.out.print(board[i][j]+" ");
            }
            System.out.println();
        }
    }

    
    // this count will count the total number of solutions possible
    static int count = 0;

    public static void main(String args[]){
        int n =4;
        char board [][] = new char[n][n];

        // initialize the board with "."
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                board[i][j] = 'X';
            }
        }

        nqueens(board, 0);
        System.out.println();
        System.out.println("Total number of solution/s : " + count);
    }
}
