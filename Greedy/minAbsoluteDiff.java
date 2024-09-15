// given two arryas A & B of equal length . pair each element of arrya A to an elemnt in arrya B such that sum S of absulute diffrences of alll the pari is mimimum

package Greedy;

import java.util.*;

public class minAbsoluteDiff {
    public static void main(String args[]){    // time complexity : O(nlog(n))
        int A[] = {1,2,3};
        int B[] = {2,1,3};

        Arrays.sort(A);
        Arrays.sort(B);

        int minDiff = 0;

        for(int i=0;i<A.length;i++){
            minDiff += Math.abs(A[i]-B[i]);   // abs is the function for abslute differnce
        }

        System.out.println("Minimum absolute difference is :- "+minDiff);
    }
}
