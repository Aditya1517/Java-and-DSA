package backTracking;

public class knightsTour {

    static int n = 8;

    public static boolean isSafe(int x,int y,int sol[][]){
        if(x>=0 && x<n && y>=0 && y<n && sol[x][y] == -1){
            return true;
        }
        else{
            return false;
        }
    }

    public static void printSolution(int sol[][]){
        for(int x=0;x<n;x++){
            for(int y=0;y<n;y++){
                System.out.print(sol[x][y]+" ");
            }
            System.out.println();
        }
    }
    
    public static boolean solveKT() {
        int sol[][] = new int [8][8];
        
        for(int x=0;x<n;x++){
            for(int y=0;y<n;y++){
                sol[x][y] = -1;
            }
        }

        // moves 
        int xMove [] = {2,1,-1,-2,-2,-1,1,2};
        int yMove [] = {1,2,2,1,-1,-2,-2,-1};
        
        // start the knight from (0,0)
        sol[0][0] = 0;

        if(!solveKTUtil(0,0,1,sol,xMove,yMove)){
            System.out.println("Solution does not exist");
            return false;
        }
        else{
            printSolution(sol);
        }

        return true;
    }

    public static boolean solveKTUtil(int x,int y,int movei,int sol[][],int xMove[],int yMove[]){
        int k,nextX,nextY;

        // base case
        if(movei==n*n){
            return true;
        }

        // recurssion
        for(k=0;k<8;k++){
            nextX = x+xMove[k];
            nextY = y+yMove[k];
            if(isSafe(nextX,nextY,sol)){
                sol[nextX][nextY] = movei;
                if(solveKTUtil(nextX, nextY, movei+1, sol, xMove, yMove)){
                    return true;
                }
                else{
                    sol[nextX][nextY] = -1;
                }
            }
        }
        return false;
    }

    public static void main(String args[]){
        solveKT();
    }
}


