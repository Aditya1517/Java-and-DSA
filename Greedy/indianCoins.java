//  we are given with infinite supply of denominations [1,2,5,10,20,50,100,500,2000] . Find minimum number of coins/notes to make change for a value 

package Greedy;

import java.util.*;

public class indianCoins {
    public static void main(String args[]){
        Integer coins[] = {1,2,5,10,20,50,100,500,2000};

        Arrays.sort(coins,Comparator.reverseOrder());

        int count = 0;
        int amont = 590;

        ArrayList<Integer> ans = new ArrayList<>();

        for(int i=0;i<coins.length;i++){
            if(coins[i] <= amont){
                while (coins[i] <= amont) {
                    count++;
                    ans.add(coins[i]);
                    amont -= coins[i];
                }
            }
        }

        System.out.println("Total minimum number coins used = "+count);

        for(int i=0;i<ans.size();i++){
            System.out.print(ans.get(i)+" ");
        }
    }
}
