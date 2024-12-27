package com.vincennlin.leetcode.dynamicprogramming.multidimensional.medium.bestsightseeingpair;

import java.util.Arrays;

// 1014
class Solution {
    public int maxScoreSightseeingPair(int[] values) {
        int n = values.length;
        int[][] dp = new int[n][];

        for (int row = 0; row < dp.length; row++) {
            dp[row] = new int[n];
            Arrays.fill(dp[row], Integer.MIN_VALUE);
        }

        for (int i = 1; i <= n - 1; i++) {
            for (int j = i + 1; j <= n; j++) {
                dp[i][j - 1] = Math.max(values[i - 1] + values[j - 1] - (j - i), Math.max(dp[i - 1][j - 1], dp[i][j - 2]));
            }
        }

        return dp[n - 1][n - 1];
    }
}