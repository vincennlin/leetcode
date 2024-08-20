package com.vincennlin.leetcode.dynamicprogramming.easy.climbingstairs;

public class Main {
    public static void main(String[] args) {
        Solution solution = new Solution();

        // 測試例子1
        int n1 = 2;
        System.out.println("n = " + n1 + " 的方法數: " + solution.climbStairs(n1));

        // 測試例子2
        int n2 = 3;
        System.out.println("n = " + n2 + " 的方法數: " + solution.climbStairs(n2));
    }
}
