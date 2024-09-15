// given a route containg 4 directions (E,W,N,S) , find the shortest path to reach destination

package strings;
import java.util.*;

public class directionAndShortestPath {
    public static float getShortestPath(String path){
        int x=0;
        int y=0;
        for(int i=0;i<path.length();i++){
            char dir = path.charAt(i);
            
            // now check directions 
            if(dir == 'S'){
                y--;
            }
            else if(dir == 'N'){
                y++;
            }
            else if(dir == 'E'){
                x++;
            }
            else if(dir == 'W'){
                x--;
            }
            else{
                System.out.println("String is defective");
            }
        }

        int X2 = x*x;
        int Y2 = y*y;

        return (float)Math.sqrt(X2 + Y2);   // as math.sqrt return value in double we have type casted it in float value 
        
    }
    public static void main(String args[]){
        String directions = "WNEENESENNN";
        System.out.println("Shortest path is "+getShortestPath(directions));
    }
}
