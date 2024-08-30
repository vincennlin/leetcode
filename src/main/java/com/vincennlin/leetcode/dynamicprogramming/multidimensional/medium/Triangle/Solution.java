package com.vincennlin.leetcode.dynamicprogramming.multidimensional.medium.Triangle;

import java.util.List;

// 120
class Solution {
    public int minimumTotal(List<List<Integer>> triangle) {
        int size = triangle.size();
        int[][] dp = new int[size][];
        int[] minPath = new int[size];
        dp[0] = new int[1];
        dp[0][0] = triangle.get(0).get(0);
        minPath[0] = dp[0][0];
        for (int i = 1; i < size; i++) minPath[i] = 10001;

        for (int i = 0; i < size - 1; i++) {
            dp[i + 1] = new int[i + 2];
            for (int j = 0; j <= i + 1; j++) {
                dp[i + 1][j] = 10001;
            }
            for (int j = 0; j <= i; j++) {
                dp[i + 1][j] = Math.min(dp[i + 1][j], dp[i][j] + triangle.get(i + 1).get(j));
                dp[i + 1][j + 1] = Math.min(dp[i + 1][j + 1], dp[i][j] + triangle.get(i + 1).get(j + 1));
                minPath[i + 1] = Math.min(minPath[i + 1], Math.min(dp[i + 1][j], dp[i + 1][j + 1]));
            }
        }

        return minPath[size - 1];
    }
}
