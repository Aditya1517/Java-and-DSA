package stack;

import java.util.*;

public class pushAtBottem {
    public static void pushatbottem(Stack<Integer> s,int data){
        if(s.empty()){
            s.push(data);
            return;
        }
        int top = s.pop();
        pushatbottem(s, data);
        s.push(top);
    }
    public static void main(String args[]){
        Stack<Integer> s = new Stack<>();
        s.push(1);
        s.push(2);
        s.push(3);

        pushatbottem(s, 4);

        while(!s.empty()){
            System.out.println(s.pop());
        }
    }
}
