public class trappedRainWater {

    public static int trappedRainWater(int height[]){
        // calculate left max boundries in the form of array
        int leftmax[]=new int[height.length];
        leftmax[0]=height[0];
        for(int i=1;i<height.length;i++){
            leftmax[i]=Math.max(leftmax[i-1], height[i]);
        }

        // calculate right max boundries in the form of array
        int rightmax[]=new int[height.length];
        rightmax[height.length-1]=height[height.length-1];
        for(int i=height.length-2;i>=0;i--){
            rightmax[i]=Math.max(height[i], rightmax[i+1]);
        }

        // run a loop for calculating water level
        // water level = min(leftmax boundry,rightmax boundry)
        // trapped water = (water level-height[i])*width
        int trappedRainWater=0;
        for(int i=0;i<height.length;i++){
            int waterlevel=Math.min(leftmax[i], rightmax[i]);
            trappedRainWater = trappedRainWater + (waterlevel-height[i])*1;  // here width is 1 , if value of width is differnt then take that
        }
        return trappedRainWater;
    }

    public static void main(String args[]){
        int height[]={4,2,0,6,3,2,5};
        System.out.println("Amount of trapped water is "+trappedRainWater(height));
    }
}

