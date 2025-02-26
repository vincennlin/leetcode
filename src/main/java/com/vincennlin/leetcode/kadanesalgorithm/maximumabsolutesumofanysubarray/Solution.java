package com.vincennlin.leetcode.kadanesalgorithm.maximumabsolutesumofanysubarray;
// 1749
class Solution {
    public int maxAbsoluteSum(int[] nums) {
        return Math.max(Math.abs(getMaxSum(nums)), Math.abs(getMinSum(nums)));
    }

    private int getMaxSum(int[] nums) {
        int currSum = nums[0];
        int maxSum = nums[0];

        for (int i = 1; i < nums.length; i++) {
            currSum = Math.max(currSum + nums[i], nums[i]);
            maxSum = Math.max(maxSum, currSum);
        }

        return maxSum;
    }

    private int getMinSum(int[] nums) {
        int currSum = nums[0];
        int minSum = nums[0];

        for (int i = 1; i < nums.length; i++) {
            currSum = Math.min(currSum + nums[i], nums[i]);
            minSum = Math.min(minSum, currSum);
        }

        return minSum;
    }
}