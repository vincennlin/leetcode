package com.vincennlin.leetcode.dynamicprogramming.multidimensional.medium.besttimetobuyandsellstockwithtransactionfee;
// 714
class Solution {
    public int maxProfit(int[] prices, int fee) {
        int m = prices.length;
        int sold = 0;
        int owned = -prices[0];
        int currentSell = 0;
        int currentOwn = 0;

        for (int i = 0; i < m; i++) {
            currentSell = Math.max(sold, owned + prices[i] - fee);
            currentOwn = Math.max(owned, sold - prices[i]);
            sold = currentSell;
            owned = currentOwn;
        }

        return Math.max(currentSell, currentOwn);
    }
}
