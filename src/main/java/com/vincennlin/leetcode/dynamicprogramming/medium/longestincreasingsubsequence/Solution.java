package com.vincennlin.leetcode.dynamicprogramming.medium.longestincreasingsubsequence;
// 300
class Solution {
    public int lengthOfLIS(int[] nums) {
        if (nums.length == 1) return 1;

        int[] dp = new int[nums.length];
        dp[0] = 10001;
        int length = 1;

        for (int num : nums) {
            int left = 0, right = length;
            while (left <= right) {
                int mid = left + (right - left) / 2;
                if (num > dp[mid]) {
                    left = mid + 1;
                } else {
                    right = mid - 1;
                }
            }
            if (left == length + 1) {
                dp[length] = num;
                length++;
            } else {
                dp[left] = num;
            }
        }

        return length;
    }
}
