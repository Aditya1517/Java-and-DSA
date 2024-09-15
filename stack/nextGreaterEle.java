package stack;

import java.util.*;;

public class nextGreaterEle {
    public static void main(String args[]){
        int arr[] = {6,8,0,1,3};

        Stack<Integer> s = new Stack<>();

        int nxtGreater [] = new int[arr.length];


        // to find next greater in right we use the below loop but for finding next graeter from the left we reverse the loop 

        for(int i = arr.length-1;i>=0;i--){
            // 1 while loop 
            while (!s.empty() && arr[s.peek()] <= arr[i]){
                s.pop();
            }

            // 2 if else 
            if(s.empty()){
                nxtGreater[i] = -1;
            }
            else{
                nxtGreater[i] = arr[s.peek()];
            }

            // 3 push index of the element to stack 
            s.push(i);
        }

        for(int i=0;i<nxtGreater.length;i++){
            System.out.print(nxtGreater[i]+" ");
        }
        System.out.println();
    }
}



// forms of this questions 
// 1 next greater in right
// 2 next greater in left :- reverse the for loop 
// 3 next smaller in right :- reverse the condition in the whle loop
// 4 next smaller in left  :- reverse the for loop and condition in while loop