package com.vincennlin.leetcode.dynamicprogramming.multidimensional.medium.besttimetobuyandsellstockwithtransactionfee;
// 714
class Solution {
    public int maxProfit(int[] prices, int fee) {
        int m = prices.length;
        int[][] dp = new int[m + 1][2];
        dp[0][0] = 0;
        dp[0][1] = -prices[0];

        for (int i = 1; i <= m; i++) {
            dp[i][0] = Math.max(dp[i - 1][0], dp[i - 1][1] + prices[i - 1] - fee);
            dp[i][1] = Math.max(dp[i - 1][1], dp[i - 1][0] - prices[i - 1]);
        }

        return Math.max(dp[m][0], dp[m][1]);
    }
}
