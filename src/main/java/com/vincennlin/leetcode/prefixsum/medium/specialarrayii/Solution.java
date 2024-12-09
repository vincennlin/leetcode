package com.vincennlin.leetcode.prefixsum.medium.specialarrayii;

// 3152
class Solution {
    public boolean[] isArraySpecial(int[] nums, int[][] queries) {
        boolean[] result = new boolean[queries.length];
        int[] prefixSum = new int[nums.length];

        for (int i = 1; i < nums.length; i++) {
            prefixSum[i] = prefixSum[i - 1] + (nums[i] % 2 == nums[i - 1] % 2 ? 1 : 0);
        }

        for (int i = 0; i < queries.length; i++) {
            int[] query = queries[i];
            int start = query[0];
            int end = query[1];
            if (prefixSum[end] - prefixSum[start] == 0) {
                result[i] = true;
            }
        }

        return result;
    }
}