package com.vincennlin.leetcode.slidingwindow.easy.maximumaveragesubarrayi;

// 643
class Solution {
    public double findMaxAverage(int[] nums, int k) {
        double sum = 0;
        for (int i = 0; i < k; i++) {
            sum += nums[i];
        }

        double maxSum = sum;

        for (int end = k; end < nums.length; end++) {
            sum = sum + nums[end] - nums[end - k];
            maxSum = Math.max(sum, maxSum);
        }

        return maxSum / k;
    }
}
