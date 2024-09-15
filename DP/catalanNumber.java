import java.util.*;

public class catalanNumber {
    public static int catalanNumberRecurssion(int n){
        if(n==0 || n==1){
            return 1;
        }

        int ans=0;


        for(int i=0;i<=n-1;i++){
            ans += catalanNumberRecurssion(i)*catalanNumberRecurssion(n-i-1);
        }

        return ans;
    }
    
    public static int catalanNumberMemoization(int n,int dp[]){
        if(n==0 || n==1){
            return 1;
        }

        int ans=0;

        
        if(dp[n] != -1){
            return dp[n];
        }

        for(int i=0;i<=n-1;i++){
            ans += catalanNumberMemoization(i,dp)*catalanNumberMemoization(n-i-1,dp);
        }

        return dp[n]=ans;
    }
    public static void main(String[] args) {
        int n=10;

        // System.out.println(catalanNumberRecurssion(n));

        int dp[]=new int[n+1];
        Arrays.fill(dp, -1);

        System.out.println(catalanNumberMemoization(n, dp));
    }
}
