package com.vincennlin.leetcode.dynamicprogramming.onedimensional.medium.stonegameii;

public class Main {
    public static void main(String[] args) {
        Solution solution = new Solution();

        int[] piles1 = new int[]{2, 7, 9, 4, 4};
        System.out.println(solution.stoneGameII(piles1));//10

        int[] piles2 = new int[]{1, 2, 3, 4, 5, 100};
        System.out.println(solution.stoneGameII(piles2));//104
    }
}
