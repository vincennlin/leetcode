package com.vincennlin.leetcode.array.easy.besttimetobuyanssellstock;
//121
class Solution {
    public int maxProfit(int[] prices) {
        int maxProfit = 0;
        int minPrice = prices[0];
        for (int i = 1; i < prices.length; i++) {
            if (prices[i] - minPrice > maxProfit) {
                maxProfit = prices[i] - minPrice;
            } else if (minPrice > prices[i]) {
                minPrice = prices[i];
            }
        }
        return maxProfit;
    }
}