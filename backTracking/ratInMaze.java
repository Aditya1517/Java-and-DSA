package backTracking;

// You are given a starting position for a rat which isstuck in a maze at an initial point(0,0)(the maze can be thought of as a2-dimensional plane).The maze would be given in the form of a square matrix of order N*N where the cell swith value 0 represent the maze’s blocked locations while value 1 is the open/available path that the rat can take to reach its destination.The rat's destination is at (N - 1, N - 1).Your task is to find all the possible paths that the rat can take to reach from source to destination in the maze.The possible directions that it can take to move in the maze are 'U'(up)i.e.(x,y-1),'D'(down)i.e. (x, y + 1) , 'L' (left) i.e. (x - 1, y), 'R' (right) i.e. (x + 1, y)


public class ratInMaze {

    public static void printSol(int sol[][]){
        for(int i=0;i<sol.length;i++){
            for(int j=0;j<sol.length;j++){
                System.out.print(" "+sol[i][j]+" ");
            }
            System.out.println();
        }
    }

    public static boolean isSafe(int maze[][],int x,int y){
        // if x and y are out of the maze then it will return false 
        if(x>=0 && x<maze.length && y>=0 && y<maze.length && maze[x][y]==1){
            return true;
        } else {
            return false;
        }
    }

    public static boolean solveMaze(int maze[][]){
        int n = maze.length;
        int sol[][] = new int [n][n];

        if(solveMazeUtil(maze,0,0,sol)==false){
            System.out.println("Solution does not exist");
            return false;
        }
        printSol(sol);
        return true;
    }

    public static boolean solveMazeUtil(int maze[][],int x,int y,int sol[][]){
        // base case
        if(x==maze.length-1 && y==maze.length-1 && maze[x][y] ==1){
            sol[x][y] =1;
            return true;
        }
     
        // Check if maze[x][y] is valid
        if(isSafe(maze,x,y)==true){
            if(sol[x][y]==1){ // this line checks if the cell has visited or not , if sol[x][y]==1 , means cell has visited and it does not lead to solution
                
                return false;
            }
     
            // Move forward in x direction
            sol[x][y]=1;
            if(solveMazeUtil(maze, x+1, y, sol)){
                return true;
            }
     
            // If moving in x direction doesn't give solution then move down in y direction 
            if(solveMazeUtil(maze, x, y+1, sol)){
                return true;
            }
     
            // If none of the above movements work then BACKTRACK: unmark x, y as part of solution path
            sol[x][y] = 0;
     
            // Move left in x direction
            if(solveMazeUtil(maze, x-1, y, sol)){
                return true;
            }
     
            // Move up in y direction
            if(solveMazeUtil(maze, x, y-1, sol)){
                return true;
            }
     
            // If none of the above movements work then BACKTRACK: unmark x, y as part of solution path
            sol[x][y] = 0;
     
            return false;
        }
     
        return false;
     }     

    public static void main(String args[]){
        int maze[][] = { { 1, 0, 0, 0 },
                         { 1, 1, 0, 1 },
                         { 0, 1, 0, 0 },
                         { 1, 1, 1, 1 } };

        solveMaze(maze);
    }
}

