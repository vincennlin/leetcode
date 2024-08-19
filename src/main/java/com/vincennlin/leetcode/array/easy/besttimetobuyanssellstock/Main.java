package com.vincennlin.leetcode.array.easy.besttimetobuyanssellstock;

public class Main {

    public static void main(String[] args) {
        Solution solution = new Solution();

        // Example 1: prices = [7,1,5,3,6,4]
        int[] prices1 = {7, 1, 5, 3, 6, 4};
        System.out.println(solution.maxProfit(prices1)); // 應該輸出 5

        // Example 2: prices = [7,6,4,3,1]
        int[] prices2 = {7, 6, 4, 3, 1};
        System.out.println(solution.maxProfit(prices2)); // 應該輸出 0
    }
}

