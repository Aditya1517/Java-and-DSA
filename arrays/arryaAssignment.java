// 1.Given an integer array nums, return true if any value appears at least twice in the array, and return false if every element is distinct

// public class arryaAssignment {

//     public static boolean repeatative(int nums[]){
//         for(int i=0;i<nums.length-1;i++){
//             for(int j=i+1;j<nums.length;j++){
//                 if(nums[i]==nums[j]){
//                     return true;
//                 }
//             }
//         }
//         return false;
//     }
//     public static void main(String args[]){
//         int nums[]={1,2,3,1};
//         System.out.println(repeatative(nums));
//     }
// }


// 2.There is an integer array nums sorted in ascending order (with distinct values).Prior to being passed to your function, nums is possibly rotated at an unknown pivot  index k (1  <=  k  <  nums.length)  such  that  the  resulting  array  is [nums[k], nums[k+1],   ...,   nums[n-1], nums[0],   nums[1],   ...,   nums[k-1]] (0-indexed).   For   example, [0,1,2,4,5,6,7] might        be        rotated        at        pivot        index 3   and become [4,5,6,7,0,1,2].Given the array nums after the possible rotation and an integer target, returnthe index oftarget if it is in nums, or -1   if it is not in nums.You must write an algorithm with O(log n) runtime complexity

// import java.util.*;

// public class arryaAssignment{
//     public static void rotatedArray(int nums[]){
//         Scanner sc = new Scanner(System.in);
//         System.out.println("Enter a element,around which you want to rotate array:-");
//         int target = sc.nextInt();

//     }
//     public static void main(String args[]){
//         int nums[]={4,5,6,7,0,1,2};
//         rotatedArray(nums);
//     }
// }


// 3.You  are  given  an  array prices where prices[i] is  the  price  of  a  given  stock  on  the ith day.Return the maximum profit you can achieve from this transaction. If you cannot achieve any profit, return 0

// public class arryaAssignment{
//     public static int bestTimeToBuySellStock(int price[]){
//         int buyPrice=Integer.MAX_VALUE;
//         int maxProfit=0;
//         for(int i=0;i<price.length;i++){
//             if(buyPrice<price[i]){
//                 int profit = price[i]-buyPrice;
//                 maxProfit = Math.max(maxProfit, profit);
//             }
//             else{
//                 buyPrice = price[i];
//             }
//         }
//         return maxProfit;
//     }
//     public static void main(String args[]){
//         int price[]={7,1,5,3,6,4};
//         System.out.println("Maximum profit you can get is "+bestTimeToBuySellStock(price));
//     }
// }


// 4.Given n non-negative integers representing an elevation map where the width of each bar is 1, compute how much water it can trap after raining

// public class arryaAssignment{
//     public static void trappedRainWater(int heights[]){

//         int leftmax[] = new int[heights.length];
//         leftmax[0]=heights[0];
//         for(int i=1;i<heights.length;i++){
//             leftmax[i]=Math.max(leftmax[i-1], heights[i]);
//         }

//         int rightmax[] = new int[heights.length];
//         rightmax[heights.length-1] = heights[heights.length-1];
//         for(int i=heights.length-2;i>=0;i--){
//             rightmax[i] = Math.max(rightmax[i+1], heights[i]);
//         }

//         int trappedRainWater = 0;
//         for(int i=0;i<heights.length;i++){
//             int waterlevel = Math.min(leftmax[i], rightmax[i]);
//             trappedRainWater = trappedRainWater + (waterlevel-heights[i]);
//         }
//         System.out.println("Water trapped is "+trappedRainWater+" units");
//     }
//     public static void main(String args[]){
//         int heights[]={0,1,0,2,1,0,1,3,2,1,2,1};
//         trappedRainWater(heights);
//     }
// }


// 5.Given an integer array nums, return all the triplets [nums[i], nums[j],  nums[k]] such that i != j, i != k, and j != k, and nums[i] + nums[j] + nums[k] == 0.Notice that the solution set must not contain duplicate triplets

public class arryaAssignment{
    public static void triplets(int nums[]){
        int tripletCount = 0;
        for(int i=0;i<nums.length;i++){
            for(int j=i+1;j<nums.length;j++){
                for(int k=j+1;k<nums.length;k++){
                    if(nums[i]+nums[j]+nums[k] == 0){
                        System.out.println("Tripelt is ["+nums[i]+","+nums[j]+","+nums[k]+"]");
                        tripletCount++;
                    }
                }
            }
        }
        System.out.println("Total tirplets found:- "+tripletCount);

    }
    public static void main(String args[]){
        int nums[] = {-1,0,1,2,-1,-4};
        triplets(nums);
    }
}

