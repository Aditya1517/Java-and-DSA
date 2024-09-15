// given an arrya of jobs , every job has deadline and profit , if the job is finished before deadline. It is also given that every job takes a single unit of time . Minimun possible deadline of the job is 1 . Maximize the toatl profit if only one job can be scheduled at a time .

package Greedy;

import java.util.*;

public class jobSequencingProblem {
    static class  Job {
        int deadline;
        int profit;
        int id;

        public Job(int i,int d,int p){
            id = i;
            deadline = d;
            profit = p;
        }
    }
    public static void main(String args[]){
        int jobInfo[][] = {{4,20},{1,10},{1,40},{1,30}};

        ArrayList<Job> jobs = new ArrayList<>();

        for(int i=0;i<jobInfo.length;i++){
            jobs.add(new Job(i, jobInfo[i][0], jobInfo[i][1]));
        }

        Collections.sort(jobs,(obj1,obj2)->obj2.profit-obj1.profit);   // lambda function for sorting in decending order

        ArrayList<Integer> seq = new ArrayList<>();
        int time = 0;

        for(int i=0;i<jobs.size();i++){
            Job curr = jobs.get(i);
            if(curr.deadline > time){
                seq.add(curr.id);
                time++;
            }
        }

        // print seq
        System.out.println("max jobs = "+seq.size());

        for(int i=0;i<seq.size();i++){
            System.out.print(seq.get(i)+" ");
        }
        System.out.println();
    }
}
