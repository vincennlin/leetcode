package com.vincennlin.leetcode.array.easy.maximumascendingsubarraysum;
// 1800
class Solution {
    public int maxAscendingSum(int[] nums) {
        int maxSum = nums[0];
        int curSum = nums[0];

        for (int i = 1; i < nums.length; i++) {
            if (nums[i] > nums[i - 1]) {
                curSum += nums[i];
            } else {
                curSum = nums[i];
            }
            maxSum = Math.max(maxSum, curSum);
        }

        return maxSum;
    }
}