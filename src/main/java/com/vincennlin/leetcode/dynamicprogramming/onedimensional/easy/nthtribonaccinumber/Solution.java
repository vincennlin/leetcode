package com.vincennlin.leetcode.dynamicprogramming.onedimensional.easy.nthtribonaccinumber;
// 1137
class Solution {
    public int tribonacci(int n) {
        if (n < 1) {
            return 0;
        } else if (n < 3) {
            return 1;
        }
        int first = 0;
        int second = 1;
        int third = 1;
        int current = first + second + third;

        for (int i = 0; i < n - 3; i++) {
            first = second;
            second = third;
            third = current;
            current = first + second + third;
        }

        return current;
    }
}