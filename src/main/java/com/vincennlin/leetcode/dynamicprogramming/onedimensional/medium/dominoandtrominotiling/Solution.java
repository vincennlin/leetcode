package com.vincennlin.leetcode.dynamicprogramming.onedimensional.medium.dominoandtrominotiling;
// 790
class Solution {
    public int numTilings(int n) {
        if (n == 1) return 1;
        long[] dp = new long[n + 1];
        dp[0] = 1;
        dp[1] = 2;
        dp[2] = 5;

        for (int i = 3; i < n; i++) {
            dp[i] = (dp[i - 1] * 2 + dp[i - 3]) % ((long)Math.pow(10, 9) + 7);
        }

        return (int)dp[n - 1];
    }
}