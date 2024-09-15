// package DP;

public class climbingStairs {
    // Pure recursion
    public static int countWaysRecursion(int n) {
        // Base cases
        if (n == 0) {
            return 1;
        }
        if (n < 0) {
            return 0;
        }
        // Recursive step
        return countWaysRecursion(n - 1) + countWaysRecursion(n - 2);
    }

    // Recursion with memoization
    public static int countWaysRecursionAndMemoization(int n, int dp[]) {
        // Base cases
        if (n == 0) {
            return 1;
        }
        if (n < 0) {
            return 0;
        }
        // Check memoized result
        if (dp[n] != -1) {
            return dp[n];
        }
        // Recursive step with memoization
        dp[n] = countWaysRecursionAndMemoization(n - 1, dp) + countWaysRecursionAndMemoization(n - 2, dp);
        return dp[n];
    }

    // Tabulation approach
    public static int countWaysTabulation(int n) {
        int dp[] = new int[n + 1];
        dp[0] = 1;

        // Tabulation loop
        for (int i = 1; i <= n; i++) {
            if (i == 1) {
                dp[i] = dp[i - 1];
            } else {
                dp[i] = dp[i - 1] + dp[i - 2];
            }
        }

        return dp[n];
    }

    public static void main(String[] args) {
        int n = 5;

        // Initialize memoization array
        int dp[] = new int[n + 1];
        for (int i = 0; i <= n; i++) {
            dp[i] = -1;
        }

        System.out.println("Count ways using pure recursion: " + countWaysRecursion(n));
        System.out.println("Count ways using recursion and memoization: " + countWaysRecursionAndMemoization(n, dp));
        System.out.println("Count ways using tabulation: " + countWaysTabulation(n));
    }
}
