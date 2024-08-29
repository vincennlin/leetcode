package com.vincennlin.leetcode.dynamicprogramming.medium.longestincreasingsubsequence;
// 300
class Solution {
    public int lengthOfLIS(int[] nums) {
        if (nums.length == 1) return 1;

        int[] dp = new int[nums.length];
        int length = 0;

        for (int num : nums) {
            int left = 0, right = length;
            while (left < right) {
                int mid = left + (right - left) / 2;
                if (num > dp[mid]) {
                    left = mid + 1;
                } else {
                    right = mid;
                }
            }
            dp[left] = num;
            if (left == length) {
                length++;
            }
        }

        return length;
    }
}
