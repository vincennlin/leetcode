package com.vincennlin.leetcode.dynamicprogramming.multidimensional.medium.lengthoflongestfibonaccisubsequence;
// 873
class Solution {
    public int lenLongestFibSubseq(int[] arr) {
        int n = arr.length;
        int[][] dp = new int[n][n];
        int maxLen = 0;

        for (int curr = 2; curr < n; curr++) {
            int num = arr[curr];
            int start = 0;
            int end = curr - 1;

            while (start < end) {
                if (arr[start] + arr[end] > num) {
                    end--;
                } else if (arr[start] + arr[end] < num) {
                    start++;
                } else {
                    dp[end][curr] = dp[start][end] + 1;
                    maxLen = Math.max(maxLen, dp[end][curr]);

                    end--;
                    start++;
                }
            }
        }

        return maxLen > 0 ? maxLen + 2 : 0;
    }
}