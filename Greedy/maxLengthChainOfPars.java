// given n pairs of number , 1st number is always smaller than second , a pair (c,d) can come after pair (a,b) if b<c , find largest chain which can be formed from a given set of pair 

package Greedy;

import java.util.*;

public class maxLengthChainOfPars {
    public static void main(String args[]){
        int pairs[][] = {{5,24},{39,60},{5,28},{27,40},{50,90}};

        Arrays.sort(pairs,Comparator.comparingDouble(o -> o[1]));

        int chainLen = 1;
        int chainEnd = pairs[0][1];

        for(int i=0;i<pairs.length;i++){
            if(pairs[i][0]>chainEnd){
                chainLen++;
                chainEnd = pairs[i][1];
            }
        }

        System.out.println("Maximum length of chain is :- " + chainLen);
    }
}
