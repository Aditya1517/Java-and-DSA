package ArrayList;

import java.util.ArrayList;

public class constainerwithmaxwater {

    // brute force approch
    public static int constainerWithMaxWater(ArrayList <Integer> height){
        int maxWater = 0;
        for(int i=0;i<height.size();i++){
            for(int j=i+1;j<height.size();j++){
                int heightPillar = Math.min(height.get(i), height.get(j));
                int width = j-i;
                int Water = heightPillar*width; 
                maxWater = Math.max(maxWater, Water);
            }
        }
        return maxWater;
    }

    // optimized approch :- two pointer approch
    public static int constainerWithMaxWaterOptimized(ArrayList <Integer> height){
        int maxWater = 0;
        int lp = 0;   // left pointer
        int rp = height.size()-1;   // right pointer
        while (lp<rp){
            int heightPillar = Math.min(height.get(lp), height.get(rp));
            int width = rp - lp;
            int water = heightPillar*width;
            maxWater = Math.max(maxWater, water);
            if(lp<rp){
                lp++;
            }else {  // (i.e lp>rp)
                rp++;
            }
        }
        return maxWater;
    }

    public static void main(String args[]){
        ArrayList<Integer> height = new ArrayList<>();
        height.add(1);
        height.add(8);
        height.add(6);
        height.add(2);
        height.add(5);
        height.add(4);
        height.add(8);
        height.add(3);
        height.add(7);

        // System.out.println(constainerWithMaxWater(height));
        System.out.println(constainerWithMaxWaterOptimized(height));
    }
}
