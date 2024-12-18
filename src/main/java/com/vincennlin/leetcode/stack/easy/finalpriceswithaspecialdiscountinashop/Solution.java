package com.vincennlin.leetcode.stack.easy.finalpriceswithaspecialdiscountinashop;

import java.util.ArrayDeque;
import java.util.Deque;

// 1475
class Solution {
    public int[] finalPrices(int[] prices) {
        Deque<Integer> stack = new ArrayDeque<>();

        for (int i = 0; i < prices.length; i++) {
            int price = prices[i];
            while (!stack.isEmpty() && price <= prices[stack.peek()]) {
                prices[stack.pop()] -= price;
            }
            stack.push(i);
        }

        return prices;
    }
}