package ArrayList;

import java.util.ArrayList;

public class parisum1 {
    //brute force
    public static boolean pariSum1(ArrayList<Integer> list , int target){
        for(int i=0;i<list.size();i++){
            for(int j=i+1;j<list.size();j++){
                if(list.get(i)+list.get(j)==5){
                    return true;
                }
            }
        }
        return false;
    }

    // optimized :- two pointer approch 
    public static boolean pariSumOptimized(ArrayList<Integer>list,int target){
        int lp = 0;
        int rp = list.size()-1;
        while (lp<rp){
            if(list.get(lp)+list.get(rp)==target){
                return true;
            } else if (list.get(lp)+list.get(rp)<target){
                lp++;
            } else {
                rp++;
            }
        }
        return false;
    }
    public static void main(String args[]){
        ArrayList<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(8);
        list.add(6);
        list.add(2);
        list.add(5);
        list.add(4);
        list.add(8);
        list.add(3);
        list.add(7);

        int target = 5;
        
        pariSum1(list, target);
        pariSumOptimized(list, target);
    }
}
