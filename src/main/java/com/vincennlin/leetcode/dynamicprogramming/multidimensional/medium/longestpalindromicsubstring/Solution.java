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

        for (int interval = 1; interval < n; interval++) {
            for (int i = 0; i < n; i++) {
                int j = i + 1;
                while (j - i <= interval && j < n) {
                    if (s.charAt(i) == s.charAt(j) && (j - i == 1 || dp[i + 1][j - 1])) {
                        dp[i][j] = true;
                        ans = s.substring(i, j + 1);
                    }
                    j++;
                }
            }
        }

        return ans;
    }
}
