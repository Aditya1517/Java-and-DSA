package ArrayList;

import java.util.ArrayList;

public class pairSUm2 {
    // in this rotaed arratList we have to we have to rotate lp and rp as lp will start form samllest and rp will start form largest 
    // here we will use modular airthmatic 
    // therefor lp will be lp = (lp+1)%n and rp = (n+rp+1)%n

    public static boolean pariSum2(ArrayList<Integer> list,int target){

        // find breaking point (bp)
        int bp = -1;
        for(int i=0;i<list.size();i++){
            if(list.get(i)>list.get(i+1)){  // breaking point
                bp = i;
                break;
            }
        }

        int lp = bp+1;
        int rp = bp;

        int n = list.size();

        while(lp != rp){
            // case 1
            if(list.get(lp)+list.get(rp)==target){
                return true;
            }

            // case 2
            if(list.get(lp)+list.get(rp)<target){
                lp = (lp+1)% n ;
            }
            else{
                // case 3
                rp = (n+rp-1)%n;
            }
        }
        return false;
    }

    public static void main(String args[]){
        ArrayList<Integer>list = new ArrayList<>();
        list.add(11);
        list.add(16);
        list.add(6);
        list.add(8);
        list.add(9);
        list.add(10);

        int target = 16;

        System.out.println(pariSum2(list, target));
    }
}
