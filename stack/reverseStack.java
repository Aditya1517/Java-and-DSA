package stack;

import java.util.*;

public class reverseStack {

        public static void pushatbottem(Stack<Integer> s,int data){
            if(s.empty()){
                s.push(data);
                return;
            }
            int top = s.pop();
            pushatbottem(s, data);
            s.push(top);
        }

        public static void reversestack(Stack<Integer> s){

            if(s.empty()){
                return;
            }

            int top = s.pop();
            reversestack(s);
            pushatbottem(s, top);
        }

        public static void printStack(Stack<Integer> s){
            while (!s.empty()) {
                System.out.println(s.pop());
            }
        }

    public static void main(String args[]){
        Stack<Integer> s = new Stack<>();
        s.push(1);
        s.push(2);
        s.push(3);

        // printStack(s);
        reversestack(s);
        printStack(s);
    }
}


