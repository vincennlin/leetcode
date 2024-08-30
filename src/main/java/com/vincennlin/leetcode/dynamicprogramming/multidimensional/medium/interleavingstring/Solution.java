package com.vincennlin.leetcode.dynamicprogramming.multidimensional.medium.interleavingstring;
// 97
class Solution {
    public boolean isInterleave(String s1, String s2, String s3) {
        int m = s1.length();
        int n = s2.length();
        int k = s3.length();
        if (m == 0 || n == 0) {
            return s3.equals(s1) || s3.equals(s2);
        } else if (k != m + n) {
            return false;
        }

        boolean[][] dp = new boolean[m + 1][n + 1];
        dp[0][0] = true;

        for (int i = 1; i <= m; i++) {
            dp[i][0] = s1.substring(0, i).equals(s3.substring(0, i));
        }
        for (int j = 1; j <= n; j++) {
            dp[0][j] = s2.substring(0, j).equals(s3.substring(0, j));
        }

        for (int i = 1; i <= m; i++) {
            for (int j = 1; j <= n; j++) {
                dp[i][j] = (dp[i][j - 1] && s2.charAt(j - 1) == s3.charAt(i + j - 1)) || (dp[i - 1][j] && s1.charAt(i - 1) == s3.charAt(i + j - 1));
            }
        }

        return dp[m][n];
    }
}
