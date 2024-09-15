// brute force

// public class maxSumSubarray {
//     public static void maxSubArray(int numbers[]){
//         int currSum = 0;
//         int maxSum = Integer.MIN_VALUE;
//         for(int i=0;i<numbers.length;i++){
//             int start=i;
//             for(int j=i;j<numbers.length;j++){
//                 int end=j;
//                 currSum=0;
//                 for(int k=start;k<=end;k++){
//                     currSum+=numbers[k];
//                 }
//                 System.out.print(currSum+" ");
//                 if(maxSum<currSum){
//                     maxSum=currSum;
//                 }
//             }
//         }
//         System.out.println();
//         System.out.println("The max sum is"+maxSum);
//     }
//     public static void main(String args[]){
//         int numbers[]={2,4,6,8,10};
//         maxSubArray(numbers);
//     }
// }

// time complexity is O(n^3)


// prefix method

// public class maxSumSubarray {
//     public static void maxSubArray(int numbers[]){
//         int currSum = 0;
//         int maxSum = Integer.MIN_VALUE;
        
//         // define prefix array
//         int prefix[] = new int[numbers.length];

//         prefix[0]=numbers[0];

//         // find the prefix sum
//         for(int i=1;i<prefix.length;i++){
//             prefix[i]=prefix[i-1]+numbers[i];
//         }

//         for(int i=0;i<numbers.length;i++){
//             int start=i;
//             for(int j=i;j<numbers.length;j++){
//                 int end=j;
//                 currSum= start==0 ? currSum=prefix[end] : prefix[end] - prefix[start-1];
                
//                 System.out.print(currSum+" ");
//                 if(maxSum<currSum){
//                     maxSum=currSum;
//                 }
//             }
//         }
//         System.out.println();
//         System.out.println("Max sum is "+maxSum);
//     }
//     public static void main(String args[]){
//         int numbers[]={2,4,6,8,10};
//         maxSubArray(numbers);
//     }
// }

// time complexity is O(n^2)


// kadane's algo (VVVIMP)

public class maxSumSubarray{

    public static boolean isAllNegative(int numbers[]){
        for(int i=0;i<numbers.length;i++){
            if(numbers[i]>0){
                return false;
            }
        }
        return true;                                   
    }

    public static void maxSubArray(int numbers[]){
        int maxSum = Integer.MIN_VALUE;
        int currSum = 0;

        if(isAllNegative(numbers)){
            int maxNegNum = numbers[0];
            for(int i=0;i<numbers.length;i++){
                if(maxNegNum<numbers[i]){
                    maxNegNum=numbers[i];
                }                                                                                                                               
            }
            System.out.println("Max sum is "+maxNegNum);
        }
        else{
            for(int i=0;i<numbers.length;i++){
            currSum=currSum+numbers[i];
            if(currSum<0){
                currSum=0;
            }
            maxSum=Math.max(maxSum, currSum);
        }
        System.out.println("Max sum is "+maxSum);
        }
        
    }
        public static void main(String args[]){
        int numbers[]={2,4,6,8,10};
        maxSubArray(numbers);
    }
}