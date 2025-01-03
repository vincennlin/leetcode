package com.vincennlin.leetcode.prefixsum.medium.numberofwaystosplitarray;
// 2270
class Solution {
    public int waysToSplitArray(int[] nums) {
        long[] prefixSum = new long[nums.length];
        prefixSum[0] = nums[0];

        for (int i = 1; i < nums.length; i++) {
            prefixSum[i] = prefixSum[i - 1] + nums[i];
        }

        long sum = prefixSum[prefixSum.length - 1];
        int result = 0;

        for (int i = 0; i < nums.length - 1; i++) {
            if (prefixSum[i] >= sum - prefixSum[i]) {
                result++;
            }
        }

        return result;
    }
}