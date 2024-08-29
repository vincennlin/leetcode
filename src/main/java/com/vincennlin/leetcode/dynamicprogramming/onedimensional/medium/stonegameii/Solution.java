package com.vincennlin.leetcode.dynamicprogramming.onedimensional.medium.stonegameii;
//1140
class Solution {
    public int stoneGameII(int[] piles) {
        int n = piles.length;
        int[][] dp = new int[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                dp[i][j] = 0;
            }
        }
        for (int i = n - 1; i >= 0; i--) {
            for (int m = 1; m < n; m++) {
                int maxStones = 0;
                int total = 0;
                for (int X = 1; X <= 2 * m && i + X <= n; X++) {
                    total += piles[i + X - 1];
                    maxStones = Math.max(maxStones, total - dp[i + X - 1][Math.max(m, X)]);
                }
                dp[i][m] = maxStones;
            }
        }
        return dp[0][1];
    }
}