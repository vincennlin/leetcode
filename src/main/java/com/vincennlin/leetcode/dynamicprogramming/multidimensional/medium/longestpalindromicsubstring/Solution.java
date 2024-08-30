package com.vincennlin.leetcode.dynamicprogramming.multidimensional.medium.longestpalindromicsubstring;
// 5
class Solution {
    public String longestPalindrome(String s) {
        int n = s.length();
        if (n == 1) return s;

        boolean[][] dp = new boolean[n][n];
        String ans = s.substring(0, 1);

        for (int i = 0; i < n; i++) {
            dp[i][i] = true;
        }

        for (int i = 0; i < n - 1; i++) {
            if (s.charAt(i) == s.charAt(i + 1)) {
                dp[i][i + 1] = true;
                ans = s.substring(i, i + 2);
            }
        }

        for (int length = 3; length <= n; length++) {
            for (int i = 0; i <= n - length; i++) {
                int j = i + length - 1;
                if (s.charAt(i) == s.charAt(j) && dp[i + 1][j - 1]) {
                    dp[i][j] = true;
                    ans = s.substring(i, j + 1);
                }
            }
        }

        return ans;
    }
}
