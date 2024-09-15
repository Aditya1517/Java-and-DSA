// you are given 'n' activities with their start and end time . Select maximum number of activities that can be performed by a single person , assuming that a person can perform only one activity at a time. Activities are sorted according to end time

// time complexcity = O(log(n))
// if the activites sorted on the basis of start array then time complexcity = O(nlog(n))

package Greedy;

import java.util.*;

public class activitySelection {
    public static void main(String args[]){
        int start [] = {1,3,0,5,8,5};
        int end [] = {2,4,6,7,9,9};

        // if the activities are sorted based on start array
        int activities[][] = new int[start.length][3];
        for(int i=0;i<start.length;i++){
            activities[i][0] = i;
            activities[i][0] = start[i];
            activities[i][0] =end[i];
        }

        // sorting of 2-D array
        Arrays.sort(activities,Comparator.comparingDouble(o -> o[2]));
        // Comparator - this is lambda function i.e shortform of big function 
        // o -> o[2] here this tell java that sort the 2-D arrya based on the column number 2


        // given that end time basis sorted 
        int maxAct = 0;
        ArrayList<Integer> ans = new ArrayList<>();

        
        // 1st activity
        maxAct = 1;
        ans.add(0); // if the activites sorted on the basis of start array then instead of '0' add 'activities[0][0]'
        int lastEnd = end[0];   // if the activites sorted on the basis of start array then instead of 'end[0]' add 'activities[0][2]'

        for(int i=1;i<end.length;i++){
            if(start[i]>=lastEnd){  //  if the activites sorted on the basis of start array then instead of 'start[i]' add 'activities[i][1]'
                // activity select
                maxAct++;
                ans.add(i);  // if the activites sorted on the basis of start array then instead of '0' add 'activities[1][0]'
                lastEnd = end[i];  // if the activites sorted on the basis of start array then instead of '0' add 'activities[i][2]'
            }
        }
        System.out.println("Max Activities :" + maxAct);
        for(int i=0;i<ans.size();i++){
            System.out.print("A"+ans.get(i)+" ");
        }
    }
}
