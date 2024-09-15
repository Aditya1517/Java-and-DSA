public class LCS {
    public static int lcsRecussion(String str1, String str2, int n, int m) {
        if (n == 0 || m == 0) {
            return 0;
        }

        if (str1.charAt(n - 1) == str2.charAt(m - 1)) {// if char is same
            return lcsRecussion(str1, str2, n - 1, m - 1) + 1;
        } else {// if char is diff
            int ans1 = lcsRecussion(str1, str2, n - 1, m);
            int ans2 = lcsRecussion(str1, str2, n, m - 1);

            return Math.max(ans1, ans2);
        }
    }

    public static int lcsRecussionAndMemoization(String str1, String str2, int n, int m, int dp[][]) {
        if (n == 0 || m == 0) {
            return 0;
        }

        if(dp[n][m] != -1){// means already calculated
            return dp[n][m];
        }

        if (str1.charAt(n - 1) == str2.charAt(m - 1)) {// if char is same
            return dp[n][m] = lcsRecussionAndMemoization(str1, str2, n - 1, m - 1, dp) + 1;
        } else {// if char is diff
            int ans1 = lcsRecussionAndMemoization(str1, str2, n - 1, m, dp);
            int ans2 = lcsRecussionAndMemoization(str1, str2, n, m - 1, dp);

            return dp[n][m] = Math.max(ans1, ans2);
        }
    }

    public static void main(String[] args) {
        String str1 = "abcdge";
        String str2 = "ace";

        System.out.println(lcsRecussion(str1, str2, str1.length(), str2.length()));

        int n=str1.length();
        int m=str2.length();

        int dp[][] = new int[n+1][m+1];

        for(int i=0;i<dp.length;i++){
            for(int j=0;j<dp[0].length;j++){
                dp[i][j] = -1;
            }
        }

        System.out.println(lcsRecussionAndMemoization(str1, str2, n, m, dp));
    }
}
