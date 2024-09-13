package com.vincennlin.leetcode.dynamicprogramming.multidimensional.medium.besttimetobuyandsellstockwithtransactionfee;
// 714
class Solution {
    public int maxProfit(int[] prices, int fee) {
        int own = Integer.MIN_VALUE;
        int sell = 0;

        for (int price : prices) {
            own = Math.max(own, sell - price);
            sell = Math.max(sell, own + price - fee);
        }

        return sell;
    }
}

