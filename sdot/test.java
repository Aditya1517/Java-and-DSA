/* package whatever; // don't place package name! */

package sdot;

import java.util.*;
import java.lang.*;
import java.io.*;

public class test {
    public static boolean isMatch(String pattern, String input_str) {
        int n = pattern.length();
        int m = input_str.length();

        boolean[][] dp = new boolean[m + 1][n + 1];
        dp[0][0] = true;

        for (int i = 1; i <= m; i++) {
            char p = pattern.charAt(i - 1);
            if (p == '*') {
                dp[i][0] = dp[i - 1][0];
            }
            for (int j = 1; j <= n; j++) {
                char s = input_str.charAt(j - 1);
                if (p == '*' || p == '?') {
                    dp[i][j] = dp[i - 1][j] || dp[i][j - 1];
                } else if (p == s) {
                    dp[i][j] = dp[i - 1][j - 1];
                }
            }
        }

        return dp[m][n];
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String pattern =  sc.nextLine();
        String inpuString = sc.nextLine();
        System.out.println(isMatch(pattern, inpuString));
    }
}
