package com.vincennlin.leetcode.bit.medium.maximumxorforeachquery;
/*
// 1829
 */
class Solution {
    public int[] getMaximumXor(int[] nums, int maximumBit) {
        int n = nums.length;
        int[] result = new int[n];
        int maximum = (int) Math.pow(2, maximumBit) - 1;

        for (int i = 0; i < n; i++) {
            maximum ^= nums[i];
            result[n - (i + 1)] = maximum;
        }

        return result;
    }
}
