// given an array of integers heights represnting the histogram bar height where the widthy of each bar is 1 , return the area of largest rectangle in histogram

package stack;

import java.util.*;

public class maxAreaHistogram {
    public static void maxArea(int arr[]){

        int maxArea = 0;
        
        int nsl [] = new int[arr.length];
        int nsr [] = new int[arr.length];

        // next smaller right (nsr)
        Stack<Integer> s = new Stack<>();

        for (int i=arr.length-1;i>=0;i--){
            while(!s.empty() && arr[s.peek()] >= arr[i]){
                s.pop();
            }
            if(s.empty()){
                nsr[i] = arr.length;
            } else {
                nsr[i] = s.peek();
            }
            s.push(i);
        }
        

        // next smaller left (nsl)
        s = new Stack<>();

        for (int i=0;i<arr.length;i++){
            while(!s.empty() && arr[s.peek()] >= arr[i]){
                s.pop();
            }
            if(s.empty()){
                nsl[i] = arr.length;
            } else {
                nsl[i] = s.peek();
            }
            s.push(i);
        }
        

        // current area 
        // width = j-i-1 = nsr[i]-nsl[i]-1;

        for(int i=0;i<arr.length;i++){
            int height = arr[i];
            int width = nsr[i]-nsl[i]-1;

            int currArea = height*width;
            maxArea = Math.max(currArea,maxArea);
        }

        System.out.println("Maximum area in histogram = "+maxArea);

    }
    public static void main(String args[]){
        int heights [] = {2,1,5,6,2,3};

        maxArea(heights);
    }
}
