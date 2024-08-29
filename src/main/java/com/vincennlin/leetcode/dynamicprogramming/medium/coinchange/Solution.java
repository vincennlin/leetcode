package com.vincennlin.leetcode.dynamicprogramming.medium.coinchange;
//322
class Solution {
    public int coinChange(int[] coins, int amount) {
        if (amount == 0) return 0;
        int[] dp = new int[amount + 1];
        dp[0] = 0;

        for (int i = 1; i <= amount; i++) {
            dp[i] = Integer.MAX_VALUE;
            for (int coin : coins) {
                if ((coin < i && dp[i - coin] != 0) || coin == i) {
                    dp[i] = Math.min(dp[i - coin] + 1, dp[i]);
                }
            }
            if (dp[i] == Integer.MAX_VALUE) dp[i] = 0;
        }

        return dp[amount] == 0 ? -1 : dp[amount];
    }
}
